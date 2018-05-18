package ued.tqduy.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

import ued.tqduy.view.Login;
import ued.tqduy.view.ViewResult;
import ued.tqduy.bussiness.DButilt;
import ued.tqduy.bussiness.MD5Library;

public class ViewResult extends JFrame {

	private JPanel contentPane;
	private static JTable table;
	private static DefaultTableModel tableModel;
//	public static JTextField txtID;
//	public static JTextField txtName;
//	public static JTextField txtClass;
//	public static JTextField txtAdd;
//	private JTextField txtPass;
//	private JComboBox comboBox;
//	private JComboBox cbAdd;
	private JLabel lbStManager;
//	private JButton btnFill;
//	private JButton btnUpdate;
//	private JButton btnAdd;
//	private JButton btnDel;
//	private JButton btnSearch;
	private JLabel label;
	private JLabel lbInfo;
	private JLabel lbInfoDetail;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewResult frame = new ViewResult();
					frame.setResizable(false);
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
	public ViewResult() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("List Of Student");
		setBounds(100, 100, 580, 651);
		
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, Color.RED, new Color(64, 64, 64), null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbStManager = new JLabel("DANH SÁCH SINH VIÊN");
		lbStManager.setBackground(Color.WHITE);
		lbStManager.setForeground(Color.GRAY);
		lbStManager.setFont(new Font("Segoe Print", Font.BOLD, 22));
		lbStManager.setBounds(150, 22, 295, 29);
		contentPane.add(lbStManager);
		
//		txtID = new JTextField();
//		txtID.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
//		txtID.setBounds(94, 372, 223, 20);
//		contentPane.add(txtID);
//		txtID.setColumns(10);
//		
//		btnFill = new JButton("Fill Data");
//		btnFill.setForeground(Color.RED);
//		btnFill.setBackground(Color.DARK_GRAY);
//		
//		// SHOW TABLE
//		btnFill.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				btnFillClicked();
//			}
//		});
//		btnFill.setBounds(337, 433, 107, 25);
//		contentPane.add(btnFill);
//		
//		btnUpdate = new JButton("Update Data");
//		btnUpdate.setForeground(Color.MAGENTA);
//		btnUpdate.setBackground(Color.LIGHT_GRAY);
//		
//		// EVENT FOR UPDATE
//		btnUpdate.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				btnUpdateClicked();
//			}
//		});
//		btnUpdate.setBounds(337, 469, 107, 25);
//		contentPane.add(btnUpdate);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		scrollPane_1.setBounds(29, 158, 508, 312);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
//		table.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent arg0) {
//				tableMouseClicked(); // SHOW INFO DATA CLICK
//				btnUpdate.setText("Save");
//			}
//		});
		loadTable();
		scrollPane_1.setViewportView(table);
		
//		txtName = new JTextField();
//		txtName.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
//		txtName.setColumns(10);
//		txtName.setBounds(94, 414, 223, 20);
//		contentPane.add(txtName);
//		
//		txtClass = new JTextField();
//		txtClass.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
//		txtClass.setColumns(10);
//		txtClass.setBounds(94, 460, 223, 20);
//		contentPane.add(txtClass);
//		
//		txtAdd = new JTextField();
//		txtAdd.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
//		txtAdd.setColumns(10);
//		txtAdd.setBounds(94, 507, 223, 20);
//		contentPane.add(txtAdd);
//		
//		txtPass = new JTextField();
//		txtPass.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
//		txtPass.setColumns(10);
//		txtPass.setBounds(94, 552, 223, 20);
////		txtPass.setVisible(false);
//		contentPane.add(txtPass);
		
//		btnAdd = new JButton("Add Data");
//		btnAdd.setForeground(Color.MAGENTA);
//		btnAdd.setBackground(Color.LIGHT_GRAY);
//		btnAdd.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				new UpdateInfo().setVisible(true);
//			}
//		});
//		btnAdd.setBounds(447, 433, 107, 25);
//		contentPane.add(btnAdd);
//		
//		btnDel = new JButton("Delete Data");
//		btnDel.setForeground(Color.MAGENTA);
//		btnDel.setBackground(Color.LIGHT_GRAY);
//		btnDel.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				btnDeleteClicked();
//			}
//		});
//		btnDel.setBounds(447, 469, 107, 25);
//		contentPane.add(btnDel);
//		
//		comboBox = new JComboBox();
//		comboBox.setBackground(Color.LIGHT_GRAY);
//		
//		// TYPE DISPLAY TABLE
//		comboBox.addItemListener(new ItemListener() {
//			public void itemStateChanged(ItemEvent evt) {
//				String className = comboBox.getSelectedItem().toString();
//				showDataClicked(evt, "class", className, "=");
//			}
//		});
//		
//		comboBox.setBounds(411, 127, 99, 20);
//		contentPane.add(comboBox);
		
//		JLabel lbClass = new JLabel("Class");
//		lbClass.setBounds(29, 463, 46, 14);
//		contentPane.add(lbClass);
//		
//		JLabel lbAdd = new JLabel("Address");
//		lbAdd.setBounds(29, 513, 57, 14);
//		contentPane.add(lbAdd);
//		
//		JLabel lbPass = new JLabel("Pass");
//		lbPass.setBounds(29, 555, 46, 14);
//		lbPass.setVisible(false);
//		contentPane.add(lbPass);
//		
//		JLabel lbID = new JLabel("ID");
//		lbID.setBounds(29, 375, 46, 14);
//		contentPane.add(lbID);
//		
//		JLabel lbName = new JLabel("Name");
//		lbName.setBounds(29, 420, 46, 14);
//		contentPane.add(lbName);
		
		label = new JLabel("New label");
		label.setBounds(42, 55, 78, 76);
		contentPane.add(label);
		
		// AVATAR
		setAva(label, "user");
		
		lbInfo = new JLabel();
		lbInfo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbInfo.setBounds(185, 80, 260, 20);
		lbInfo.setText(Login.nameSt); // SHOW NAME USER SIGN IN
		contentPane.add(lbInfo);
		
		lbInfoDetail = new JLabel();
		lbInfoDetail.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbInfoDetail.setBounds(185, 111, 260, 20);
		lbInfoDetail.setText(Login.classSt + ", " + Login.addSt); // SHOW INFO USER SIGN IN
		contentPane.add(lbInfoDetail);
		
		JButton btnClose = new JButton("Close");
		btnClose.setForeground(Color.MAGENTA);
		btnClose.setBackground(Color.LIGHT_GRAY);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(448, 496, 89, 23);
		contentPane.add(btnClose);
		
//		cbAdd = new JComboBox();
//		cbAdd.setBackground(Color.LIGHT_GRAY);
//		cbAdd.setBounds(278, 127, 99, 20);
//		cbAdd.addItemListener(new ItemListener() {
//			public void itemStateChanged(ItemEvent evt) {
//				itemCbChoose(evt);
//			}
//		});
//		contentPane.add(cbAdd);
//		
//		btnSearch = new JButton("Search Data");
//		btnSearch.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				new SearchInfo().setVisible(true);
//			}
//		});
//		btnSearch.setForeground(Color.MAGENTA);
//		btnSearch.setBackground(Color.LIGHT_GRAY);
//		btnSearch.setBounds(337, 505, 217, 23);
//		contentPane.add(btnSearch);
	}
	
//	private void itemCbChoose(ItemEvent evt) {
//		String choose;
//		String className = cbAdd.getSelectedItem().toString();
//		if(className.equals("Hải Châu, Đà Nẵng")) choose = "H%";
//		else if(className.equals("Liên Chiểu, Đà Nẵng")) choose = "L%";
//		else if(className.equals("Ðiện Bàn, Quảng Nam")) choose = "Ð%";
//		else if(className.equals("Tam Kỳ, Quảng Nam")) choose = "T%";
//		else choose = "ALL";
//		showDataClicked(evt, "address", choose, "like");
//	}
	
//	private void btnFillClicked() {
//		loadTable(); // SHOW TABLE
//		initCombobox(); // SHOW COMBOBOX
//	}
	
//	private void btnUpdateClicked() {
//		String pass = MD5Library.md5(txtPass.getText().toString());
//		
//		if(txtID.getText().toString().isEmpty() || txtName.getText().toString().isEmpty() || txtClass.getText().toString().isEmpty() || txtAdd.getText().toString().isEmpty() || pass.isEmpty()) {
//			JOptionPane.showMessageDialog(null, "Please enter full data !!");
//		} else {
//			// SHOW DIALOG
//			int click = JOptionPane.showConfirmDialog(null, "Do you want edit ?", "EDIT", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
//			if (click == JOptionPane.YES_OPTION) {
//				DButilt.update(txtID.getText().toString(), txtName.getText().toString(), txtClass.getText().toString(), txtAdd.getText().toString(), pass);
//				loadTable(); // SHOW TABLE
//			}
//		}
//	}
	
//	private void btnDeleteClicked() {
//		if(txtID.getText().isEmpty()) {
//			JOptionPane.showMessageDialog(null, "Please enter ID !!");
//		} else {
//			int click = JOptionPane.showConfirmDialog(null, "Do you want delete ?", "DELETE", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
//			if (click == JOptionPane.YES_OPTION) {
//				DButilt.delete(txtID.getText());
//				loadTable(); // SHOW TABLE
//			}
//		}
//	}
	
//	private void showDataClicked(ItemEvent evt, String queryName, String className, String equal) {
//		String sql = "SELECT * FROM "+DButilt.TB_NAME+" WHERE "+queryName+" "+equal+" '"+className+"'";
//		if(!className.equals("ALL")) {
//			if(evt.getStateChange() == ItemEvent.SELECTED) {
//				loadTableChanged(sql); // SHOW DATA CLICKED
//			}
//		} else {
//			loadTable(); // LOAD ALL TABLE IF YOU CHOOSE 'ALL'
//		}
//	}
	
	public static void setAva(JLabel label, String nameIcon) {
		try {
			BufferedImage image = ImageIO.read(new File("E:\\Duy\\JavaEclipse\\QuangDuy\\img\\"+nameIcon+".png"));
			ImageIcon icon = new ImageIcon(image.getScaledInstance(78, 76, image.SCALE_SMOOTH));
			label.setIcon(icon);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	// LOAD TABLE FOR THE CHOOSE COMBOBOX
//	private void loadTableChanged(String sql) {
//		tableModel = new DefaultTableModel();
//		try {
//			ResultSet rs = DButilt.query(sql);
//			
//			ResultSetMetaData data = rs.getMetaData();
//			int numColumns = data.getColumnCount(); // GET COUNT COLUM IN TABLE
//			
//			ArrayList<String> arrayColumns = new ArrayList<>();
//			for (int i = 1; i <= numColumns; i++) {
//				arrayColumns.add(data.getColumnName(i)); // ADD TITLE FOR COLUMN
//			}
//			tableModel.setColumnIdentifiers(arrayColumns.toArray());
//			
//			ArrayList<String> arrayRows = new ArrayList<>();
//			while(rs.next()) {
//				for (int i = 1; i <= numColumns; i++) {
//					arrayRows.add(rs.getString(i)); // ADD DATA FOR TABLE
//				}
//				tableModel.addRow(arrayRows.toArray());
//				arrayRows.clear();
//			}
//			table.setModel(tableModel);
//			rs.close();
//		} catch (SQLException e) {
//			JOptionPane.showMessageDialog(null, e);
//		}
//	}
	
	// ALL CHOOSE IN COMBOBOX
//	private void initCombobox() {
//		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
//		model.addElement("ALL");
//		model.addElement("16T1");
//		model.addElement("16T2");
//		model.addElement("16T3");
//		comboBox.setModel(model);
//		
//		DefaultComboBoxModel<String> modelAdd = new DefaultComboBoxModel<>();
//		modelAdd.addElement("ALL");
//		modelAdd.addElement("Hải Châu, Đà Nẵng");
//		modelAdd.addElement("Liên Chiểu, Đà Nẵng");
//		modelAdd.addElement("Ðiện Bàn, Quảng Nam");
//		modelAdd.addElement("Tam Kỳ, Quảng Nam");
//		
//		cbAdd.setModel(modelAdd);
//	}
	
	// SHOW INFO FOR TEXTFIELD
//	private void tableMouseClicked() {
//		try {
//			int row = table.getSelectedRow();
//			String id = table.getModel().getValueAt(row, 0).toString();
//			ResultSet rs = DButilt.query("SELECT * FROM "+DButilt.TB_NAME+" WHERE scode = '"+id+"'");
//			
//			while(rs.next()) {
//				txtID.setText(rs.getString(1));
//				txtName.setText(rs.getString(2));
//				txtClass.setText(rs.getString(3));
//				txtAdd.setText(rs.getString(4));
//				txtPass.setText(rs.getString(5));
//			}
//		} catch (SQLException e) {
//			JOptionPane.showMessageDialog(null, e.toString());
//		}
//	}
	
	// LOAD ALL TABLE
	public static void loadTable() {
		tableModel = new DefaultTableModel();
		try {
			ResultSet rs = DButilt.query("select scode, sname, class, address from "+DButilt.TB_NAME+"");
			
			ResultSetMetaData data = rs.getMetaData();
			int numColumns = data.getColumnCount();
			
			ArrayList<String> arrayColumns = new ArrayList<>();
			for (int i = 1; i <= numColumns; i++) {
				arrayColumns.add(data.getColumnName(i));
			}
			tableModel.setColumnIdentifiers(arrayColumns.toArray());
			
			ArrayList<String> arrayRows = new ArrayList<>();
			while(rs.next()) {
				for (int i = 1; i <= numColumns; i++) {
					arrayRows.add(rs.getString(i));
				}
				tableModel.addRow(arrayRows.toArray());
				arrayRows.clear();
			}
			table.setModel(tableModel);
			rs.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
}
