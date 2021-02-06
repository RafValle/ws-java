package br.com.pulse.service;

import br.com.pulse.mapper.ProdutoMapper;
import br.com.pulse.model.Produto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProdutoService {

    @Autowired
    ProdutoMapper mapper;

    public Produto buscar(Long id) {
       return mapper.buscar(id);
    }
    public List<Produto> listar(){
        return mapper.listar();
    }

    public Produto salvar(Produto item){
        mapper.salvar(item);
        Produto produto = item;
        return produto;
    }

    public void delete(Long id){
        mapper.delete(id);
    }

    public Produto atualizar(Produto item){
        mapper.atualizar(item);
        Produto produto = item;
        return produto;
    }
    
}
