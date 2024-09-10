//Dupla: Matheus Camargo e Enzo Enrico
package com.br.pw_study.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "TBL_DISPONIBILIDADE")
public class Disponibilidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DISPONIBILIDADE")
    private Long id;

    @Column(name = "TX_DIA_SEMANA")
    private String diaSemana;

    @Column(name = "DT_DAS")
    private LocalDateTime dataDas;

    @Column(name = "DT_ATE")
    private LocalDateTime dataAte;

    @ManyToMany(mappedBy = "disponibilidades")
    private List<Monitor> monitores;
}
