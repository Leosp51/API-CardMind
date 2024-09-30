package br.com.techmind.mindcard.repository;

import br.com.techmind.mindcard.entity.BaralhoComunidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaralhoComunidadeRepository extends JpaRepository<BaralhoComunidade,Long> {
}
