package controle;

import java.util.Random;

import javax.swing.JOptionPane;

import visao.Frame;

public class ControleThread implements Runnable{
	
	ControleRegras ControleRegras;
	String id;
	
	
	public ControleThread(String id, ControleRegras ControleRegras) {
		this.id = id;
		this.ControleRegras = ControleRegras;
		
	}
	Random rand = new Random();
	@Override
	public void run() {
    	int pulo = 0;
    	int randInt = 0;
    	ControleRegras.setPosicao(0);
    	int distancia = 0;
    	try {
		
    		for (int i = 0; i < 100; i = i + randInt){
				
				randInt = rand.nextInt(5)+1;
				distancia = distancia + randInt;
				System.out.println("Sapinho pulou :" + randInt);
				System.out.println("Sapinho "+ id + " está aqui :" + distancia);
				
				if(ControleRegras.getPosicao() == 0 && distancia >= 100) {
					ControleRegras.setPosicao(1);
					
				}else if(ControleRegras.getPosicao() == 1 && distancia >= 100) {
					ControleRegras.setPosicao(2);
					
				}else if(ControleRegras.getPosicao() == 2 && distancia >= 100) {
					ControleRegras.setPosicao(3);
					
				}
			}
    		
    		JOptionPane.showMessageDialog(null,"Sapo " + id + " ficou " + ControleRegras.getPosicao());
			
		}catch (Exception e) {}
    }
}
