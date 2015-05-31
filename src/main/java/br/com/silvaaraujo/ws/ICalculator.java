package br.com.silvaaraujo.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ICalculator {

	@WebMethod
	public int sum(int a, int b);
	
	@WebMethod
	public int subtract(int a, int b);
	
	@WebMethod
	public int multiply(int a, int b);
	
	@WebMethod
	public int divide(int a, int b);
	
}