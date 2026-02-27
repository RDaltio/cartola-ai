package dev.rdaltio.cartola_ai.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public record AtletaDTO(
        @JsonProperty("atleta_id")
        Integer atleta_id,
        String apelido,
        String foto,
        @JsonProperty("preco_num")
        BigDecimal preco,
        @JsonProperty("media_num")
        BigDecimal media,
        @JsonProperty("jogos_num")
        Integer jogosNum,
        @JsonProperty("posicao_id")
        Integer posicaoId,
        @JsonProperty("clube_id")
        Integer clubeId,
        @JsonProperty("status_id")
        Integer statusId,
        ScoutDTO scout
) {}
