package br.com.techmind.mindcard.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_ESTILO_BARALHO")
public class EstiloBaralho {
    @Id
    @Column(name = "ID_ESTILO_BARALHO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NB_VALOR")
    private int valor;
    @Column(name = "TX_NOME")
    private String nome;

}
