package dev.rdaltio.cartola_ai.entities;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Scout {

    private Integer ds = 0;
    private Integer g = 0;
    private Integer a = 0;
    private Integer sg = 0;
    private Integer fs = 0;
    private Integer ff = 0;
    private Integer fd = 0;
    private Integer ft = 0;
    private Integer ps = 0;
    private Integer de = 0;
    private Integer dp = 0;
    private Integer gc = 0;
    private Integer cv = 0;
    private Integer ca = 0;
    private Integer gs = 0;
    private Integer pp = 0;
    private Integer pc = 0;
    private Integer fc = 0;
}
