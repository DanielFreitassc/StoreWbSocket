package com.danielfreitassc.backend.services;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.danielfreitassc.backend.dtos.MessageResponseDto;
import com.danielfreitassc.backend.dtos.ProductRequestDto;
import com.danielfreitassc.backend.dtos.ProductResponseDto;
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

    public MessageResponseDto delete(Long id) {
        ProductEntity productEntity = checkId(id);
        productRepository.delete(productEntity);
        return new MessageResponseDto("Produto removido com sucesso");
    }

    public ProductEntity checkId(Long id) {
        Optional<ProductEntity> product = productRepository.findById(id);
        if(product.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Produto não encontrado");
        return product.get();
    }
}
