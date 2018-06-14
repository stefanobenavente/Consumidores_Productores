package Productor_Consumidor;

import java.util.Random;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class productor extends Thread{

JTextField textF;
	
	JTextArea text;
	JScrollPane scrollP = new JScrollPane(text);
	
	private buff buffer;
	private String abecedario = "ABCDEFGHIJKLMÑNOPQRSTUVWXYZCH";
	private char letras;
	
	String nombre;
	
	private Random random = new Random();
	
	
	
	public void productor1(JTextField tf) {
		this.nombre = tf.getText();
	}
	
	public void setTextA(JTextArea ta) {
		this.text = ta;
	}
	public void setScroll(JScrollPane sp) {
		this.scrollP = sp;
		
	}
	
	
	public productor (buff b){
		this.buffer = b;
	}
	
public void run (){
		
		for (int a = 0; a < 20 ; a++){
			 letras= abecedario.charAt(random.nextInt(26));
			buffer.poner(letras);
			text.append(this.nombre+" -> " +letras+"\n");
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
}


