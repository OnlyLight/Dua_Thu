package ued.tqduy.view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ued.tqduy.bussiness.DButilt;
import ued.tqduy.bussiness.MD5Library;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class UpdateInfo extends JFrame {

	private static UpdateInfo frameUpdate;
	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtName;
	private JTextField txtClass;
	private JTextField txtAdd;
	private JTextField txtPass;
	private JLabel lbID;
	private JLabel lbName;
	private JLabel lbClass;
	private JLabel lbAddress;
	private JLabel lbPass;
	private JLabel lbIcon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frameUpdate = new UpdateInfo();
					frameUpdate.setResizable(false);
					frameUpdate.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UpdateInfo() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 341);
		
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, Color.RED, new Color(64, 64, 64), null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADD INFOMATION USER");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(90, 11, 254, 40);
		contentPane.add(lblNewLabel);
		
		lbID = new JLabel("ID");
		lbID.setBounds(106, 76, 46, 14);
		contentPane.add(lbID);
		
		lbName = new JLabel("Name");
		lbName.setBounds(106, 106, 46, 14);
		contentPane.add(lbName);
		
		lbClass = new JLabel("Class");
		lbClass.setBounds(106, 141, 46, 14);
		contentPane.add(lbClass);
		
		lbAddress = new JLabel("Address");
		lbAddress.setBounds(106, 177, 57, 14);
		contentPane.add(lbAddress);
		
		lbPass = new JLabel("Pass");
		lbPass.setBounds(106, 213, 46, 14);
		contentPane.add(lbPass);
		
		JButton btnAdd = new JButton("Add Data");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnAddClicked();
			}
		});
		
		InfoUser.setIconButton(btnAdd, "add");
		btnAdd.setBounds(158, 257, 128, 34);
		contentPane.add(btnAdd);
		
		txtID = new JTextField();
		txtID.setColumns(10);
		txtID.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtID.setBounds(182, 70, 223, 20);
		contentPane.add(txtID);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtName.setBounds(182, 103, 223, 20);
		contentPane.add(txtName);
		
		txtClass = new JTextField();
		txtClass.setColumns(10);
		txtClass.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtClass.setBounds(182, 138, 223, 20);
		contentPane.add(txtClass);
		
		txtAdd = new JTextField();
		txtAdd.setColumns(10);
		txtAdd.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtAdd.setBounds(182, 174, 223, 20);
		contentPane.add(txtAdd);
		
		txtPass = new JTextField();
		txtPass.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent evt) {
				if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
					btnAdd.doClick();
				}
			}
		});
		txtPass.setColumns(10);
		txtPass.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtPass.setBounds(182, 210, 223, 20);
		contentPane.add(txtPass);
		
		lbIcon = new JLabel("New label");
		lbIcon.setBounds(10, 76, 86, 71);
		contentPane.add(lbIcon);
		
		StudentManager.setAva(lbIcon, "update-icon");
	}
	
	private void btnAddClicked() {
		String pass = MD5Library.md5(txtPass.getText().toString());
		
		if(txtID.getText().toString().isEmpty() || txtName.getText().toString().isEmpty() || txtClass.getText().toString().isEmpty() || txtAdd.getText().toString().isEmpty() || pass.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Please enter full data !!");
		} else {
			int click = JOptionPane.showConfirmDialog(null, "Do you want insert ?", "INSERT", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (click == JOptionPane.YES_OPTION) {
				DButilt.insert(txtID.getText().toString(), txtName.getText().toString(), txtClass.getText().toString(), txtAdd.getText().toString(), pass);
				StudentManager.loadTable();
			}
		}
	}
}
