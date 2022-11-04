package entities;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
	private String nome;
	private String cidade;
	private String nome_Tecnico;
	private String email;
	private int pontos;
	private int vitorias;
	private int sets_Vencidos;
	private int posicaoFinal;
	
	private List<Equipe> equipes = new ArrayList<>();


	public Equipe() {
	}
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Equipe> getEquipes() {
		return equipes;
	}
	
	public int getLenghtOfEquipes() {
		return equipes.size();
	}
	
	public void removeEquipes(int index) {
		equipes.remove(index);
	}
	

	public void setEquipes(Equipe equipes_) {
		equipes.add(equipes_);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getNome_Tecnico() {
		return nome_Tecnico;
	}

	public void setNome_Tecnico(String nome_Tecnico) {
		this.nome_Tecnico = nome_Tecnico;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getSets_Vencidos() {
		return sets_Vencidos;
	}

	public void setSets_Vencidos(int sets_Vencidos) {
		this.sets_Vencidos = sets_Vencidos;
	}

	public int getPosicaoFinal() {
		return posicaoFinal;
	}

	public void setPosicaoFinal(int posicaoFinal) {
		this.posicaoFinal = posicaoFinal;
	}
	
	
	
	

}
