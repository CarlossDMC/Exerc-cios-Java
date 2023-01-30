package entities;

import java.time.LocalDate;
import java.util.Date;

public class Parcela {
	
	private Double valorTotal;
	private LocalDate vencimento;
	
	public Parcela(Double valorTotal, LocalDate vencimento) {
		this.valorTotal = valorTotal;
		this.vencimento = vencimento;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public LocalDate getVencimento() {
		return vencimento;
	}

	public void setVencimento(LocalDate vencimento) {
		this.vencimento = vencimento;
	}
	
	
	
	

}
