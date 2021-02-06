package br.com.pulse.mapper;

import br.com.pulse.model.Produto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProdutoMapper {

  public Produto buscar(Long produtoId);
  public List<Produto> listar();
  public void salvar(@Param("produto")Produto produto);
  public void atualizar(@Param("produto")Produto produto);
  public void delete(Long produtoId);
}


  