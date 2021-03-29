package br.com.helenharumi.hafood.repository;

import br.com.helenharumi.hafood.entity.Cozinha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CozinhaRepository extends JpaRepository<Cozinha, Long> {
    @Query("select c from Cozinha c where c.nome=?1")
    Cozinha findByNome(String nome);


}
