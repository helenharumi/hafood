package br.com.helenharumi.hafood.service;

import br.com.helenharumi.hafood.dto.CozinhasDTO;
import br.com.helenharumi.hafood.entity.Cozinhas;
import br.com.helenharumi.hafood.repository.CozinhasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CozinhasService {
    @Autowired
    private CozinhasRepository cozinhasRepository;
    public Cozinhas salvar(CozinhasDTO cozinhasDTO){
        Cozinhas cozinhas = new Cozinhas();
        cozinhas.setNome(cozinhasDTO.getNome());
        cozinhasRepository.save(cozinhas);
        return cozinhas;
    }
}
