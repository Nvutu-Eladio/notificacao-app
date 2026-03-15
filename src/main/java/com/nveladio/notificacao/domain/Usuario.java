package com.nveladio.notificacao.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
public class Usuario {

    private UUID id;

    private String nome;

    private String sobreNome;

    private String cpf;

    private String telefone;

    private String renda;

}
