package dev.rdaltio.cartola_ai.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public record EscudoDTO(
        @JsonProperty("60x60")
        String s60x60
) {}
