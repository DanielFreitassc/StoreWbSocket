package com.danielfreitassc.backend.dtos;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotNull;

public record ProductUpdateRequestDto(
    @NotNull(message = "ID do produto é necessario")
    Long id,
    String name,
    String description,
    BigDecimal price
) {
    
}
