package service;

public interface ServicoPagamento {
	
	public Double Juros(Double total);
	public Double taxaDePagamento(Double contratoParcela, Double count);
	
}
