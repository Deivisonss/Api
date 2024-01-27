package com.api3.testando.controle;

import com.api3.testando.modelo.Pessoa;
import com.api3.testando.repositorio.Repositorio;
import io.micrometer.common.lang.NonNull;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class Controle {

    @Autowired
    private Repositorio acao; // acaos para o banco de dados

    @PostMapping("rota2")
    public Pessoa cadastrar(@NonNull @RequestBody Pessoa obj){
        return acao.save(obj);
    }
    
    @GetMapping("/rota2")
    public Iterable<Pessoa> selecionar(){
        return acao.findAll();
    }

    @PostMapping("/pessoa")
    public Pessoa pessoa(@NonNull @RequestBody Pessoa p){
        return p;
    }

    @GetMapping("")
    public String mensagem(){ 
        return "Olá Mundo";
    }

    @GetMapping("/rota2")
    public String boasVindas(){
        return "Seja bem vindo(a)";
    }

    @GetMapping("/rota2/{nome}")
    public String boasVindas(@PathVariable String nome){
        return "Seja bem vindo(a)" + nome;
    }
}
