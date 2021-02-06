package br.com.pulse.model;

import lombok.Data;

@Data
public class Produto {

    private Long id;

    private String descricao;

    private Long valor;

    private Long quantidade;

}
