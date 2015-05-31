package br.com.silvaaraujo.ws.impl;

import javax.jws.WebService;

import br.com.silvaaraujo.ws.ICalculator;

@WebService(endpointInterface="br.com.silvaaraujo.ws.ICalculator")
public class Calculator implements ICalculator {

	@Override
	public int sum(int a, int b) {
		int result = 0;
		try {
			result = a + b;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int subtract(int a, int b) {
		int result = 0;
		try {
			result = a - b;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int multiply(int a, int b) {
		int result = 0;
		try {
			result = a * b;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int divide(int a, int b) {
		int result = 0;
		try {
			result = a / b;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}