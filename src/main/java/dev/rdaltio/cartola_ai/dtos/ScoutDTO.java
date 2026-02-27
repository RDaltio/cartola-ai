package dev.rdaltio.cartola_ai.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ScoutDTO(
        @JsonProperty("DS")
        Integer ds,
        @JsonProperty("G")
        Integer g,
        @JsonProperty("A")
        Integer a,
        @JsonProperty("SG")
        Integer sg,
        @JsonProperty("FS")
        Integer fs,
        @JsonProperty("FF")
        Integer ff,
        @JsonProperty("FD")
        Integer fd,
        @JsonProperty("FT")
        Integer ft,
        @JsonProperty("PS")
        Integer ps,
        @JsonProperty("DE")
        Integer de,
        @JsonProperty("DP")
        Integer dp,
        @JsonProperty("GC")
        Integer gc,
        @JsonProperty("CV")
        Integer cv,
        @JsonProperty("CA")
        Integer ca,
        @JsonProperty("GS")
        Integer gs,
        @JsonProperty("PP")
        Integer pp,
        @JsonProperty("PC")
        Integer pc,
        @JsonProperty("FC")
        Integer fc
) {}
