package ex03;

import javax.swing.JOptionPane;

public class ControleRemoto {

	
	public static void main(String[] args) {
		
		int volume;
		int canal;
		
		Televisao tv = new Televisao();
		
	
	while(true){
  	
  	int opcao = Integer.parseInt(JOptionPane.showInputDialog("\n 1. Aumentar volume" + 
  								"\n 2. Diminuir volume"+ 
  								"\n 3. Aumentar canal" + 
  								"\n 4. diminuir canal" + 
  								"\n 5. Ir para o canal" + 
  								"\n 6. Consultar status" + 
  								"\n 7. Sair" + 
  								"\n O que deseja fazer"));
     
    switch(opcao){
    	case 1:
    		 volume = tv.getVolume();
    		if(volume < 10) {
              tv.setVolume(volume + 1);
          }else {
          	JOptionPane.showMessageDialog(null, "Volume no maximo");
          }
        break;
         
      case 2:
      	volume = tv.getVolume();
    		if(volume > 0) {
              tv.setVolume(volume - 1);
          }else {
          	JOptionPane.showMessageDialog(null, "Volume mínimo");
          }
        break;  
       
      case 3:
      	canal = tv.getCanal();
      	if(canal < 50) {
              tv.setCanal(canal + 1);
          }else {
          	JOptionPane.showMessageDialog(null, "Canal no maximo");
          }           
        break;  
       
      case 4:
      	canal = tv.getCanal();
      	if(canal > 1) {
              tv.setCanal(canal - 1);
          }else {
          	JOptionPane.showMessageDialog(null, "Canal minimo");
          }         
      	break;
       
      case 5:
      	int novoCanal = Integer.parseInt(JOptionPane.showInputDialog("Informe o canal que deseja entre 1 e 50"));
      	if(novoCanal > 0  && novoCanal < 50) {
      	tv.setCanal(novoCanal);
      	}else {
      		JOptionPane.showMessageDialog(null, "Canal Invalido");
      	}
      	break;  
         
      case 6:
      	JOptionPane.showMessageDialog(null, "Esta no canal "+tv.getCanal()+", no volume "+tv.getVolume());
      	break;
      	
      case 7:
      	System.exit(0);
        
      default:
      	JOptionPane.showMessageDialog(null,"\nOp��o inv�lida\n");
      	break;
      	
    }
	}
	}
}
