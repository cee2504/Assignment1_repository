package food;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {
	
	JFrame jframe;

	private JPanel contentPane;
	private JTextField name;
	private JPasswordField passwordField;
	
	private static Connection myCon = null;
	private static Statement stmt = null;
	private static PreparedStatement preparedStmt = null;
	private static ResultSet rs = null;

	static final String dbUrl = "jdbc:mysql://localhost:3306/food";
	static final String uname = "root";
	static final String password = "";

	/**
	 * Launch the application.
	 */
	public void Login() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 436, 263);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Username:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(10, 28, 88, 20);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Password:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(10, 111, 88, 20);
		panel.add(label_1);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(10, 59, 214, 27);
		panel.add(name);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					myCon = DriverManager.getConnection(dbUrl, uname, password);
					System.out.println("DB connection successful...");
					
					String userName = name.getText();
					String userPass = passwordField.getText();
					
					
					String sql = "select * from user where uName = '" + name.getText() + "'";

					preparedStmt = myCon.prepareStatement(sql);
					rs = preparedStmt.executeQuery();
					
					if (rs.next()) {

						if (userPass.equals(rs.getString("uPass"))) {
							JOptionPane.showMessageDialog(jframe, "Login Success!");	
							dispose();
							SelectRestaurant r = new SelectRestaurant();
							r.setVisible(true);
						}

						else
							JOptionPane.showMessageDialog(null, "Incorrect password", "Oops!",
									JOptionPane.ERROR_MESSAGE);
					} else
						JOptionPane.showMessageDialog(null, "No such Business email address in database!", "Oops!",
								JOptionPane.ERROR_MESSAGE);			

				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnLogin.setBounds(10, 230, 89, 23);
		panel.add(btnLogin);
		
		JButton button_1 = new JButton("Back");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MainMenu m = new MainMenu();
				m.setVisible(true);
			}
		});
		button_1.setBounds(139, 230, 89, 23);
		panel.add(button_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(10, 142, 214, 33);
		panel.add(passwordField);
	}
}
