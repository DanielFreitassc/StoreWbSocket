package com.danielfreitassc.backend.services;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.danielfreitassc.backend.dtos.IdRequestDto;
import com.danielfreitassc.backend.dtos.MessageResponseDto;
import com.danielfreitassc.backend.dtos.ProductRequestDto;
import com.danielfreitassc.backend.dtos.ProductResponseDto;
import com.danielfreitassc.backend.dtos.ProductUpdateRequestDto;
import com.danielfreitassc.backend.mappers.ProductMapper;
import com.danielfreitassc.backend.models.ProductEntity;
import com.danielfreitassc.backend.repositories.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductResponseDto create(ProductRequestDto productRequestDto) {
        return productMapper.toDto(productRepository.save(productMapper.toEntity(productRequestDto)));
    }

    public MessageResponseDto delete(IdRequestDto idRequstDto) {
        ProductEntity productEntity = checkId(idRequstDto);
        productRepository.delete(productEntity);
        return new MessageResponseDto("Produto removido com sucesso");
    }

    public ProductResponseDto update(ProductUpdateRequestDto productUpdateRequestDto) {
        ProductEntity productEntity = checkId(new IdRequestDto(productUpdateRequestDto.id()));
        productEntity = productMapper.toUpdateEntity(productUpdateRequestDto);
        productEntity.setId(productUpdateRequestDto.id());
        return productMapper.toDto(productRepository.save(productEntity));
    }

    public ProductEntity checkId(IdRequestDto idRequestDto) {
        Optional<ProductEntity> product = productRepository.findById(idRequestDto.id());
        if(product.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Produto não encontrado");
        return product.get();
    }
}
