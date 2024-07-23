package controle;

import visao.Frame;


public class TesteThread {
	
	

	static ControleThread t1 = new ControleThread("A", ControleRegras.getControleRegras());
	static ControleThread t2 = new ControleThread("B", ControleRegras.getControleRegras());
	static ControleThread t3 = new ControleThread("C", ControleRegras.getControleRegras());
	
    public static void main(String[] args) {
    	 	
    	 new Thread(t1).start();
    	 new Thread(t2).start();
    	 new Thread(t3).start();
    	  	 
    }  
}
