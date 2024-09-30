package br.com.techmind.mindcard.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_CARTA_PERGUNTA")
public class CartaPergunta {
    @Id
    @Column(name = "ID_CARTA_PERGUNTA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "TX_NOME")
    private String nome;
    @Column(name = "TX_PERGUNTA")
    private String pergunta;
    @Column(name = "TX_RESPOSTA")
    private String resposta;
    @ManyToOne
    @JoinColumn(name = "ID_BARALHO")
    private Baralho baralho;
}
