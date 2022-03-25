package principal;

public class Carro {
       
	private String nome;
	private String modelo;
	private String cor;
	private float valor;
	private double velocidade;
	
	//Construtor
	Carro(){}
	
	Carro(String nome, String modelo, String cor, float valor, double velocidade){
		this.nome = nome;
		this.modelo = modelo;
		this.cor = cor;
		this.valor = valor;
		this.velocidade = velocidade;
	}
	
	public String getNome() {
		return nome;
	}	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	public void avaliarPreco(){
		if(this.getValor() > 400.000) {
			System.out.println("Carro acima do preço de tabela!");
		} else {
			System.out.println("Carro abaixo do preço de tabela!");
		}
	}
	
	public void velocidadeCarro() {	
		if(velocidade > 0 && velocidade <= 40) {
			System.out.println("Velocidade baixa, pode acelerar!");
		} else if(velocidade > 40 && velocidade <= 80) {
			System.out.println("Velocidade mediana, fique atento!");
		} else if(velocidade > 80 && velocidade <= 120) {
			System.out.println("Velocidade acima da média, tome cuidado!");
		}
	}
	
}
