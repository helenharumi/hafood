package br.com.helenharumi.hafood.controller;

import br.com.helenharumi.hafood.dto.CozinhaDTO;
import br.com.helenharumi.hafood.entity.Cozinha;
import br.com.helenharumi.hafood.service.CozinhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/cozinha")
public class CozinhaController {

    @Autowired
    private CozinhaService cozinhaService;

    @PostMapping
    public Cozinha salvar(@RequestBody CozinhaDTO cozinha){

        return cozinhaService.salvar(cozinha);
    }

    @GetMapping
    public List<Cozinha> listar(){
        return cozinhaService.listar();
    }

    @GetMapping("/buscar")
    public Cozinha buscar(@RequestParam("nome") String nome){
        return cozinhaService.buscar(nome);
    }
}
