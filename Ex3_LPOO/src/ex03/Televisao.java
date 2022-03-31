package ex03;

import javax.swing.JOptionPane;

public class Televisao {
    public int canal = 1;
    public int volume = 0;
    public boolean ligado;
    
    public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
    
    public Televisao() {
    	
    }
    
    public void aumentaVolume(){
            if(volume < 10) {
                volume =+ 1;
            }else {
            	JOptionPane.showMessageDialog(null, "Volume esta no maximo");
            }
    }
    
    public void reduzirVolume(){
            if(volume > 0) {
                volume =- 1;
    		}else {
    			JOptionPane.showMessageDialog(null, "Volume esta mudo");
    		}
    }
    
    public void subirCanal(){
            if(canal < 50) {
                canal =+ 1;
            }else {
            	JOptionPane.showMessageDialog(null, "Canal maximo");
            }
    }
    
    public void descerCanal(){
        if(canal > 1) {
        	canal =- 1;
    	}else {
    		JOptionPane.showMessageDialog(null, "Canal minimo");
    	}
    }
    
    public void irParaCanal() {
    	int novoCanal = Integer.parseInt(JOptionPane.showInputDialog("Informe o canal que deseja entre 1 e 50"));
    	canal = novoCanal;
    }
    
    
    public void mostraStatus(){
            System.out.println("Esta no canal "+canal+", no volume "+volume);
    }
}
