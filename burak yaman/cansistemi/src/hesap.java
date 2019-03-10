import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class hesap {

	private JFrame frame;
	private JTextField txtsayi1;
	private JTextField txtsayi2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hesap window = new hesap();
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
	public hesap() {
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
		
		
		JLabel lblNewLabel = new JLabel("1.say\u0131");
		lblNewLabel.setBounds(41, 34, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("2.say\u0131");
		lblNewLabel_1.setBounds(41, 82, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"topla", "çýkar" , "çarp" , "böl"}));
		comboBox.setBounds(241, 50, 107, 35);
		frame.getContentPane().add(comboBox);
		
		txtsayi1 = new JTextField();
		txtsayi1.setBounds(101, 31, 86, 20);
		frame.getContentPane().add(txtsayi1);
		txtsayi1.setColumns(10);
		
		txtsayi2 = new JTextField();
		txtsayi2.setBounds(97, 79, 86, 20);
		frame.getContentPane().add(txtsayi2);
		txtsayi2.setColumns(10);
		
		JButton btnNewButton = new JButton("hesapla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String islemtipi = comboBox.getSelectedItem().toString();
				String sayi1Text = txtsayi1.getText();
				String sayi2Text = txtsayi2.getText();
                String sonuc;
				
				Byte sayi1 = Byte.valueOf(sayi1Text);
				Byte sayi2 = Byte.valueOf(sayi2Text);
				
				JOptionPane.showMessageDialog(frame, islemtipi);
				
				
				
			}
		});
		btnNewButton.setBounds(152, 152, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
