package br.com.techmind.mindcard.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "TBL_USUARIO")
public class Usuario {
    @Id
    @Column(name = "ID_USUARIO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TX_EMAIL")
    private String email;

    @Column(name = "TX_SENHA")
    private String senha;

    @Column(name = "TX_NOME")
    private String nome;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_USUARIO")
    private List<Baralho> baralhos;

    @ManyToMany
    @JoinTable(
            name = "TBL_REL_USUARIO_ESTILO",
            joinColumns = @JoinColumn(name = "ID_ESTILOS_BARALHO"),
            inverseJoinColumns = @JoinColumn(name = "ID_USUARIO")
    )
    private List<EstiloBaralho> estilos;

    @ManyToMany
    @JoinTable(
            name = "TBL_REL_USUARIO_MISSAO",
            joinColumns = @JoinColumn(name = "ID_MISSAO"),
            inverseJoinColumns = @JoinColumn(name = "ID_USUARIO")
    )
    private List<Missao> missoes;

    @ManyToMany
    @JoinTable(
            name = "TBL_REL_USUARIO_CONQUISTA",
            joinColumns = @JoinColumn(name = "ID_CONQUISTA"),
            inverseJoinColumns = @JoinColumn(name = "ID_USUARIO")
    )
    private  List<Conquista> conquistas;
}
