package ued.tqduy.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import ued.tqduy.view.Login;
import ued.tqduy.view.ViewResult;
import ued.tqduy.bussiness.DButilt;
import ued.tqduy.bussiness.MD5Library;

public class Login extends JFrame {

	private static Login frameInfo;
	private JPanel contentPane;
	private JTextField txtUser;
	private JButton btnLogin;
//	private JButton btnOut;
	private JPasswordField txtPass;
	public static String nameSt, classSt, addSt;
	private JButton btnReset;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frameInfo = new Login();
					frameInfo.setResizable(false);
					frameInfo.setVisible(true);
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
		setTitle("Student Management");
		setBounds(100, 100, 307, 284);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("SCode");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 77, 65, 23);
		contentPane.add(lblNewLabel);

		btnLogin = new JButton("Submit");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
//		btnLogin.setActionCommand("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				eventLogin(txtUser.getText(), String.valueOf(txtPass.getPassword())); // HANDLING EVENT CLICK BUTTON LOGIN
			}
		});
		btnLogin.setBounds(10, 168, 125, 45);
		contentPane.add(btnLogin);

		setIconButton(btnLogin, "login");

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(10, 111, 65, 23);
		contentPane.add(lblPassword);

		JLabel lbLogin = new JLabel("Login");
		lbLogin.setFont(new Font("Segoe Script", Font.BOLD, 22));
		lbLogin.setBounds(101, 22, 70, 45);
		contentPane.add(lbLogin);

		txtUser = new JTextField();
		txtUser.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtUser.setBounds(85, 78, 196, 20);
		contentPane.add(txtUser);
		txtUser.setColumns(10);

//		btnOut = new JButton("Exit");
//		btnOut.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				exitAdd();
//			}
//		});
//		btnOut.setBounds(156, 168, 125, 45);
//		contentPane.add(btnOut);

//		setIconButton(btnOut, "exit");

		txtPass = new JPasswordField();
		txtPass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPass.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent evt) {
				if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
					btnLogin.doClick(); // ENTER LOGIN DON'T NEED CLICK BUTTON LOGIN
				}
			}
		});
		txtPass.setBounds(85, 112, 196, 20);
		txtPass.setActionCommand("Login");
		contentPane.add(txtPass);
		
		btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUser.setText("");
				txtPass.setText("");
			}
		});
		
		setIconButton(btnReset, "exit");
		btnReset.setBounds(156, 168, 125, 45);
		contentPane.add(btnReset);
	}

	public static void setIconButton(JButton btn, String nameIcon) {
		try {
			BufferedImage image = ImageIO.read(new File("E:\\Duy\\JavaEclipse\\QuangDuy\\img\\" + nameIcon + ".png"));
			ImageIcon icon = new ImageIcon(image.getScaledInstance(30, 30, image.SCALE_SMOOTH));
			btn.setIcon(icon);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	private void eventLogin(String userTxt, String passTxt) {
		boolean check = false;
		String id = null, pass = null;
		passTxt = MD5Library.md5(passTxt);
		String sql = "SELECT * FROM " + DButilt.TB_NAME + " WHERE scode = '" + userTxt + "' AND pass = '" + passTxt
				+ "'"; // FIND USER AND PASS CORRECT ?
		ResultSet res = DButilt.query(sql);
		
		
		try {
			if (res.next()) {
				id = res.getString(1).trim(); // GET ID EQUAL CORRECT
				nameSt = res.getString(2).trim(); // GET NAME SHOW INFOMATION WHEN YOU LOGIN SECCESS
				classSt = res.getString(3).trim(); // GET CLASS SHOW INFOMATION WHEN YOU LOGIN SECCESS
				addSt = res.getString(4).trim(); // GET ADD SHOW INFOMATION WHEN YOU LOGIN SECCESS
				pass = res.getString(5).trim(); // GET PASS EQUAL CORRECT
				
				if (id.equals(userTxt) && pass.equals(passTxt))
					check = true;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		} finally {
			if (check) {
				new ViewResult().setVisible(true); // SHOW STUDENT SYSTEM MANAGER
				frameInfo.dispose();
			} else {
				JOptionPane.showMessageDialog(null, "Invalid data !!");
			}
		}
	}
	
	private void exitAdd() {
		int click = JOptionPane.showConfirmDialog(null, "Do you want out ?", "Exit", JOptionPane.YES_NO_OPTION,
				JOptionPane.WARNING_MESSAGE);
		if (click == JOptionPane.YES_OPTION)
			System.exit(0);
	}
}
