package com.example.demo.mappers;

import org.springframework.stereotype.Component;

import com.example.demo.dtos.ProductRequestDto;
import com.example.demo.dtos.ProductResponseDto;
import com.example.demo.models.ProductEntity;

@Component
public class ProductMapper {
    public ProductResponseDto toDto(ProductEntity productEntity) {
        return new ProductResponseDto(productEntity.getId() ,productEntity.getName(), productEntity.getPrice());
    }

    public ProductEntity toEntity(ProductRequestDto productRequestDto) {
        return ProductEntity.builder()
        .name(productRequestDto.name())
        .price(productRequestDto.price())
        .build();
    }
}
