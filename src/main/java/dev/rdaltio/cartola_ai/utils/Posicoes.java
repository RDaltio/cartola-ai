package dev.rdaltio.cartola_ai.utils;

public enum Posicoes {
    GOLEIRO(1, "Goleiro", "gol"),
    LATERAL(2, "Lateral", "lat"),
    ZAGUEIRO(3, "Zagueiro", "zag"),
    MEIA(4, "Meia", "mei"),
    ATACANTE(5, "Atacante", "ata"),
    TECNICO(6, "Técnico", "tec");

    private final Integer id;
    private final String nome;
    private final String abreviacao;

    Posicoes(Integer id, String nome, String abreviacao) {
        this.id = id;
        this.nome = nome;
        this.abreviacao = abreviacao;
    }

    public Integer getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getAbreviacao() {
        return abreviacao;
    }

    public static Posicoes fromId(Integer id) {
        for (Posicoes posicoes : values()) {
            if (posicoes.getId().equals(id)) {
                return posicoes;
            }
        }
        throw new IllegalArgumentException("Nenhum posicao encontrada");
    }
}
