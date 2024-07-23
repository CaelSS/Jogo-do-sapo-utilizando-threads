package controle;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ControleRegras extends JFrame implements ActionListener{
	
	static ControleRegras controleRegras;
	static int posicao = 0;
	
	public ControleRegras() {
		
	}

	public static ControleRegras getControleRegras() {
		if(controleRegras == null) {
			controleRegras = new ControleRegras();
		}
		return controleRegras;
	}

	public static void setControleRegras(ControleRegras controleRegras) {
		ControleRegras.controleRegras = controleRegras;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
