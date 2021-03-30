package br.com.helenharumi.hafood.controller;

import br.com.helenharumi.hafood.dto.CozinhaDTO;
import br.com.helenharumi.hafood.entity.Cozinha;
import br.com.helenharumi.hafood.service.CozinhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.security.cert.X509Certificate;
import java.util.List;

@RestController
@RequestMapping(value="/cozinha")
public class CozinhaController {

    @Autowired
    private CozinhaService cozinhaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cozinha salvar(@RequestBody CozinhaDTO cozinhaDTO){
        return cozinhaService.salvar(cozinhaDTO);
    }

    @GetMapping
    public List<Cozinha> listar(){
        return cozinhaService.listar();
    }

    @GetMapping("/buscar")
    public Cozinha buscar(@RequestParam("nome") String nome){
        return cozinhaService.buscar(nome);
    }

    @DeleteMapping("{id}")
    public ResponseEntity apagar(@PathVariable(name="id") Long id) {
        try {
            cozinhaService.apagar(id);
            return ResponseEntity.noContent().build();
        }catch (EntityNotFoundException e){
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("{id}")
    public Cozinha alterar(@PathVariable(name="id") Long id,
                           @RequestBody CozinhaDTO cozinhaDTO){
        return cozinhaService.alterar(id,cozinhaDTO);
    }
}