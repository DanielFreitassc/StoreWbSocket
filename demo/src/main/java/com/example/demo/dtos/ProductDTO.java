package com.example.demo.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDTO{
     @NotBlank(message = "Campo nome não pode ser nulo ou vazio")
     private String name;
     @NotNull(message = "Campo preço não pode ser nulo")
     private Double price;
    
}
