package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import service.PayPalPagamentos;
import service.ServicoPagamento;

public class Contract {
	
	private Integer numero;
	private LocalDate dataDocontrato;
	private Double valorDocontrato;
	private Integer mesesDoparcelamento;
	
	public Contract(Integer numero, LocalDate dataDocontrato, Double valorDocontrato, Integer mesesDoparcelamento) {
	
		this.numero = numero;
		this.dataDocontrato = dataDocontrato;
		this.valorDocontrato = valorDocontrato;
		this.mesesDoparcelamento = mesesDoparcelamento;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public LocalDate getDataDocontrato() {
		return dataDocontrato;
	}

	public void setDataDocontrato(LocalDate dataDocontrato) {
		this.dataDocontrato = dataDocontrato;
	}

	public Double getValorDocontrato() {
		return valorDocontrato;
	}

	public void setValorDocontrato(Double valorDocontrato) {
		this.valorDocontrato = valorDocontrato;
	}

	public Integer getMesesDoparcelamento() {
		return mesesDoparcelamento;
	}

	public void setMesesDoparcelamento(Integer mesesDoparcelamento) {
		this.mesesDoparcelamento = mesesDoparcelamento;
	}
	
	public ArrayList<Parcela> processarContrato(int meses, Contract contrato) {
		Double contratoParcela = this.valorDocontrato / this.mesesDoparcelamento;
		ServicoPagamento servico = new PayPalPagamentos();
		ArrayList<Parcela> parcelas = new ArrayList();
		LocalDate data_ = dataDocontrato;
		int mes = data_.getMonthValue();
		Double count = 1.01;
		for(int i = 0; i<meses; i++) {
			Double taxa = servico.taxaDePagamento(contratoParcela, count);
			Double parcela = servico.Juros(taxa);
			data_ = data_.plusMonths(1);
			parcelas.add(new Parcela(parcela,data_)); 
			count = count + 0.01;
			
		}
		
		return parcelas;
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
