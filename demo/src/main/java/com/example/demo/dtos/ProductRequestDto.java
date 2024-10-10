package com.example.demo.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductRequestDto(
     @NotBlank(message = "Campo nome não pode ser nulo ou vazio")
     String name,
     @NotNull(message = "Campo preço não pode ser nulo")
     Double price
){}
