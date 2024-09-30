package br.com.techmind.mindcard.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "TBL_BARALHO")
public class Baralho {
    @Id
    @Column(name = "ID_BARALHO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "TX_NOME")
    private String nome;
    @ManyToOne
    @JoinColumn(name = "ID_USUARIO")
    private Usuario usuario;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_BARALHO")
    private List<CartaTexto> cartasTextos;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_BARALHO")
    private List<CartaPergunta> cartasPerguntas;
}
