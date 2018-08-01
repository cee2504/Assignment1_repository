package food;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CeePlusPlus extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CeePlusPlus frame = new CeePlusPlus();
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
	public CeePlusPlus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 566, 434);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 0, 85, 30);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Place Order");
		btnNewButton.setBounds(200, 340, 122, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(451, 340, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setBounds(186, 23, 58, 23);
		contentPane.add(lblQuantity);
		
		JLabel label = new JLabel("0");
		label.setBackground(Color.WHITE);
		label.setBounds(199, 58, 25, 21);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("0");
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(199, 109, 25, 21);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("0");
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(199, 163, 25, 21);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("0");
		label_3.setBackground(Color.WHITE);
		label_3.setBounds(199, 215, 25, 21);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("0");
		label_4.setBackground(Color.WHITE);
		label_4.setBounds(199, 272, 25, 21);
		contentPane.add(label_4);
		
		JLabel lblNewLabel_1 = new JLabel("0");
		lblNewLabel_1.setBounds(276, 60, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel label_5 = new JLabel("0");
		label_5.setBounds(276, 111, 46, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("0");
		label_6.setBounds(276, 165, 46, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("0");
		label_7.setBounds(276, 217, 46, 14);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("0");
		label_8.setBounds(276, 274, 46, 14);
		contentPane.add(label_8);	
		
		JLabel label_9 = new JLabel("0");
		label_9.setBounds(345, 315, 46, 14);
		contentPane.add(label_9);
		
		JButton btnFood = new JButton("Fried Chicken ($10)");
		btnFood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String count = label.getText();
				int quantity = Integer.parseInt(count) + 1;
				
				label.setText(Integer.toString(quantity));
				
				String price = lblNewLabel_1.getText();
				int priceTotal = Integer.parseInt(price) + 10;
				lblNewLabel_1.setText(Integer.toString(priceTotal));
				
				label_9.setText(
						Integer.toString( 	Integer.parseInt(lblNewLabel_1.getText()) +
								Integer.parseInt(label_5.getText()) +
								Integer.parseInt(label_6.getText()) +
								Integer.parseInt(label_7.getText()) +
								Integer.parseInt(label_8.getText())					
					));
				
			}
		});
		btnFood.setBounds(6, 55, 155, 23);
		contentPane.add(btnFood);
		
		JButton btnFood_1 = new JButton("Chips ($5)");
		btnFood_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String count = label_1.getText();
				int quantity = Integer.parseInt(count) + 1;
				
				label_1.setText(Integer.toString(quantity));
				
				String price = label_5.getText();
				int priceTotal = Integer.parseInt(price) + 5;
				label_5.setText(Integer.toString(priceTotal));
				
				label_9.setText(
						Integer.toString( 	Integer.parseInt(lblNewLabel_1.getText()) +
								Integer.parseInt(label_5.getText()) +
								Integer.parseInt(label_6.getText()) +
								Integer.parseInt(label_7.getText()) +
								Integer.parseInt(label_8.getText())					
					));
			}
		});
		btnFood_1.setBounds(6, 108, 155, 23);
		contentPane.add(btnFood_1);
		
		JButton btnFood_2 = new JButton("Grilled Fish ($15)");
		btnFood_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String count = label_2.getText();
				int quantity = Integer.parseInt(count) + 1;
				
				label_2.setText(Integer.toString(quantity));
				
				String price = label_6.getText();
				int priceTotal = Integer.parseInt(price) + 15;
				label_6.setText(Integer.toString(priceTotal));
				
				label_9.setText(
						Integer.toString( 	Integer.parseInt(lblNewLabel_1.getText()) +
								Integer.parseInt(label_5.getText()) +
								Integer.parseInt(label_6.getText()) +
								Integer.parseInt(label_7.getText()) +
								Integer.parseInt(label_8.getText())					
					));
			}
		});
		btnFood_2.setBounds(6, 162, 155, 23);
		contentPane.add(btnFood_2);
		
		JButton btnFood_3 = new JButton("Fruit Muffin ($9)");
		btnFood_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String count = label_3.getText();
				int quantity = Integer.parseInt(count) + 1;
				
				label_3.setText(Integer.toString(quantity));
				
				String price = label_7.getText();
				int priceTotal = Integer.parseInt(price) + 9;
				label_7.setText(Integer.toString(priceTotal));
				
				label_9.setText(
						Integer.toString( 	Integer.parseInt(lblNewLabel_1.getText()) +
								Integer.parseInt(label_5.getText()) +
								Integer.parseInt(label_6.getText()) +
								Integer.parseInt(label_7.getText()) +
								Integer.parseInt(label_8.getText())					
					));
			}
		});
		btnFood_3.setBounds(6, 214, 155, 23);
		contentPane.add(btnFood_3);
		
		JButton btnFood_4 = new JButton("Steak ($22)");
		btnFood_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String count = label_4.getText();
				int quantity = Integer.parseInt(count) + 1;
				
				label_4.setText(Integer.toString(quantity));
				
				String price = label_8.getText();
				int priceTotal = Integer.parseInt(price) + 22;
				label_8.setText(Integer.toString(priceTotal));
				
				label_9.setText(
						Integer.toString( 	Integer.parseInt(lblNewLabel_1.getText()) +
								Integer.parseInt(label_5.getText()) +
								Integer.parseInt(label_6.getText()) +
								Integer.parseInt(label_7.getText()) +
								Integer.parseInt(label_8.getText())					
					));
			}
		});
		btnFood_4.setBounds(10, 270, 151, 23);
		contentPane.add(btnFood_4);
		
		JLabel lblPrice = new JLabel("Price ($):");
		lblPrice.setBounds(276, 27, 46, 14);
		contentPane.add(lblPrice);
		
		
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("0");
				label_1.setText("0");
				label_2.setText("0");
				label_3.setText("0");
				label_4.setText("0");
				
				lblNewLabel_1.setText("0");
				label_5.setText("0");
				label_6.setText("0");
				label_7.setText("0");
				label_8.setText("0");
				
				label_9.setText("0");
			}
		});
		btnClear.setBounds(10, 340, 89, 23);
		contentPane.add(btnClear);
		
		JLabel lblTotal = new JLabel("Total ($):");
		lblTotal.setBounds(276, 315, 59, 14);
		contentPane.add(lblTotal);
		
		
	}	

}
