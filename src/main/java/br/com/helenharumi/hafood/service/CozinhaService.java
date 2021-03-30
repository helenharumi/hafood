package br.com.helenharumi.hafood.service;

import br.com.helenharumi.hafood.dto.CozinhaDTO;
import br.com.helenharumi.hafood.entity.Cozinha;
import br.com.helenharumi.hafood.repository.CozinhaRepository;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

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

    public List<Cozinha> listar(){
        return cozinhaRepository.findAll();
    }

    public Cozinha buscar(String nome){
        return cozinhaRepository.findByNome(nome);
    }

    public void apagar(Long id){
        cozinhaRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        cozinhaRepository.deleteById(id);
    }

}
