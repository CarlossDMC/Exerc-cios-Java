package entitites;

public class Elevador {
	private Integer andarAtual;
	private Integer totalAndares;
	private Integer capacidadeElevador;
	private Integer ocupantesElevador;

	public Elevador(Integer andarAtual, Integer totalAndares, Integer capacidadeElevador, Integer ocupantesElevador) {
		this.andarAtual = andarAtual;
		this.totalAndares = totalAndares;
		this.capacidadeElevador = capacidadeElevador;
		this.ocupantesElevador = ocupantesElevador;
	}
	
	
	public int getAndarAtual() {
		return andarAtual;
	}


	public void setAndarAtual(Integer andarAtual) {
		this.andarAtual = andarAtual;
	}


	public int getTotalAndares() {
		return totalAndares;
	}


	public void setTotalAndares(Integer totalAndares) {
		this.totalAndares = totalAndares;
	}


	public int getCapacidadeElevador() {
		return capacidadeElevador;
	}


	public void setCapacidadeElevador(Integer capacidadeElevador) {
		this.capacidadeElevador = capacidadeElevador;
	}


	public int getOcupantesElevador() {
		return ocupantesElevador;
	}


	public void setOcupantesElevador(Integer ocupantesElevador) {
		this.ocupantesElevador = ocupantesElevador;
	}


	public void inicializa(){
		capacidadeElevador = 0; 
	} 
	
	public void entra(){
		if(ocupantesElevador<capacidadeElevador){
			ocupantesElevador++;
		}
		
		else {
			System.out.println("Elevador cheio.");
		}
	} 
	
	public void sai(){
		if(ocupantesElevador>0){
			ocupantesElevador--;
		} 
	}
	
	public void sobe(){ 
		if(andarAtual==totalAndares){
			System.out.println("JÁ ESTÁ NO ULTIMO ANDAR");; 
		}else{
			andarAtual++;
		}
	}
	
	public void desce(){
		if(andarAtual==0){
			System.out.println("TÉRREO");
		}else{ 
			andarAtual--;
		}     

	}

}
