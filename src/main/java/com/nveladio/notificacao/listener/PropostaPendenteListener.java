package com.nveladio.notificacao.listener;

import com.nveladio.notificacao.constante.MensagemConstante;
import com.nveladio.notificacao.domain.Proposta;
import com.nveladio.notificacao.service.NotificacaoSnsService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PropostaPendenteListener {

    private final NotificacaoSnsService notificacaoSnsService;

    @RabbitListener(queues = "${rabbitmq.queue.proposta.pendente}")
    public void propostaPendente(Proposta proposta) {

        String mensagem = String.format(MensagemConstante.PROPOSTA_EM_ANALISE, proposta.getNome());
        notificacaoSnsService.notificar(mensagem);

    }

}
