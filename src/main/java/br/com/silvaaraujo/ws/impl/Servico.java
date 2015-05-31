package br.com.silvaaraujo.ws.impl;

import java.text.MessageFormat;

import javax.jws.WebService;

import br.com.silvaaraujo.ws.IServico;

@WebService(endpointInterface="br.com.silvaaraujo.ws.IServico")
public class Servico implements IServico {

	@Override
	public String consumirServico(String usuario) {
		return MessageFormat.format("Servico consumido por {0}", usuario);
	}
	
}