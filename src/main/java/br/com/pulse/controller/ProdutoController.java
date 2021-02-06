package br.com.pulse.controller;

import br.com.pulse.model.Produto;
import br.com.pulse.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    
    @Autowired
    ProdutoService service;

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscar(@PathVariable Long id){
       Produto retorno = service.buscar(id);
        if(retorno == null){
            return ResponseEntity.notFound().build();
       }
       return ResponseEntity.ok(retorno);
    }

    @GetMapping
    public ResponseEntity<List<Produto>> listar() {
        List<Produto> produto = service.listar();
        return ResponseEntity.ok(produto);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.delete(id);
    }

    @PostMapping
    public HttpEntity<? extends Object> salvar(@RequestBody Produto item){
       Produto retorno = service.salvar(item);
       if (retorno == null){
           return ResponseEntity.notFound().build();
       }
       return ResponseEntity.ok("Salvo com sucesso!");
    }

    @PutMapping
    @CrossOrigin
    public HttpEntity<? extends Object> atualizar(@RequestBody Produto item){
        Produto retorno = service.atualizar(item);
        if (retorno == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok("Atualizado com sucesso!");
    }
}
