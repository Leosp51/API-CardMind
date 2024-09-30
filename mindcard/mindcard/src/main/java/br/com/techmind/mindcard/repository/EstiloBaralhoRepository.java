package br.com.techmind.mindcard.repository;

import br.com.techmind.mindcard.entity.EstiloBaralho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstiloBaralhoRepository extends JpaRepository<EstiloBaralho,Long> {
}
