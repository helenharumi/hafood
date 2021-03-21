package br.com.helenharumi.hafood.service;

import br.com.helenharumi.hafood.dto.CozinhaDTO;
import br.com.helenharumi.hafood.entity.Cozinha;
import br.com.helenharumi.hafood.repository.CozinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CozinhaService {
    @Autowired
    private CozinhaRepository cozinhaRepository;
    public Cozinha salvar(CozinhaDTO cozinhaDTO){
        Cozinha cozinha = new Cozinha();
        cozinha.setNome(cozinhaDTO.getNome());
        cozinhaRepository.save(cozinha);
        return cozinha;
    }
}
