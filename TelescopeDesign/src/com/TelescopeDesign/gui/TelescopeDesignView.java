package com.TelescopeDesign.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class TelescopeDesignView extends javax.swing.JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3079812379076422696L;
    private final Color bluePrint = Color.getHSBColor(600, 100, 10);
    
    private javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
    
    // Die sichtbaren Elemente werden als Objektvariablen angelegt:
    private javax.swing.JTabbedPane jTabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
    
    
    private javax.swing.JButton jButton2 = 
           new javax.swing.JButton( "jButton2" );
    private javax.swing.JButton jButton3 = 
           new javax.swing.JButton( "jButton3" );
    private javax.swing.JButton jButton4 = 
           new javax.swing.JButton( "jButton4" );
    private javax.swing.JButton jButton5 = 
           new javax.swing.JButton( "jButton5" );
 
    

    public TelescopeDesignView()
	{
//		Toolkit tk = Toolkit.getDefaultToolkit();
//		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setTitle("Telescope Designer");
//		getContentPane().setBackground(bluePrint);
//		setSize(new Dimension(tk.getScreenSize()));
//		
//		
		
		
 
        // Beachten Sie, dass Swing gar nicht so selten auf Elemente der 
        // Vorg�nger-Bibliothek awt zugreift. Auch Das BorderLayout geh�rt 
        // eigentlich zum awt. Das JPanel bekommt sein Layout:
        jPanel1.setLayout( new java.awt.BorderLayout() );
 
        // Die Implementierung von ActionListenern sehen Sie in den 
        // Codebeispielen f�r das FlowLayout (einzelner Listener f�r einen
        // einzelnen Button) oder auch beim GridLayout (ein Listener f�r ein
        // ganzes Array von Buttons. Hier verzichten wir auf die Implementierung
        // eines Listeners, da das BorderLayout im Grunde nur Container 
        // enthalten wird, nie Controls wie die JButtons, die wir hier ben�tzt
        // haben.
 
        // Hier werden die JButtons dem Panel hinzugef�gt
        JPanel panelRayTracing = new JPanel();
        JPanel panelBluePrint = new JPanel();
        panelRayTracing.setBackground(Color.black);
        panelBluePrint.setBackground(Color.blue);
        jTabbedPane.addTab("Ray Tracing", panelRayTracing);
        jTabbedPane.addTab("Blue Pring", panelBluePrint);
        
        JTable jTable = new JTable();
        jTable.addColumn(new TableColumn(200));
        jTable.addColumn(new TableColumn(200));
        
   
        
        jPanel1.add(jTabbedPane, java.awt.BorderLayout.CENTER);
        jPanel1.add(jButton2, java.awt.BorderLayout.PAGE_END);
        jPanel1.add(jButton3, java.awt.BorderLayout.LINE_START);
       // jPanel1.add(jButton4, java.awt.BorderLayout.CENTER);
        jPanel1.add(jTable, java.awt.BorderLayout.LINE_END);
		
        this.getContentPane().add ( jPanel1 ) ;
        
        // Alle Elemente auf kleinstm�gliche Gr��e bringen
        pack();
		
		setVisible(true);
	
	}
	
	
	
	
	
	
}
