package food;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.border.MatteBorder;
import javax.swing.JSpinner;

public class juicyJ extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField total;
	
	private static Connection myCon = null;
	private static Statement stmt = null;
	private static PreparedStatement preparedStmt = null;
	private static ResultSet rs = null;

	static final String dbUrl = "jdbc:mysql://localhost:3306/food";
	static final String uname = "root";
	static final String password = "";
	
	JFrame jframe;

	/**
	 * Launch the application.
	 */
	public void juicyJ() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					juicyJ frame = new juicyJ();
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
	public juicyJ() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 748, 591);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblJuicyJsJuices = new JLabel("Juicy J's Juices ");
		lblJuicyJsJuices.setForeground(Color.ORANGE);
		lblJuicyJsJuices.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblJuicyJsJuices.setBounds(270, 24, 205, 53);
		contentPane.add(lblJuicyJsJuices);
		
		JLabel lblAlwaysJuicy = new JLabel("Fresh Pressed Juices");
		lblAlwaysJuicy.setForeground(UIManager.getColor("InternalFrame.activeTitleBackground"));
		lblAlwaysJuicy.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAlwaysJuicy.setBounds(286, 72, 172, 29);
		contentPane.add(lblAlwaysJuicy);
		
		JLabel label = new JLabel("0");
		label.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label.setBackground(Color.WHITE);
		label.setBounds(221, 150, 32, 16);
		contentPane.add(label); 
		
		JButton btnOrangeJuice = new JButton("Orange Juice - $6");
		btnOrangeJuice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String count = label.getText();
				int quantity = Integer.parseInt(count) + 1;
				
				label.setText(Integer.toString(quantity));
			}
		});
		btnOrangeJuice.setForeground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		btnOrangeJuice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnOrangeJuice.setBounds(46, 140, 150, 39);
		contentPane.add(btnOrangeJuice);
		
		JLabel label_1 = new JLabel("0");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(221, 217, 32, 16);
		contentPane.add(label_1);
		
		JButton btnGreenJuice = new JButton("Green Juice - $7");
		btnGreenJuice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String count = label_1.getText();
				int quantity = Integer.parseInt(count) + 1;
				
				label_1.setText(Integer.toString(quantity));
			}
		});
		btnGreenJuice.setForeground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		btnGreenJuice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnGreenJuice.setBounds(46, 205, 150, 39);
		contentPane.add(btnGreenJuice);
		
		JLabel label_3 = new JLabel("0");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_3.setBackground(Color.WHITE);
		label_3.setBounds(221, 357, 32, 16);
		contentPane.add(label_3);
		
		JLabel label_2 = new JLabel("0");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(221, 288, 32, 16);
		contentPane.add(label_2);
		JButton btnPineappleJuice = new JButton("Carrot Juice - $6");
		btnPineappleJuice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String count = label_2.getText();
				int quantity = Integer.parseInt(count) + 1;
				
				label_2.setText(Integer.toString(quantity));
			}
		});
		btnPineappleJuice.setForeground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		btnPineappleJuice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPineappleJuice.setBounds(46, 276, 150, 39);
		contentPane.add(btnPineappleJuice);
		
		JButton btnAppleJuice = new JButton("Apple Juice - $5");
		btnAppleJuice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String count = label_3.getText();
				int quantity = Integer.parseInt(count) + 1;
				
				label_3.setText(Integer.toString(quantity));
				
			}
		});
		btnAppleJuice.setForeground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		btnAppleJuice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAppleJuice.setBounds(46, 345, 150, 39);
		contentPane.add(btnAppleJuice);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQuantity.setBounds(201, 109, 66, 27);
		contentPane.add(lblQuantity);
		
		
		JLabel lblCustomerInformation = new JLabel("Customer Information");
		lblCustomerInformation.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCustomerInformation.setBounds(483, 109, 157, 27);
		contentPane.add(lblCustomerInformation);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFirstName.setBounds(406, 140, 89, 23);
		contentPane.add(lblFirstName);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(507, 140, 193, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(507, 176, 193, 20);
		contentPane.add(textField_1);
		
		JLabel label_6 = new JLabel("Phone:");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_6.setBounds(406, 221, 52, 14);
		contentPane.add(label_6);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(507, 218, 193, 20);
		contentPane.add(textField_2);
		
		JLabel label_7 = new JLabel("Address:");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_7.setBounds(406, 270, 105, 14);
		contentPane.add(label_7);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(new Color(0, 0, 0));
		textArea.setBounds(406, 295, 294, 78);
		contentPane.add(textArea);
		
		JLabel label_8 = new JLabel("Last Name:");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_8.setBounds(406, 176, 89, 23);
		contentPane.add(label_8);
		
		JButton btnPlaceOrder = new JButton("Clear");
		btnPlaceOrder.setForeground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		btnPlaceOrder.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnPlaceOrder.setBounds(172, 482, 89, 29);
		contentPane.add(btnPlaceOrder);
		
		
		JButton btnClear = new JButton("Back");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				SelectRestaurant m = new SelectRestaurant();
				m.setVisible(true);					
			}
		});
		btnClear.setForeground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnClear.setBounds(46, 482, 81, 29);
		contentPane.add(btnClear);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 165, 0)));
		panel.setBounds(0, 0, 730, 544);
		contentPane.add(panel);
		panel.setLayout(null);
		
		total = new JTextField();
		total.setBounds(207, 407, 68, 31);
		panel.add(total);
		total.setColumns(10);
		
		JButton btnClickForPrice = new JButton("Click for Price ($)");
		btnClickForPrice.setBackground(UIManager.getColor("FormattedTextField.selectionBackground"));
		btnClickForPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int orange = Integer.parseInt(label.getText()) * 6;
				int green = Integer.parseInt(label_1.getText()) * 7;
				int carrot = Integer.parseInt(label_2.getText()) * 6;
				int apple = Integer.parseInt(label_3.getText()) * 5;
				
				String totalPrice = Integer.toString(orange + green + carrot + apple);
				total.setText(totalPrice);
				
			}
		});
		btnClickForPrice.setForeground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		btnClickForPrice.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnClickForPrice.setBounds(46, 405, 149, 33);
		panel.add(btnClickForPrice);
		
		JButton button = new JButton("Place Order");
		button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if ( !textField.equals(null) && !textField_1.equals(null) && !textField_2.equals(null) && !textArea.equals(null)
							) {

						try {
							myCon = DriverManager.getConnection(dbUrl, uname, password);
							System.out.println("DB connection successful...");
							
							int orangeNum = Integer.parseInt(label.getText());
							int greenNum = Integer.parseInt(label_1.getText());
							int carrotNum = Integer.parseInt(label_2.getText());
							int appleNum = Integer.parseInt(label_3.getText());
							int totalPrice = Integer.parseInt(total.getText());
							
							String jFirstName = textField.getText();
							String jLastName = textField_1.getText();
							String jPhone = textField_2.getText();
							String jAddress = textArea.getText();
							
							Random rand = new Random();
							int  id = rand.nextInt(1000) + 1;
							int minutes = rand.nextInt(60);
							String time = Integer.toString(minutes) + "m";
							
							String sql = "insert into juicyj" + " (orderID, orange, green, carrot, apple, total, firstName, lastName, phone, address) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

							preparedStmt = myCon.prepareStatement(sql);
							//set param values
							preparedStmt.setInt(1, id);
							preparedStmt.setInt(2, orangeNum);
							preparedStmt.setInt(3, greenNum);
							preparedStmt.setInt(4, carrotNum);
							preparedStmt.setInt(5, appleNum);
							preparedStmt.setString(6, Integer.toString(totalPrice));
							preparedStmt.setString(7, jFirstName);
							preparedStmt.setString(8, jLastName);
							preparedStmt.setString(9, jPhone);
							preparedStmt.setString(10, jAddress);
																	
							preparedStmt.executeUpdate();						
							preparedStmt.close();
							myCon.close();
							
							JOptionPane.showMessageDialog(jframe, "Order Placed!\n" + "Total Price: "+  total.getText() + "$\n" + "Time estimated: " + time);
										

						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}
					
				}
			//});
			//}
		});
		
		button.setBounds(306, 428, 117, 39);
		panel.add(button);
		button.setForeground(new Color(255, 140, 0));
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
	}
}
