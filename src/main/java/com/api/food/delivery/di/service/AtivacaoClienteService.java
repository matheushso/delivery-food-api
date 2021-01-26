package com.api.food.delivery.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.food.delivery.di.modelo.Cliente;
import com.api.food.delivery.di.notificacao.NivelUrgencia;
import com.api.food.delivery.di.notificacao.Notificador;
import com.api.food.delivery.di.notificacao.TipoDoNotificador;

@Component
public class AtivacaoClienteService {
	
	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}
