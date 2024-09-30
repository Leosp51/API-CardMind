package br.com.techmind.mindcard.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "TBL_BARALHO_COMUNIDADE")
public class BaralhoComunidade {
    @Id
    @Column(name = "ID_BARALHO_COMUNIDADE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "TX_NOME")
    private String nome;
    @ManyToOne
    @JoinColumn(name = "ID_AUTOR_USUARIO")
    private Usuario usuarioAutor;
    @Column(name = "TX_TAGS")
    private String tags;
}
