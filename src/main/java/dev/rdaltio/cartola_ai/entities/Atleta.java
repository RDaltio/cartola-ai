package dev.rdaltio.cartola_ai.entities;

import dev.rdaltio.cartola_ai.utils.Posicoes;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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
}
