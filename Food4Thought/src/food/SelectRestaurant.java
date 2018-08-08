package food;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SelectRestaurant extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void SelectRestaurant() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectRestaurant frame = new SelectRestaurant();
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
	public SelectRestaurant() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("CeePlusPlus");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CeePlusPlus c = new CeePlusPlus();
				c.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 33, 124, 42);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("JuicyJ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				juicyJ j = new juicyJ();
				j.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(10, 94, 124, 42);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Zesty Zorn");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ZestyZorn z = new ZestyZorn();
				z.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(10, 153, 124, 42);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Logout");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				MainMenu m = new MainMenu();
				m.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(306, 207, 89, 23);
		contentPane.add(btnNewButton_3);
	}

}
