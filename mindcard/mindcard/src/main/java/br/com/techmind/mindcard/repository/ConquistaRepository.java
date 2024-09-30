package br.com.techmind.mindcard.repository;

import br.com.techmind.mindcard.entity.Conquista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConquistaRepository extends JpaRepository<Conquista,Long> {
}
