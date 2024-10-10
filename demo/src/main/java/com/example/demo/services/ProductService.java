package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.dtos.ProductRequestDto;
import com.example.demo.dtos.ProductResponseDto;
import com.example.demo.mappers.ProductMapper;
import com.example.demo.models.ProductEntity;
import com.example.demo.repositories.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;


    public ResponseEntity<ProductResponseDto> create(ProductRequestDto productDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productMapper.toDto(productRepository.save(productMapper.toEntity(productDTO))));
    }
    
    public ResponseEntity<List<ProductResponseDto>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(productRepository.findAll().stream().map(productMapper::toDto).toList());
    }

    public ResponseEntity<ProductResponseDto> getById(Long id) {
        Optional<ProductEntity> product = productRepository.findById(id);
        if(product.isEmpty()) throw  new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum produto com este ID");
        return ResponseEntity.status(HttpStatus.OK).body(productMapper.toDto(product.get()));
    }

    public ResponseEntity<ProductResponseDto> update(Long id, ProductRequestDto productDTO) {
        Optional<ProductEntity> product = productRepository.findById(id);
        if(product.isEmpty()) throw  new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum produto com este ID");
        ProductEntity productEntity = product.get();
        productEntity.setId(id);
        productRepository.save(productEntity);
        return ResponseEntity.status(HttpStatus.OK).body(productMapper.toDto(productEntity));
    }

    public ResponseEntity<ProductResponseDto> delete(Long id) {
        Optional<ProductEntity> product = productRepository.findById(id);
        if(product.isEmpty()) throw  new ResponseStatusException(HttpStatus.NOT_FOUND,"Nenhum produto com este ID");
        productRepository.delete(product.get());
        return ResponseEntity.status(HttpStatus.OK).body(productMapper.toDto(product.get()));
    }
}
