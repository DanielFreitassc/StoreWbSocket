package com.example.demo.services;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dtos.ProductDTO;
import com.example.demo.models.ProductEntity;
import com.example.demo.repositories.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
   
    public ResponseEntity<ProductDTO> create(ProductDTO productDTO) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setName(productDTO.getName());
        productEntity.setPrice(productDTO.getPrice());
        productRepository.save(productEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(productDTO);
    }
    
    public ResponseEntity<List<ProductDTO>> getAll() {
        List<ProductEntity> productEntities = productRepository.findAll();

        if(productEntities.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.emptyList());
        }

        List<ProductDTO> productDTOs = productEntities.stream().map(productEntity -> {
            ProductDTO productDTO = new ProductDTO();
            productDTO.setName(productEntity.getName());
            productDTO.setPrice(productEntity.getPrice());
            return productDTO;
        }).collect(Collectors.toList());

        return ResponseEntity.status(HttpStatus.OK).body(productDTOs);
    }

    public ResponseEntity<ProductDTO> getById(Long id) {
        Optional<ProductEntity> product = productRepository.findById(id);
        
        if(product.isEmpty()) {
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ProductDTO("Nenhum produto com este ID",0.0));
        }

        ProductEntity productEntity = product.get();
        ProductDTO productDTO = new ProductDTO();
        productDTO.setName(productEntity.getName());
        productDTO.setPrice(productEntity.getPrice());
        return ResponseEntity.status(HttpStatus.OK).body(productDTO);
    }

    public ResponseEntity<ProductDTO> update(Long id, ProductDTO productDTO) {
        Optional<ProductEntity> product = productRepository.findById(id);
        if(product.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ProductDTO("Nenhum produto com este ID",0.0));
        }
        ProductEntity productEntity = product.get();
        productEntity.setName(productDTO.getName());
        productEntity.setPrice(productDTO.getPrice());
        productRepository.save(productEntity);
        return ResponseEntity.status(HttpStatus.OK).body(productDTO);
    }

    public ResponseEntity<ProductDTO> delete(Long id) {
        Optional<ProductEntity> product = productRepository.findById(id);
        if(product.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ProductDTO("Nenhum produto com este ID",0.0));
        }
        ProductEntity productEntity = product.get();
        ProductDTO productDTO = new ProductDTO();
        productRepository.delete(product.get());
        productDTO.setName(productEntity.getName());
        productDTO.setPrice(productEntity.getPrice());
        return ResponseEntity.status(HttpStatus.OK).body(productDTO);
    }
}
