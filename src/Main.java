import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField txt_nb1;
	private JTextField txt_nb2;
	private JTextField txt_res;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ActionListener e = (event) -> {
			JButton b = (JButton)event.getSource();
			double res = 0;
			double val1 = Double.parseDouble(txt_nb1.getText());
			double val2 = Double.parseDouble(txt_nb2.getText());
			
			switch (b.getName()) {
			case "bplus":res= val1+val2; break;
			case "bmoins": res= val1-val2; break;
			case "bprod":res= val1*val2; break;
			case "bdiv":
				if(val2==0) {
					JOptionPane.showMessageDialog(null, "Division par zero");
				}else 
					res= val1/val2; 
				break;

			}
			
			txt_res.setText(String.valueOf(res));
			
			
		};
		
		JButton button = new JButton("+");
		button.setName("bplus");
		button.setBounds(41, 216, 89, 33);
		contentPane.add(button);
		button.addActionListener(e);
		
		JButton button_1 = new JButton("-");
		button_1.setName("bmoins");
		button_1.setBounds(140, 216, 89, 33);
		contentPane.add(button_1);
		button_1.addActionListener(e);
		
		JButton button_2 = new JButton("*");
		button_2.setName("bprod");
		button_2.setBounds(239, 216, 89, 33);
		contentPane.add(button_2);
		button_2.addActionListener(e);
		
		JLabel lblNewLabel = new JLabel("Calculatrice - Version 1");
		lblNewLabel.setBorder(new LineBorder(Color.PINK, 2));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(74, 28, 334, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre 1 : ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(74, 104, 128, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre 2 : ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(74, 144, 128, 29);
		contentPane.add(lblNewLabel_1_1);
		
		txt_nb1 = new JTextField();
		txt_nb1.setBounds(199, 110, 194, 20);
		contentPane.add(txt_nb1);
		txt_nb1.setColumns(10);
		txt_nb1.setDocument(new ControleDecimal());
		
		txt_nb2 = new JTextField();
		txt_nb2.setColumns(10);
		txt_nb2.setBounds(199, 150, 194, 20);
		contentPane.add(txt_nb2);
		txt_nb2.setDocument(new ControleDecimal());
		
		JButton button_2_1 = new JButton("/");
		button_2_1.setName("bdiv");
		button_2_1.setBounds(338, 216, 89, 33);
		contentPane.add(button_2_1);
		button_2_1.addActionListener(e);
		
		txt_res = new JTextField();
		txt_res.setEnabled(false);
		txt_res.setColumns(10);
		txt_res.setBounds(199, 283, 194, 20);
		contentPane.add(txt_res);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Resultat :");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(74, 277, 128, 29);
		contentPane.add(lblNewLabel_1_1_1);
	}
}
