package cansistemi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class form {

	private JFrame frame;
	private JTextField txtogrenci1;
	private JTextField txtogrenci2;
	private JTextField txtogrenci3;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form window = new form();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtogrenci1 = new JTextField();
		txtogrenci1.setBounds(134, 14, 57, 28);
		frame.getContentPane().add(txtogrenci1);
		txtogrenci1.setColumns(10);
		
		JLabel lblrenciNotu = new JLabel("1.\u00F6\u011Frenci notu :");
		lblrenciNotu.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblrenciNotu.setBounds(10, 11, 124, 28);
		frame.getContentPane().add(lblrenciNotu);
		
		JLabel lblrenciNotu_1 = new JLabel("2.\u00F6\u011Frenci notu :");
		lblrenciNotu_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblrenciNotu_1.setBounds(10, 50, 124, 22);
		frame.getContentPane().add(lblrenciNotu_1);
		
		JLabel lblrenciNotu_2 = new JLabel("3.\u00F6\u011Frenci notu:");
		lblrenciNotu_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblrenciNotu_2.setBounds(10, 88, 124, 27);
		frame.getContentPane().add(lblrenciNotu_2);
		
		txtogrenci2 = new JTextField();
		txtogrenci2.setBounds(134, 54, 57, 29);
		frame.getContentPane().add(txtogrenci2);
		txtogrenci2.setColumns(10);
		
		txtogrenci3 = new JTextField();
		txtogrenci3.setBounds(134, 94, 57, 28);
		frame.getContentPane().add(txtogrenci3);
		txtogrenci3.setColumns(10);
		
		JLabel lblSnfOrtalamas = new JLabel("S\u0131n\u0131f Ortalamas\u0131 :");
		lblSnfOrtalamas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSnfOrtalamas.setBounds(49, 145, 161, 28);
		frame.getContentPane().add(lblSnfOrtalamas);
		
		textField_3 = new JTextField();
		textField_3.setBounds(211, 146, 95, 34);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("label");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(156, 204, 103, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnhesapla = new JButton("Hesapla");
		btnhesapla.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				String ogrenci1Text = txtogrenci1.getText();
				String ogrenci2Text = txtogrenci2.getText();
				String ogrenci3Text = txtogrenci3.getText();
				
				Byte ogrenci1Not = Byte.valueOf(ogrenci1Text);
				Byte ogrenci2Not = Byte.valueOf(ogrenci2Text);
				Byte ogrenci3Not = Byte.valueOf(ogrenci3Text);
				
				float ortalama = ((ogrenci1Not + ogrenci2Not + ogrenci3Not) / 3)  ;                    
						if(ogrenci1Not>= ortalama) {
							
							JOptionPane.showMessageDialog(frame,"1.öðrenci GEÇTÝ");
							
							
						}
						else {
							float kalmanotu = ortalama-ogrenci1Not  ;
							
							JOptionPane.showMessageDialog(frame,"KALDI");
							System.out.println(kalmanotu + "puan altýnda 1.öðrenci kaldý.");
							
						}
						
                        if(ogrenci2Not>= ortalama) {
							
							JOptionPane.showMessageDialog(frame,"2.öðrenci GEÇTÝ");
							
							
						}
						else {
							float kalmanotu = ortalama-ogrenci1Not  ;
							
							JOptionPane.showMessageDialog(frame,"KALDI");
							System.out.println(kalmanotu + "puan altýnda 2.öðrenci kaldý.");
							
						}
                        
                        
                        if(ogrenci3Not>= ortalama) {
							
							JOptionPane.showMessageDialog(frame,"3.öðrenci GEÇTÝ");
							
							
						}
						else {
							float kalmanotu = ortalama-ogrenci1Not  ;
							
							JOptionPane.showMessageDialog(frame,"KALDI");
							System.out.println(kalmanotu + "puan altýnda 3.öðrenci kaldý.");
							
						}
						
						
						
			}
		});
		btnhesapla.setBounds(229, 53, 132, 28);
		frame.getContentPane().add(btnhesapla);
	}
}
