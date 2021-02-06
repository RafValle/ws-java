package br.com.pulse.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pulse.mapper.FilialMapper;
import br.com.pulse.model.Filial;

import java.util.List;

@Service
@AllArgsConstructor
public class FilialService {

    @Autowired
    FilialMapper mapper;

    public Filial buscar(Long id) {
       return mapper.buscar(id);
    }
    public List<Filial> listar(){
        return mapper.listar();
    }

    public Filial salvar(Filial item){
        mapper.salvar(item);
        Filial filial = item;
        return filial;
    }

    public void delete(Long id){
        mapper.delete(id);
    }

    public Filial atualizar(Filial item){
        mapper.atualizar(item);
        Filial filial = item;
        return filial;
    }
    
}
