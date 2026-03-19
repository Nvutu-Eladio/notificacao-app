package com.nveladio.notificacao.service;

import software.amazon.awssdk.services.sns.SnsClient;
import software.amazon.awssdk.services.sns.model.PublishRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.sns.model.PublishRequest;

@Service
public class NotificacaoSnsService {

    @Autowired
    private SnsClient amazonSNS;

    public void notificar(String telefone, String mensagem) {
        PublishRequest publishRequest =PublishRequest.builder()
                .message(mensagem)
                .phoneNumber(telefone)
                .build();
        amazonSNS.publish(publishRequest);

    }

}
