package com.api.food.delivery.di.notificacao;

import com.api.food.delivery.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}