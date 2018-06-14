package Productor_Consumidor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import java.awt.Component;
import java.awt.Color;

public class Grafico {

	
	
	private JFrame frame;
buff buffer = new buff();
	
	productor pro1 = new productor(buffer);
	productor pro2 = new productor(buffer);
	consumidor con1 = new consumidor (buffer);
	consumidor con2 = new consumidor (buffer);
	private JTextField txtProductor1;
	private JTextField txtProductor2;
	private JButton btnNewButton;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grafico window = new Grafico();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Grafico() {
		initialize();
	}

	
	private void initialize() {
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 713, 458);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnNewButton = new JButton("New button");		
		frame.getContentPane().add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(263, 11, 407, 261);
		frame.getContentPane().add(scrollPane);
		
			
			JTextArea textArea = new JTextArea();
			scrollPane.setViewportView(textArea);
			pro1.setTextA(textArea);
			pro2.setTextA(textArea);
		
		JButton inicio1 = new JButton("Comenzar");
		inicio1.setBackground(Color.LIGHT_GRAY);
			
		inicio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pro1.productor1(txtProductor1);
				
				pro1.start();
				inicio1.setEnabled(false);
				
				
			}
		});
		inicio1.setBounds(100, 11, 104, 23);
		frame.getContentPane().add(inicio1);
		
		JButton continuar1 = new JButton("CONTINUAR");
		continuar1.setBackground(Color.LIGHT_GRAY);
		continuar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pro1.resume();
			}
		});
		
		continuar1.setBounds(100, 64, 104, 23);
		frame.getContentPane().add(continuar1);
		
		JButton continuar2 = new JButton("CONTINUAR");
		continuar2.setBackground(Color.LIGHT_GRAY);

		continuar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pro2.resume();
			}
		});
		continuar2.setBounds(100, 178, 104, 23);
		frame.getContentPane().add(continuar2);
		
		JButton inicio2 = new JButton("COMENZAR");
		inicio2.setBackground(Color.LIGHT_GRAY);
	
		inicio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pro2.productor1(txtProductor2);
				pro2.start();
				inicio2.setEnabled(false);
				
			}
		});
		inicio2.setBounds(100, 125, 104, 23);
		frame.getContentPane().add(inicio2);
		

		
		JLabel lblConsumidor_B = new JLabel("Consumidor (B)");
		lblConsumidor_B.setBounds(492, 353, 82, 14);
		frame.getContentPane().add(lblConsumidor_B);
		
		JLabel lblConsumidor_A = new JLabel("Consumidor (A)");
		lblConsumidor_A.setBounds(122, 353, 82, 14);
		frame.getContentPane().add(lblConsumidor_A);
		
		txtProductor1 = new JTextField();
		txtProductor1.setText("P (A)");
		txtProductor1.setBounds(100, 94, 86, 20);
		frame.getContentPane().add(txtProductor1);
		txtProductor1.setColumns(10);
		
		txtProductor2 = new JTextField();
		txtProductor2.setText("P (B)");
		txtProductor2.setBounds(100, 208, 86, 20);
		frame.getContentPane().add(txtProductor2);
		txtProductor2.setColumns(10);
		
		JButton pausar1 = new JButton("PARAR");
		pausar1.setBackground(Color.LIGHT_GRAY);
		
		pausar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pro1.suspend();
			}
		});
		pausar1.setBounds(100, 38, 104, 23);
		frame.getContentPane().add(pausar1);
		
		JButton pausar2 = new JButton("PARAR");
		pausar2.setBackground(Color.LIGHT_GRAY);
		pausar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pro2.suspend();
			}
		});
		
		
		pausar2.setBounds(100, 151, 104, 23);
		frame.getContentPane().add(pausar2);
		
		JButton pausar3 = new JButton("PARAR");
		pausar3.setBackground(Color.LIGHT_GRAY);
		pausar3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				con1.suspend();
			}
		});
		pausar3.setBounds(472, 319, 96, 23);
		frame.getContentPane().add(pausar3);
		
		JButton pausar4 = new JButton("PARAR");
		pausar4.setBackground(Color.LIGHT_GRAY);
		
		pausar4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				con2.suspend();
			}
		});
		pausar4.setBounds(119, 319, 96, 23);
		frame.getContentPane().add(pausar4);
		
		JLabel lblStefanoBenaventeMamani = new JLabel("STEFANO BENAVENTE MAMANI");
		lblStefanoBenaventeMamani.setBounds(277, 378, 266, 14);
		frame.getContentPane().add(lblStefanoBenaventeMamani);
			JButton inicio3 = new JButton("COMENZAR");
			inicio3.setBackground(Color.LIGHT_GRAY);
			
			inicio3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					con1.Nom(1);
					con1.start();
					
					
				}
			});
			inicio3.setBounds(22, 319, 96, 23);
			frame.getContentPane().add(inicio3);
			
			JButton continuar3 = new JButton("CONTINUAR");
			continuar3.setBackground(Color.LIGHT_GRAY);
		
			continuar3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				con1.resume();
				}
			});
			continuar3.setBounds(572, 319, 96, 23);
			frame.getContentPane().add(continuar3);

			JButton inicio4 = new JButton("COMENZAR");
			inicio4.setBackground(Color.LIGHT_GRAY);
			
			inicio4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					con2.Nom(0);
					con2.start();
					
				}
			});
			inicio4.setBounds(373, 319, 96, 23);
			frame.getContentPane().add(inicio4);
			
			
			JButton continuar4 = new JButton("CONTINUAR");
			continuar4.setBackground(Color.LIGHT_GRAY);
			
			continuar4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					con2.resume();
				}
			});
			continuar4.setBounds(217, 319, 96, 23);
			frame.getContentPane().add(continuar4);
			
			
			
			
	}
}

