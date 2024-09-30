package br.com.techmind.mindcard.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "TBL_CONQUISTA")
public class Conquista {
    @Id
    @Column(name = "ID_CONQUISTA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "TX_OBJETIVO")
    private String objetivo;
    @Column(name = "NB_RECOMPENSA")
    private int recomepensa;
    @Column(name = "TX_NOME")
    private String nome;

}
