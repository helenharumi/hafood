package br.com.helenharumi.hafood.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CozinhaDTO {
    @JsonProperty("nome")
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
