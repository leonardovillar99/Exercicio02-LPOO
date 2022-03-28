package ex01;

import java.util.Scanner;

public class Pessoa {
	
    Scanner leitor = new Scanner(System.in); 
	
	//Atributos Privados
      private String nome;
      private int dataNasc;
      private double altura;
      private int anoAtual = 2022;
      
    //Método Construtor
      public Pessoa() {}
      
      public Pessoa(String nome, int dataNasc, double altura, int anoAtual) {
    	  this.nome = nome;
    	  this.dataNasc = dataNasc;
    	  this.altura = altura;
    	  this.anoAtual = anoAtual = 2022;
      }
      
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getDataNasc() {
		return this.anoAtual - this.dataNasc;
	}
	public void setDataNasc(int dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int getanoAtual() {
		return anoAtual;
	}
	public void setanoAtual(int anoAtual) {
		this.anoAtual = anoAtual;
	}
	
	public void infosPessoa() {
		
	    System.out.print("Digite o nome: ");
	    nome = leitor.nextLine();
	    
	    System.out.print("Digite o ano de nascimento: ");
	    dataNasc = leitor.nextInt();
	          
	    System.out.print("Digite a altura: (Use vírgula ao invés de ponto) ");
	    altura = leitor.nextDouble();	        
		
	 	System.out.println("\nNome: " + this.getNome() + "\nAno de Nascimento: " + 
	 	this.dataNasc + "\nAltura: " + this.getAltura() + "cm \nIdade: " 
	    + this.getDataNasc() + " anos");
	}
           
}