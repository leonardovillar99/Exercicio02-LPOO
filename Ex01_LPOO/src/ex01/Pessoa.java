package ex01;

public class Pessoa {
	//Atributos Privados
      private String nome;
      private int dataNasc;
      private double altura;
      private int ano;
      
    //Método Construtor
      public Pessoa() {}
      
      public Pessoa(String nome, int dataNasc, double altura, int ano) {
    	  this.nome = nome;
    	  this.dataNasc = dataNasc;
    	  this.altura = altura;
    	  this.ano = ano;
      }
      
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getDataNasc() {
		return this.ano - this.dataNasc;
	}
	public void setDataNasc(int dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void infosPessoa() {
	 	System.out.println("Nome: " + this.getNome() + "\nData de Nascimento: " + 
	 	this.dataNasc + "\nAltura: " + this.getAltura() + "cm \nIdade: " 
	    + this.getDataNasc() + " anos");
	}
           
}