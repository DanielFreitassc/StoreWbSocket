package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.ProductRequestDto;
import com.example.demo.dtos.ProductResponseDto;
import com.example.demo.services.ProductService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("products")
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductResponseDto> create(@RequestBody @Valid ProductRequestDto productDTO) {
        return productService.create(productDTO);
    }

    @GetMapping("{id}")
    public ResponseEntity<ProductResponseDto> getById(@PathVariable Long id) {
       return productService.getById(id);
    }

    @GetMapping
    public ResponseEntity<List<ProductResponseDto>> getAll() {
        return productService.getAll();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<ProductResponseDto> delete(@PathVariable Long id) {
        return productService.delete(id);
    }

    @PutMapping("{id}")
    public ResponseEntity<ProductResponseDto> update(@PathVariable Long id, @RequestBody @Valid ProductRequestDto productDTO) {
        return productService.update(id, productDTO);
    }
} 
