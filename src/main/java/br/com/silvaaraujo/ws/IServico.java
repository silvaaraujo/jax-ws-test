package br.com.silvaaraujo.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IServico {

	@WebMethod
	public String consumirServico(String usuario);
	
}