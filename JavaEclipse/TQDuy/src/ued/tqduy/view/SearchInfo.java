package ued.tqduy.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import jdk.nashorn.internal.scripts.JO;
import ued.tqduy.bussiness.DButilt;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchInfo extends JFrame {

	private JPanel contentPane;
	private JLabel lbIcon;
	private JLabel lbID;
	private JTextField txtSearchId;
	private JButton btnSearchId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchInfo frame = new SearchInfo();
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
	public SearchInfo() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 452, 211);
		setTitle("Search Infomation");
		
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, Color.RED, new Color(64, 64, 64), null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbIcon = new JLabel("");
		lbIcon.setBounds(30, 31, 89, 90);
		contentPane.add(lbIcon);
		
		lbID = new JLabel("ID");
		lbID.setBounds(129, 59, 32, 14);
		contentPane.add(lbID);
		
		txtSearchId = new JTextField();
		txtSearchId.setBounds(171, 56, 214, 20);
		contentPane.add(txtSearchId);
		txtSearchId.setColumns(10);
		
		btnSearchId = new JButton("Search");
		btnSearchId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
//				searchData();
			}
		});
		btnSearchId.setBounds(192, 103, 125, 45);
		contentPane.add(btnSearchId);
		
		Login.setIconButton(btnSearchId, "btn-search");
		ViewResult.setAva(lbIcon, "search");
	}
	
//	private void searchData() {
//		DButilt.search(txtSearchId.getText().toString().trim());
//		if(DButilt.checkSearchData) {
//			JOptionPane.showMessageDialog(null, "Tìm Thấy !!");
//			DButilt.showAll(txtSearchId.getText().toString().trim());
//		} else {
//			JOptionPane.showMessageDialog(null, "Không tìm thấy !!");
//		}
//	}
}
