package br.com.techmind.mindcard.controller;

import br.com.techmind.mindcard.entity.Conquista;
import br.com.techmind.mindcard.entity.EstiloBaralho;
import br.com.techmind.mindcard.entity.Missao;
import br.com.techmind.mindcard.entity.Usuario;
import br.com.techmind.mindcard.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    @GetMapping("/estilos/{id}")
    public ResponseEntity<List<EstiloBaralho>> buscarEstilosPorIdUsuario(@PathVariable Long id){
        var pesquisa = repository.findById(id);
        if(pesquisa.isEmpty())
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.status(HttpStatus.FOUND).body(pesquisa.get().getEstilos());
    }
    @GetMapping("/conquistas/{id}")
    public ResponseEntity<List<Conquista>> buscarConquistasPorIdUsuario(@PathVariable Long id){
        var solicitacao = repository.findById(id);
        if(solicitacao.isEmpty())
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(solicitacao.get().getConquistas());
    }
    @GetMapping("/missoes/{id}")
    public ResponseEntity<List<Missao>> buscarMissoesPorIdUsuario(@PathVariable Long id){
        var solicitacao = repository.findById(id);
        if(solicitacao.isEmpty())
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(solicitacao.get().getMissoes());
    }
}
