package com.nveladio.notificacao.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
public class Proposta {

    private UUID id;
    private String nome;
    private String sobreNome;
    private String telefone;
    private String cpf;
    private Double renda;
    private String valorSolicitadoFmt;
    private int prazoPagamento;
    private Boolean aprovada;
    private String observacao;
    private Boolean integrada;


}
