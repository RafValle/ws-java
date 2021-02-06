package br.com.pulse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.pulse.model.Filial;
import br.com.pulse.service.FilialService;


import java.util.List;


@RestController
@RequestMapping("/filial")
public class FilialController {
    
    @Autowired
    FilialService service;

    @GetMapping("/{id}")
    public ResponseEntity<Filial> buscar(@PathVariable Long id){
       Filial retorno = service.buscar(id);
        if(retorno == null){
            return ResponseEntity.notFound().build();
       }
       return ResponseEntity.ok(retorno);
    }

    @GetMapping
    public ResponseEntity<List<Filial>> listar() {
        List<Filial> filial = service.listar();
        return ResponseEntity.ok(filial);
    }

    @PostMapping
    public HttpEntity<? extends Object> salvar(@RequestBody Filial item){
       Filial retorno = service.salvar(item);
       if (retorno == null){
           return ResponseEntity.notFound().build();
       }
       return ResponseEntity.ok("Salvo com sucesso!");
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.delete(id);
    }

    @PutMapping
    public HttpEntity<? extends Object> atualizar(@RequestBody Filial item){
        Filial retorno = service.atualizar(item);
        if (retorno == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok("Atualizado com sucesso!");
    }
}
