package com.TelescopeDesign.gui;



import java.awt.Color;

import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

public class BluePrint {

	public JFrame frame;
	public JMenuBar menuBar;
	private JTable table;



	/**
	 * Create the application.
	 */
	public BluePrint() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 255));
		frame.setBounds(100, 100, 537, 557);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Telescope Design");

		menuBar = new JMenuBar();
		menuBar.setAlignmentY(0);
		menuBar.setAlignmentX(0);

		
		frame.getContentPane().add(menuBar);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		menuBar.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		JMenu menu = new JMenu("Settings");
		menu.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(menu);
		JMenu menu_1 = new JMenu("Menu");
		menu_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(menu_1);
		
		
			
		
		
		
	}

}
