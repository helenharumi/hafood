package br.com.helenharumi.hafood.controller;

import br.com.helenharumi.hafood.dto.CozinhasDTO;
import br.com.helenharumi.hafood.entity.Cozinhas;
import br.com.helenharumi.hafood.service.CozinhasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CozinhasController {

    @Autowired
    private CozinhasService cozinhasService;

    @PostMapping("/cozinhas")
    public Cozinhas salvar(@RequestBody CozinhasDTO cozinhas){

        return cozinhasService.salvar(cozinhas);
    }

}
