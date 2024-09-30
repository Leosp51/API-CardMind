package br.com.techmind.mindcard.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_CARTA_TEXTO")
public class CartaTexto {
    @Id
    @Column(name = "ID_CARTA_TEXTO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "TX_NOME")
    private String nome;
    @Column(name = "TX_CONTEUDO")
    private String conteudo;
    @ManyToOne
    @JoinColumn(name = "ID_BARALHO")
    private Baralho baralho;
}
