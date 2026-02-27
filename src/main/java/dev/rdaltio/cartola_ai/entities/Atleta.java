package dev.rdaltio.cartola_ai.entities;

import dev.rdaltio.cartola_ai.utils.Posicoes;
import dev.rdaltio.cartola_ai.utils.StatusAtleta;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_atleta")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Atleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String apelido;
    private String fotoUrl;
    @Enumerated(EnumType.STRING)
    private Posicoes posicao;
    @ManyToOne
    private Clube clube;
    private Integer externalId;
    private BigDecimal preco;
    private BigDecimal media;
    @Enumerated(EnumType.STRING)
    private StatusAtleta status;
    @Embedded
    private Scout scout;
    private Integer jogosNum;
}
