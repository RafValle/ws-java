package br.com.pulse.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import br.com.pulse.model.Filial;

import java.util.List;

@Mapper
@Repository
public interface FilialMapper {

  public Filial buscar(Long filialId);
  public List<Filial> listar();
  public void salvar(@Param("filial")Filial filial);
  public void atualizar(@Param("filial")Filial filial);
  public void delete(Long filialId);
}


  