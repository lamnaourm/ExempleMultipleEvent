import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Main extends JFrame implements ActionListener {

	private JPanel contentPane;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("1");
		button.setName("b1");
		button.setBounds(37, 141, 89, 23);
		contentPane.add(button);
		button.addActionListener(this);
		
		JButton button_1 = new JButton("2");
		button_1.setName("b2");
		button_1.setBounds(136, 141, 89, 23);
		contentPane.add(button_1);
		button_1.addActionListener(this);
		
		JButton button_2 = new JButton("3");
		button_2.setName("b3");
		button_2.setBounds(235, 141, 89, 23);
		contentPane.add(button_2);
		button_2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		
		switch (b.getName()) {
		case "b1":JOptionPane.showMessageDialog(null, "Button 1");break;
		case "b2":JOptionPane.showMessageDialog(null, "Button 2");break;
		case "b3":JOptionPane.showMessageDialog(null, "Button 3");break;
		default:
			break;
		}
	}

}
