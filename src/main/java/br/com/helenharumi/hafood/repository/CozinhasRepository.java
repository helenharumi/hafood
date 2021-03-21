package br.com.helenharumi.hafood.repository;

import br.com.helenharumi.hafood.entity.Cozinhas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CozinhasRepository extends JpaRepository<Cozinhas, Long> {

}
