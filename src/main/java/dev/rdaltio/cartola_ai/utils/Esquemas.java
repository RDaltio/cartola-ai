package dev.rdaltio.cartola_ai.utils;

public enum Esquemas {
    E_3_4_3(1, "3-4-3", 0, 3, 4, 3),
    E_3_5_2(2, "3-5-2", 0, 3, 5, 2),
    E_4_3_3(3, "4-3-3", 2, 2, 3, 3),
    E_4_4_2(4, "4-4-2", 2, 2, 4, 2),
    E_4_5_1(5, "4-5-1", 2, 2, 5, 1),
    E_5_3_2(6, "5-3-2", 2, 3, 3, 2),
    E_5_4_1(7, "5-4-1", 2, 3, 4, 1);

    private final Integer id;
    private final String nome;

    private final Integer qtdGoleiro = 1;
    private final Integer qtdTecnico = 1;

    private final Integer qtdLateral;
    private final Integer qtdZagueiro;
    private final Integer qtdMeia;
    private final Integer qtdAtacante;

    Esquemas(Integer id, String nome, Integer qtdLateral, Integer qtdZagueiro, Integer qtdMeia, Integer qtdAtacante) {
        this.id = id;
        this.nome = nome;
        this.qtdLateral = qtdLateral;
        this.qtdZagueiro = qtdZagueiro;
        this.qtdMeia = qtdMeia;
        this.qtdAtacante = qtdAtacante;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQtdGoleiro() {
        return qtdGoleiro;
    }

    public Integer getQtdTecnico() {
        return qtdTecnico;
    }

    public Integer getQtdLateral() {
        return qtdLateral;
    }

    public Integer getQtdZagueiro() {
        return qtdZagueiro;
    }

    public Integer getQtdMeia() {
        return qtdMeia;
    }

    public Integer getQtdAtacante() {
        return qtdAtacante;
    }

    public static Esquemas fromId(Integer id) {
        for (Esquemas esquemas : values()) {
            if (esquemas.getId().equals(id)) {
                return esquemas;
            }
        }
        throw new IllegalArgumentException("Nenhum esquema encontrado");
    }

    public Integer getQuantidade(Posicoes posicao) {
        return switch (posicao) {
            case GOLEIRO -> this.qtdGoleiro;
            case ZAGUEIRO -> this.qtdZagueiro;
            case LATERAL -> this.qtdLateral;
            case MEIA -> this.qtdMeia;
            case ATACANTE -> this.qtdAtacante;
            case TECNICO -> this.qtdTecnico;
        };
    }
}