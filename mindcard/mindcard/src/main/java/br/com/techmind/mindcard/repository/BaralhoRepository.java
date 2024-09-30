package br.com.techmind.mindcard.repository;

import br.com.techmind.mindcard.entity.Baralho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BaralhoRepository extends JpaRepository<Baralho,Long> {
}
