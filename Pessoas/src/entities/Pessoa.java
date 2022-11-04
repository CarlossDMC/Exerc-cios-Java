package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pessoa {

	private String nome;
	private String nascimento;
	private String sexo;
	private Date nascimento_;
	private Double salario;
	private Double peso;
	private Double altura;

	public Pessoa(String nome, String nascimento, String sexo, Double salario, Double peso, Double altura) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.sexo = sexo;
		this.salario = salario;
		this.peso = peso;
		this.altura = altura;
		
	}
	
	public Pessoa() {
	}

	private List<Pessoa> todasPessoas = new ArrayList<>();

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNascimento() {
		return nascimento;
	}

	public void convertNascimento() throws ParseException {
		Date birthday = new SimpleDateFormat("dd/MM/yyyy").parse(this.nascimento);
		this.nascimento_ = birthday;
		
	}

	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public String printAll() {
		return String.format(" Nome: %s \n Nascimento: %s \n Salario: %.2f \n Peso: %.2f \n Altura: %.2f \n", this.nome, this.nascimento, this.salario, this.peso, this.altura );

	}
	

	public String getIdade() throws ParseException {
		convertNascimento();
		LocalDate nascimento = nascimento_.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return String.format(" Idade: %s",  Period.between(nascimento, LocalDate.now()).getYears());
	}

	public String getIMC() {
		Double imc = (this.peso/(Math.pow(altura, 2)));
		return String.format(" IMC: %.2f", imc);

	}

	public int getNumeroDeCadastros() {
		return todasPessoas.size();
	}

	public String getHomensMulheres() {
		int qntdFeminino = 0;
		int qntdMasculino = 0;
		for(int i = 0; i<todasPessoas.size(); i++) {
			if(todasPessoas.get(i).getSexo().equals("F")){
				qntdFeminino ++;
			}
			else if(todasPessoas.get(i).getSexo().equals("M")) {
				qntdMasculino ++;
			}
		}
		return String.format(" Masculino: %s \n Feminino: %s", qntdMasculino, qntdFeminino);
	}
	
	
	public String getAcumuloDeSalarioEMedia() {
		Double acumulo = 0.0;
		Double media_Salarial = 0.0;
		for(int i = 0; i<todasPessoas.size(); i++) {
			acumulo += todasPessoas.get(i).salario;
		}
		
		media_Salarial = acumulo/todasPessoas.size();
		return String.format(" Acumulo de salario: %.2f \n Media Salarial: %.2f ", acumulo, media_Salarial);
	}
	
	public void addObject(Pessoa pessoa) {
		todasPessoas.add(pessoa);
	}
	
	public int getLenght() {
		return todasPessoas.size();	}
	
	public Pessoa getPessoa(int index) {
		return todasPessoas.get(index);
	}
	


}
