package com.api.food.delivery.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.api.food.delivery.di.service.ClienteAtivadoEvent;

@Component
public class EmissaoNotaFiscalService {
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		System.out.println("Emitido nota fiscal do cliente: " + event.getCliente().getNome());
	}
}
