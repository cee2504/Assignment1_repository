package food;

import java.awt.BorderLayout;
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



public class SignUp extends JFrame {
	
	JFrame jframe;

	private JPanel contentPane;
	private JTextField name;
	private final JPasswordField passwordField = new JPasswordField();
	
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
	public void SignUp() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		setTitle("Sign Up");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(10, 28, 88, 20);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(10, 111, 88, 20);
		contentPane.add(lblPassword);
		
		name = new JTextField();
		name.setBounds(10, 59, 214, 27);
		contentPane.add(name);
		name.setColumns(10);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (name.getText().matches("^[a-zA-Z]+$")
						&& passwordField.getText().matches("^[a-zA-Z0-9]+$")
						) {

					try {
						myCon = DriverManager.getConnection(dbUrl, uname, password);
						System.out.println("DB connection successful...");
						
						String userName = name.getText();
						String userPass = passwordField.getText();
						Random rand = new Random();

						int  id = rand.nextInt(1000) + 1;
						
						String sql = "insert into user" + " (uID, uName, uPass) values (?, ?, ?)";

						preparedStmt = myCon.prepareStatement(sql);
						//set param values
						preparedStmt.setInt(1, id);
						preparedStmt.setString(2, userName);
						preparedStmt.setString(3, userPass);	
																
						preparedStmt.executeUpdate();						
						preparedStmt.close();
						myCon.close();
						
						JOptionPane.showMessageDialog(jframe, "Sign Up Success! Please login!");
						dispose();
						Login l = new Login();
						l.setVisible(true);				

					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				else if (!name.getText().matches("^[a-zA-Z]+$"))
					JOptionPane.showMessageDialog(jframe, "Username cannnot be blank, contain numbers or symbols.",
							"Oops!", JOptionPane.ERROR_MESSAGE);
				else if (!passwordField.getText().matches("^^[a-zA-Z0-9]+$"))
					JOptionPane.showMessageDialog(jframe, "Password cannnot be blank and contains no symbols.",
							"Oops!", JOptionPane.ERROR_MESSAGE);
				
				/*JOptionPane.showMessageDialog(jframe, "Sign Up Success! Please login!");
				dispose();
				Login l = new Login();
				l.setVisible(true);*/
			}
		});
		btnSignUp.setBounds(10, 230, 89, 23);
		contentPane.add(btnSignUp);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MainMenu m = new MainMenu();
				m.setVisible(true);
			}
		});
		btnBack.setBounds(139, 230, 89, 23);
		contentPane.add(btnBack);
		passwordField.setBounds(10, 142, 214, 31);
		contentPane.add(passwordField);
	}
}
