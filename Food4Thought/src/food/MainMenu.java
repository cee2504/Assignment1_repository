package food;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import food.SignUp;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	//This is the main menu
	public MainMenu() {
		setTitle("Main Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				SignUp s = new SignUp();
				s.setVisible(true);
			}
		});
		btnSignUp.setBounds(58, 109, 89, 23);
		contentPane.add(btnSignUp);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login s = new Login();
				s.setVisible(true);
			}
		});
		btnLogin.setBounds(246, 109, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnLoginAsGuess = new JButton("Login as Guess");
		btnLoginAsGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				SelectRestaurant r = new SelectRestaurant();
				r.setVisible(true);
			}
		});
		btnLoginAsGuess.setBounds(141, 194, 131, 23);
		contentPane.add(btnLoginAsGuess);
	}

}
