package com.danielfreitassc.backend.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.danielfreitassc.backend.dtos.IdRequestDto;
import com.danielfreitassc.backend.dtos.MessageResponseDto;
import com.danielfreitassc.backend.dtos.ProductRequestDto;
import com.danielfreitassc.backend.dtos.ProductResponseDto;
import com.danielfreitassc.backend.dtos.ProductUpdateRequestDto;
import com.danielfreitassc.backend.services.ProductService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @MessageMapping("/new-product")
    @SendTo("/topics/products")
    public ProductResponseDto create(@RequestBody @Valid ProductRequestDto productRequestDto) {
        return productService.create(productRequestDto);
    }

    @MessageMapping("/remove-product")
    @SendTo("/topics/products")
    public MessageResponseDto delete(@RequestBody @Valid IdRequestDto idRequestDto) {
        return productService.delete(idRequestDto);
    }
    
    @MessageMapping("/update-product")
    @SendTo("/topics/products")
    public ProductResponseDto update(@RequestBody @Valid ProductUpdateRequestDto productUpdateRequestDto) {
        return productService.update(productUpdateRequestDto);
    }
}
