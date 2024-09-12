package view;
import controller.Button;
import controller.Field;
import model.Parc;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.DropMode;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Programme extends JFrame{

	private JPanel contentPane;
	private JPanel p5;
	private JPanel p4;
	private JPanel p3;
	private JPanel p2;
	private JPanel p1;
	private JLayeredPane layeredPane;
	private JTextField txtId;
	private JTextField textField;
	private JTextField textField_1;

	


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Programme frame = new Programme();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void switchPanels(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
	
	public Programme() {
		Parc P = new Parc("contient", 100, 0);
		P.load();
		setBackground(new Color(55, 55, 55));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(55, 55, 55));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(161, 59, 543, 382);
		contentPane.add(layeredPane);
		
		p1 = new JPanel();
		p1.setBackground(new Color(0, 0, 128));
		p1.setBounds(0, 0, 543, 382);
		layeredPane.add(p1);
		p1.setLayout(null);
		
		JLabel l1 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/1.png")).getImage();
		
		JLabel lblNewLabel_2 = new JLabel("ID Scooter");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBackground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Open Sans SemiBold", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(57, 74, 141, 40);
		p1.add(lblNewLabel_2);
		
		txtId = new JTextField();
		txtId.setName("1");
		
		txtId.setForeground(new Color(91, 91, 91));
		txtId.setFont(new Font("Source Sans Pro SemiBold", Font.BOLD, 20));
		txtId.setHorizontalAlignment(SwingConstants.LEFT);
		txtId.setBounds(194, 75, 147, 40);
		p1.add(txtId);
		txtId.setColumns(10);
		l1.setIcon(new ImageIcon(img1));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setBounds(0, 0, 543, 382);
		p1.add(l1);
		
		p2 = new JPanel();
		p2.setBackground(new Color(255, 0, 0));
		p2.setBounds(0, 0, 543, 382);
		layeredPane.add(p2);
		p2.setLayout(null);
		
		JLabel l2 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/2.png")).getImage();
		
		JLabel lblNewLabel_2_1 = new JLabel("ID Scooter");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Open Sans SemiBold", Font.BOLD, 20));
		lblNewLabel_2_1.setBackground(Color.RED);
		lblNewLabel_2_1.setBounds(57, 74, 141, 40);
		p2.add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setName("2");
		
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setForeground(new Color(91, 91, 91));
		textField.setFont(new Font("Source Sans Pro SemiBold", Font.BOLD, 20));
		textField.setColumns(10);
		textField.setBounds(194, 75, 147, 40);
		p2.add(textField);
		l2.setIcon(new ImageIcon(img2));
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setBounds(0, 0, 543, 382);
		p2.add(l2);
		
		p3 = new JPanel();
		p3.setBounds(0, 0, 543, 382);
		layeredPane.add(p3);
		p3.setLayout(null);
		
		JLabel l3 = new JLabel("");
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		Image img3 = new ImageIcon(this.getClass().getResource("/3.png")).getImage();
		
		JLabel lblNewLabel_2_1_1 = new JLabel("ID Scooter");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1.setFont(new Font("Open Sans SemiBold", Font.BOLD, 20));
		lblNewLabel_2_1_1.setBackground(Color.RED);
		lblNewLabel_2_1_1.setBounds(57, 74, 141, 40);
		p3.add(lblNewLabel_2_1_1);
		
		textField_1 = new JTextField();
		textField_1.setName("3");
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setForeground(new Color(91, 91, 91));
		textField_1.setFont(new Font("Source Sans Pro SemiBold", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(194, 75, 147, 40);
		p3.add(textField_1);
	
		l3.setIcon(new ImageIcon(img3));
		l3.setBounds(0, 0, 543, 382);
		p3.add(l3);
		
		p4 = new JPanel();
		p4.setBounds(0, 0, 543, 382);
		layeredPane.add(p4);
		p4.setLayout(null);
		
		JLabel l4 = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/4.png")).getImage();
		l4.setIcon(new ImageIcon(img4));
		l4.setHorizontalAlignment(SwingConstants.CENTER);
		l4.setBounds(0, 0, 543, 382);
		p4.add(l4);
		
		p5 = new JPanel();
		p5.setBounds(0, 0, 543, 382);
		layeredPane.add(p5);
		p5.setLayout(null);
		
		JLabel l5 = new JLabel("");
		Image img5 = new ImageIcon(this.getClass().getResource("/5.png")).getImage();
		l5.setIcon(new ImageIcon(img5));
		l5.setHorizontalAlignment(SwingConstants.CENTER);
		l5.setBounds(0, 0, 543, 382);
		p5.add(l5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 0, 0));
		panel_1.setBounds(0, 59, 160, 63);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Louer un Scooter");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(p1);
			}
		});
		btnNewButton_1.addActionListener(new Button(btnNewButton_1,txtId,P));
		
		btnNewButton_1.setFont(new Font("Source Sans Pro Light", Font.PLAIN, 14));
		btnNewButton_1.setBounds(0, 0, 160, 63);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(81, 81, 81));
		panel_2.setBounds(0, 123, 160, 63);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Retourner un Scooter");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(p2);
			}
		});
		btnNewButton_2.addActionListener(new Button(btnNewButton_2,textField,P));
		btnNewButton_2.setFont(new Font("Source Sans Pro Light", Font.PLAIN, 14));
		btnNewButton_2.setBounds(0, 0, 160, 63);
		panel_2.add(btnNewButton_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(81, 81, 81));
		panel_3.setBounds(0, 186, 160, 63);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("Etat d'un Scooter");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(p3);
			}
		});
		btnNewButton_3.addActionListener(new Button(btnNewButton_3,textField_1,P));
		btnNewButton_3.setFont(new Font("Source Sans Pro Light", Font.PLAIN, 14));
		btnNewButton_3.setBounds(0, 0, 160, 63);
		panel_3.add(btnNewButton_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(81, 81, 81));
		panel_4.setBounds(0, 249, 160, 63);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("Etat du Parc");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(p4);
			}
		});
		btnNewButton_4.addActionListener(new Button(btnNewButton_4,P));
		btnNewButton_4.setFont(new Font("Source Sans Pro Light", Font.PLAIN, 14));
		btnNewButton_4.setBounds(0, 0, 160, 63);
		panel_4.add(btnNewButton_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(81, 81, 81));
		panel_5.setBounds(0, 313, 160, 63);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton_5 = new JButton("Saisie du Parc");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(p5);
			}
		});
		btnNewButton_5.addActionListener(new Button(btnNewButton_5,P));
		btnNewButton_5.setFont(new Font("Source Sans Pro Light", Font.PLAIN, 14));
		btnNewButton_5.setBounds(0, 0, 160, 63);
		panel_5.add(btnNewButton_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(81, 81, 81));
		panel_6.setBounds(0, 378, 160, 63);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		JButton btnNewButton_6 = new JButton("Quitter le programme");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("EXIT");
				if(JOptionPane.showConfirmDialog(frame, "Voulez vous vraiment quitter le programme?",
						"Quitter", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton_6.addActionListener(new Button(btnNewButton_6,P));
		btnNewButton_6.setFont(new Font("Source Sans Pro Light", Font.PLAIN, 14));
		btnNewButton_6.setBounds(0, 0, 160, 63);
		panel_6.add(btnNewButton_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(0, 0, 160, 441);
		contentPane.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setFont(new Font("Source Code Pro Light", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 160, 57);
		panel_7.add(lblNewLabel);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(81, 81, 81));
		panel_8.setBounds(0, 0, 704, 58);
		contentPane.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("LOUSCOUT");
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Source Sans Pro Light", Font.BOLD, 32));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(161, 0, 543, 58);
		panel_8.add(lblNewLabel_1);
		
		txtId.addActionListener(new Field(btnNewButton_1,P));
		textField.addActionListener(new Field(btnNewButton_2,P));
		textField_1.addActionListener(new Field(btnNewButton_3,P));
	}
}