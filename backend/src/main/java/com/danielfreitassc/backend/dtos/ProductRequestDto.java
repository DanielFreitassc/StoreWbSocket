package com.danielfreitassc.backend.dtos;

import java.math.BigDecimal;

public record ProductRequestDto(
    String name,
    String description,
    BigDecimal price
) {
    
}
