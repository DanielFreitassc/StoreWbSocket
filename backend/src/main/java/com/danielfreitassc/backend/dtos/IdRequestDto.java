package com.danielfreitassc.backend.dtos;

import jakarta.validation.constraints.NotNull;

public record IdRequestDto(
    @NotNull(message = "ID do produto é necessario")
    Long id
) {
    
}
