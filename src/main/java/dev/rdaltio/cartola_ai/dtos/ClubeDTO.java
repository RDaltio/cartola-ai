package dev.rdaltio.cartola_ai.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ClubeDTO (
        Integer id,
        @JsonProperty("nome_fantasia")
        String nomeFantasia,
        String abreviacao,
        EscudoDTO escudos
) {}
