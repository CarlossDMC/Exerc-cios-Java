package service;

public class PayPalPagamentos implements ServicoPagamento{
	

	public Double taxaDePagamento(Double total, Double count) {
		return total * count;
	}


	public Double Juros(Double total) {
		
		return total * 1.02;
	}
	
	

}
