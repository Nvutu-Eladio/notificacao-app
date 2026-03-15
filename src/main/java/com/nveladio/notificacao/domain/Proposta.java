package com.nveladio.notificacao.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
public class Proposta {

    private UUID id;

    private Double valorSolicitado;

    private int prazoPagamento;

    private Boolean aprovada;

    private String observacao;

    private Boolean integrada;

    private Usuario usuario;


}
