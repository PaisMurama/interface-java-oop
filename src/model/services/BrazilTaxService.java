package model.services;

public class BrazilTaxService {
	
	// Calcular o imposto do brazil a partir de uma certa quantia
	// de dinheiro(amaount).
	
	/*
	 Ao usarmos o tipo primitivo, assumimos que sempre teremos uma quantia e uma resposta,
	 para o imposto dessa quantia(amount)
	 * 
	 * */
	
	public double tax(double amount)
	{
		if(amount<=100.0)
		{
			return amount * 0.2;
		}else
		{
			return amount * 0.15;
		}
		
	}
	
	
	
	
	

}
