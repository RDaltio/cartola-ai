package dev.rdaltio.cartola_ai.utils;

public enum StatusAtleta {
    DUVIDA(2, "Dúvida"),
    SUSPENSO(3, "Suspenso"),
    CONTUNDIDO(5, "Contundido"),
    NULO(6, "Nulo"),
    PROVAVEL(7, "Provável");

    private final Integer id;
    private final String nome;

    StatusAtleta(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }

    public static StatusAtleta fromId(Integer id) {
        for (StatusAtleta status : values()) {
            if (status.getId().equals(id)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Nenhum status encontrado");
    }
}
