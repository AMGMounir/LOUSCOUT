package view;

import controller.Button;
import controller.Field;
import model.Parc;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Font;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

import javax.swing.JLabel;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

import javax.swing.JLayeredPane;

import javax.swing.JScrollPane;

import javax.swing.ScrollPaneConstants;

import javax.swing.JTable;

public class Programme extends JFrame {

	private JPanel contentPane;

	private JPanel p3;
	public JPanel p2;
	private JPanel p1;
	private JLayeredPane layeredPane;
	private JTextField txtId;
	private JTextField textField;
	private JTextField textField_1;
	Parc p;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Parc p = new Parc("contient", 0);
					Programme frame = new Programme(p);
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Programme(Parc pp) {

		Parc p = pp;
		p.load();
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

		JPanel p4 = new JPanel();
		p4.setBounds(0, 0, 543, 382);
		layeredPane.add(p4);
		p4.setLayout(null);

		JPanel panel_11 = new JPanel();
		panel_11.setLocation(70, 50);
		panel_11.setSize(400, 275);
		p4.add(panel_11);
		panel_11.setLayout(null);

		String[] columnNames = { "Marque", "Modele", "Couleur", "id", "Km", "etat" };
		DefaultTableModel model = new DefaultTableModel(columnNames, 0);
		JTable list1 = new JTable(model);
		list1.setEnabled(false);

		list1.setBounds(0, 0, 385, 270);
		panel_11.add(list1);

		Image img4 = new ImageIcon(this.getClass().getResource("/4.png")).getImage();
		JLabel l4 = new JLabel("");
		l4.setSize(543, 382);
		l4.setHorizontalAlignment(SwingConstants.CENTER);
		l4.setIcon(new ImageIcon(img4));
		p4.add(l4);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 0, 0));
		panel_1.setBounds(0, 59, 160, 63);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JButton btnNewButton_1 = new JButton("Louer un Scooter");
		btnNewButton_1.addActionListener(new Button(btnNewButton_1, txtId, p, p1, layeredPane));

		JPanel panel_10 = new JPanel();
		panel_10.setBounds(0, 150, 543, 100);
		p1.add(panel_10);

		JLabel lblNewLabel_3_1_1 = new JLabel("rep");
		panel_10.add(lblNewLabel_3_1_1);

		btnNewButton_1.setFont(new Font("Source Sans Pro Light", Font.PLAIN, 14));
		btnNewButton_1.setBounds(0, 0, 160, 63);
		panel_1.add(btnNewButton_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(81, 81, 81));
		panel_2.setBounds(0, 123, 160, 63);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JButton btnNewButton_2 = new JButton("Retourner un Scooter");

		btnNewButton_2.addActionListener(new Button(btnNewButton_2, textField, p, p2, layeredPane));

		JPanel panel_9 = new JPanel();
		panel_9.setBounds(0, 150, 543, 100);
		p2.add(panel_9);

		JLabel lblNewLabel_3_1 = new JLabel("rep");
		panel_9.add(lblNewLabel_3_1);
		btnNewButton_2.setFont(new Font("Source Sans Pro Light", Font.PLAIN, 14));
		btnNewButton_2.setBounds(0, 0, 160, 63);
		panel_2.add(btnNewButton_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(81, 81, 81));
		panel_3.setBounds(0, 186, 160, 63);
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		JButton btnNewButton_3 = new JButton("Etat d'un Scooter");

		btnNewButton_3.addActionListener(new Button(btnNewButton_3, textField_1, p, p3, layeredPane));

		JPanel panel = new JPanel();

		panel.setBounds(167, 150, 198, 193);
		p3.add(panel);
		btnNewButton_3.setFont(new Font("Source Sans Pro Light", Font.PLAIN, 14));
		btnNewButton_3.setBounds(0, 0, 160, 63);
		panel_3.add(btnNewButton_3);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(81, 81, 81));
		panel_4.setBounds(0, 249, 160, 63);
		contentPane.add(panel_4);
		panel_4.setLayout(null);

		JButton btnNewButton_4 = new JButton("Etat du Parc");
		btnNewButton_4.setFont(new Font("Source Sans Pro Light", Font.PLAIN, 14));
		btnNewButton_4.setBounds(0, 0, 160, 63);
		panel_4.add(btnNewButton_4);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(81, 81, 81));
		panel_5.setBounds(0, 313, 160, 63);
		contentPane.add(panel_5);
		panel_5.setLayout(null);

		JButton btnNewButton_5 = new JButton("Saisie du Parc");
		btnNewButton_5.setFont(new Font("Source Sans Pro Light", Font.PLAIN, 14));
		btnNewButton_5.setBounds(0, 0, 160, 63);
		panel_5.add(btnNewButton_5);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(81, 81, 81));
		panel_6.setBounds(0, 378, 160, 63);
		contentPane.add(panel_6);
		panel_6.setLayout(null);

		JButton btnNewButton_6 = new JButton("Quitter le programme");
		btnNewButton_6.addActionListener(new Button(btnNewButton_6, p));
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

		JLabel lblNewLabel_3 = new JLabel("Etat :");
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Marque :");
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Modele :");
		panel.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Couleur");
		panel.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Kilometrage :");
		panel.add(lblNewLabel_7);

		JPanel p5 = new JPanel();
		p5.setBounds(0, 0, 543, 382);
		layeredPane.add(p5);
		JLabel l5 = new JLabel("");
		l5.setLocation(0, 0);
		l5.setHorizontalAlignment(SwingConstants.CENTER);
		JPanel panel_11_1 = new JPanel();
		panel_11_1.setBounds(70, 50, 400, 275);
		panel_11_1.setLayout(null);
		p5.add(panel_11_1);

		Image img5 = new ImageIcon(this.getClass().getResource("/5.png")).getImage();
		p5.setLayout(null);
		l5.setSize(543, 382);
		l5.setIcon(new ImageIcon(img5));
		p5.add(l5);

		String[] columnNames2 = { "Nb de Scooters", "Scooters en Loc", "Scooter Dispos", "Km moyen" };
		DefaultTableModel model2 = new DefaultTableModel(columnNames2, 0);
		JTable list2 = new JTable(model2);
		list2.setEnabled(false);
		list2.setBounds(0, 0, 385, 270);
		panel_11_1.add(list2);

		txtId.addActionListener(new Field(btnNewButton_1, p, panel_10, layeredPane, lblNewLabel_3_1_1));
		textField_1.addActionListener(new Field(btnNewButton_3, p, panel, layeredPane, lblNewLabel_3, lblNewLabel_4,
				lblNewLabel_5, lblNewLabel_6, lblNewLabel_7));
		textField.addActionListener(new Field(btnNewButton_2, p, panel_9, layeredPane, lblNewLabel_3_1));

		btnNewButton_4.addActionListener(new Button(btnNewButton_4, p, p4, layeredPane, list1, model));

		JScrollPane scrollPane_1 = new JScrollPane(list1);
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(0, 0, 400, 275);
		panel_11.add(scrollPane_1);

		JScrollPane scrollPane_2 = new JScrollPane(list2);
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setBounds(0, 0, 400, 275);
		panel_11_1.add(scrollPane_2);

		btnNewButton_5.addActionListener(new Button(btnNewButton_5, p, p5, layeredPane, list2, model2));

	}
}