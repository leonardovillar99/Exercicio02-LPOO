package principal;

public class main {
     public static void main(String[] args) {
    	 Carro carro1 = new Carro("Ferrari", "Roma", "Vermelho", 100.000f, 81);
    	 
    	 System.out.println("Nome: " + carro1.getNome() + "\nModelo: " + 
    	                    carro1.getModelo() + "\nCor: " + carro1.getCor() +
    	                    "\nValor: R$" + carro1.getValor() + " mil" + "\nVelocidade de : " + 
    	                    carro1.getVelocidade() + "km/s");
    	 
    	 carro1.velocidadeCarro();
    	 carro1.avaliarPreco();
     }
}
