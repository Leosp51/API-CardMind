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
/*https://www.bing.com/ck/a?!&&p=fa332a7ee53ee8d5JmltdHM9MTcyNzY1NDQwMCZpZ3VpZD0yN2VjMjk2MC01NjdhLTZlZDAtMWU4MS0zYzZhNTdjYzZmZjcmaW5zaWQ9NTQ3Nw&ptn=3&ver=2&hsh=3&fclid=27ec2960-567a-6ed0-1e81-3c6a57cc6ff7&u=a1L3ZpZGVvcy9yaXZlcnZpZXcvcmVsYXRlZHZpZGVvP3E9Y29tbytmYXplcithK2ltcGxlbWVudGElYzMlYTclYzMlYTNvK2RlK2NhZGFzdHJvK2RvK2dvb2dsZStubytqYXZhJm1pZD1FRkQ5MDExRTI1Mzk5NEFBRDYwNEVGRDkwMTFFMjUzOTk0QUFENjA0JmN2aWQ9MTA1NUFCOTA3REY0NEVGMEFGQ0ZDQzI5QzNEMTIzMEImRk9STT1WSVJF&ntb=1*/