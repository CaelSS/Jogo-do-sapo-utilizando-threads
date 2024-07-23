package visao;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frame extends JFrame implements ActionListener{
	
	Painel painel = new Painel();
	
	JTextField nome;
	JTextField datNasc;
	JTextField rg;
	JButton button;
	JButton button1;
	public Frame() {
		
		super();
		this.setVisible(true);
		this.setBounds(400,200,800,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setContentPane(painel);
		
		//painel.add(getNome());
		painel.add(getButton());
		painel.add(getButton1());
		this.repaint();
		this.validate();
	}
	
	public JTextField getNome() {
		if(nome == null) {
			nome = new JTextField();
			nome.setBounds(200, 50, 200, 300);
		}
		return nome;
	}

	public void setNome(JTextField nome) {
		this.nome = nome;
	}

	public JTextField getDatNasc() {
		return datNasc;
	}

	public void setDatNasc(JTextField datNasc) {
		this.datNasc = datNasc;
	}

	public JTextField getRg() {
		return rg;
	}

	public void setRg(JTextField rg) {
		this.rg = rg;
	}
	
	public JButton getButton() {
		if(button == null) {
			button = new JButton();
			button.setBounds(300, 400, 200, 100);
			button.addActionListener(this);
		}
		return button;
	}
	
	public JButton getButton1() {
		if(button1 == null) {
			button1 = new JButton();
			button1.setBounds(300, 400, 200, 100);
			button1.addActionListener(this);
		}
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == getButton()) {
			JOptionPane.showMessageDialog(null, "OK!");
		}
		
	}
}
