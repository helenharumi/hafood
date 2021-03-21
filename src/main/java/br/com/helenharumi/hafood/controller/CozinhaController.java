package br.com.helenharumi.hafood.controller;

import br.com.helenharumi.hafood.dto.CozinhaDTO;
import br.com.helenharumi.hafood.entity.Cozinha;
import br.com.helenharumi.hafood.service.CozinhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CozinhaController {

    @Autowired
    private CozinhaService cozinhaService;

    @PostMapping("/cozinha")
    public Cozinha salvar(@RequestBody CozinhaDTO cozinha){

        return cozinhaService.salvar(cozinha);
    }

}
