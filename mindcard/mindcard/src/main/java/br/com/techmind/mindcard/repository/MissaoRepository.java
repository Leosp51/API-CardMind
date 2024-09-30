package br.com.techmind.mindcard.repository;

import br.com.techmind.mindcard.entity.Missao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissaoRepository extends JpaRepository<Missao,Long> {
}
