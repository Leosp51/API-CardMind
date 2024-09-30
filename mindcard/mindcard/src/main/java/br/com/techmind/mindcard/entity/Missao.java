package br.com.techmind.mindcard.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "TBL_MISSAO")
public class Missao {
    @Id
    @Column(name = "ID_MISSAO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "DT_PRAZO")
    private LocalDateTime dtPrazo;
    @Column(name = "NB_RECOMPENSA")
    private int recompensa;
    @Column(name = "TX_OBJETIVO")
    private String objetivo;
    @Column(name = "TX_NOME")
    private String nome;
}
