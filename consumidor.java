package Productor_Consumidor;

import javax.swing.JTextArea;

public class consumidor extends Thread{

	private buff buffer;
	JTextArea text;
int nam;
	public void setTextA(JTextArea ta) {
		this.text = ta;
	}
	public consumidor  (buff buff){
		this.buffer = buff;
	}
	
	public void Nom(int n) {
		this.nam = n;
	}

	public void run (){

		
		for(int i = 0; i < 25; i++){
			char c;
			c = buffer.sacar();
			
			System.out.println("consumidor "+this.nam+" :"+c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	}


}


