package Panel;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.*;

import Bazy.Jedi;
import Bazy.Pobierz;
import Bazy.PobierzJedi;
import Bazy.Zakon;


public class Panel1 extends JPanel {
	private Pobierz pobierz;
	public Panel1(Pobierz pobierz, PobierzJedi pobierzJedi) {
		this.pobierz=pobierz;
		pobierz.pobierz();
		pobierzJedi.PobierzJedi();
		setLayout(null);
		JSeparator s = new JSeparator(SwingConstants.VERTICAL);
		s.setBounds(500, 10, 200, 680);
        add(s);

		JLabel zakony = new JLabel("Zakony Jedi");
		zakony.setBounds(200, 20, 120, 30);
		add(zakony);
	
		JLabel zakonyRej = new JLabel("Rejestracja Zakonu");
		zakonyRej.setBounds(200, 350, 120, 30);
		add(zakonyRej);
		
		JList listaZ = new JList(Zakon.listaZ);
		listaZ.setBounds(20,60, 460,280);
		add(listaZ);
		
		
		JTextField t1=new JTextField();  
	    t1.setBounds(150,580, 250,30);  
	    add(t1);
	    
		JLabel nazwaZakon = new JLabel("Nazwa");
		nazwaZakon.setBounds(40, 400, 50, 20);
		add(nazwaZakon);
      
		JTextField nazwaZakonTF = new JTextField();
		nazwaZakonTF.setBounds(150, 400, 250, 30);
		add(nazwaZakonTF);

		JButton wybierzZ = new JButton("Wybierz");
		wybierzZ.setBounds(40, 450, 90, 30);
		add(wybierzZ);
		
		JList listJBZ = new JList(PobierzJedi.listaJBZ);
		listJBZ.setBounds(150, 450, 250, 100);  
        add(listJBZ);  
		
		JButton importZ = new JButton("Import");
		importZ.setBounds(40, 560, 90, 30);
		add(importZ);
		importuj(importZ, t1);
		

		JButton eksportZ = new JButton("Eksport");
		eksportZ.setBounds(40, 600, 90, 30);
		add(eksportZ);
		
		class EksportZ implements ActionListener{
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==eksportZ) { 
					JFileChooser fc=new JFileChooser();    
				    int i=fc.showOpenDialog(eksportZ);    
				    if(i==JFileChooser.APPROVE_OPTION){    
				        File f=fc.getSelectedFile();    
				        String filepath=f.getPath();    
				        t1.setText(filepath);		
				    }    
				}    
				}
				
		}
		
		eksportZ.addActionListener(new EksportZ());		
		
		JButton WyczyscZ = new JButton("Wyczyść");
		WyczyscZ.setBounds(280, 650, 90, 30);
		add(WyczyscZ);
		class WyczyscZ implements ActionListener{
			
			@Override
			public void actionPerformed(ActionEvent e) {
						
				if(e.getSource()==WyczyscZ) { 
					nazwaZakonTF.setText("");
				    }    
				}    
				}
		
		WyczyscZ.addActionListener(new WyczyscZ());
		
		JButton ZarejestrujZ = new JButton("Zarejestruj");
		ZarejestrujZ.setBounds(150, 650, 110, 30);
		add(ZarejestrujZ);
		
		class ZarejestrujZ implements ActionListener{
			
			@Override
			public void actionPerformed(ActionEvent e) {
						
				if(e.getSource()==ZarejestrujZ) { 
					Connection c;
					if(nazwaZakonTF.getText()!="") {
					try {
						c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/SZJ","postgres","zaq1@WSX");
						String query = " INSERT INTO ZAKON  (NAZWA) VALUES"  + " ('"+nazwaZakonTF.getText()+"')";
						PreparedStatement preparedStmt = c.prepareStatement(query);
						preparedStmt.execute();
					      
					      c.close();
					      pobierz.pobierz();					      
					      nazwaZakonTF.setText("");
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				    }
				}
				}    
				}
		ZarejestrujZ.addActionListener(new ZarejestrujZ());		
		
			

	    JLabel jedi = new JLabel("Rycerze Jedi");
		jedi.setBounds(700, 20, 120, 30);
		add(jedi);
		
		JLabel jediRej = new JLabel("Rejestracja Jedi");
		jediRej.setBounds(700, 350, 120, 30);
		add(jediRej);
		
		JLabel nazwaJedi = new JLabel("Nazwa");
		nazwaJedi.setBounds(540, 400, 50, 20);
		add(nazwaJedi);

		JTextField nazwaJediTF = new JTextField();
		nazwaJediTF.setBounds(650, 400, 250, 30);
		add(nazwaJediTF);
		
		JLabel miecz = new JLabel("Kolor miecza");
		miecz.setBounds(540, 440, 100, 20);
		add(miecz);
		
		String kolorMiecza[]={"","Czerwony","Zielony","Żółty","Biały","Niebieski"};        
	    JComboBox wybierzKolor =new JComboBox(kolorMiecza); 
	    wybierzKolor.setBounds(650, 440, 250, 30);    
	    add(wybierzKolor);
	    
	    JLabel moc = new JLabel("Moc:");
	    moc.setBounds(540, 480, 100, 20);
		add(moc);
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 1000, 500);
		slider.setMajorTickSpacing(1000);  
		slider.setPaintLabels(true);
		slider.setBounds(650, 480, 250, 30);
		add(slider);
		
	JLabel strona = new JLabel("Strona mocy: ");
	strona.setBounds(620, 510, 100, 30);
	add(strona);
	
	JRadioButton r1=new JRadioButton("Jasna");    
	JRadioButton r2=new JRadioButton("Ciemna");    
	r1.setBounds(730,510,100,30);    
	r2.setBounds(840,510,100,30);    
	ButtonGroup bg=new ButtonGroup();    
	bg.add(r1);bg.add(r2);    
	add(r1);add(r2);  
	
	
	
	JButton importJ = new JButton("Import");
	importJ.setBounds(540, 560, 90, 30);
	add(importJ);
	
	
	JList listaJ = new JList(Jedi.listaJ);
	listaJ.setBounds(520,60, 460,280);	 
	add(listaJ);
	
	JTextField t2 =new JTextField();  
	t2.setBounds(650, 580, 250 ,30);  
    add(t2);
    
    importuj(importJ, t2);
    
	JButton eksportJ = new JButton("Eksport");
	eksportJ.setBounds(540, 600, 90, 30);
	add(eksportJ);
	
	JButton WyczyscJ = new JButton("Wyczyść");
	WyczyscJ.setBounds(780, 650, 90, 30);
	add(WyczyscJ);
	
	class WyczyscJ implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
					
			if(e.getSource()==WyczyscJ) { 
				nazwaJediTF.setText("");
				wybierzKolor.setSelectedIndex(0);
				slider.setValue(500);
				bg.clearSelection();
				}    
			}    
			}
	
	WyczyscJ.addActionListener(new WyczyscJ());
	
	JButton ZarejestrujJ = new JButton("Zarejestruj");
	ZarejestrujJ.setBounds(650, 650, 110, 30);
	add(ZarejestrujJ);
	

	
	class ZarejestrujJ implements ActionListener{
					
		@Override
		public void actionPerformed(ActionEvent e) {
					
			if(e.getSource()==ZarejestrujJ) { 
				Connection c;
				
				if(nazwaJediTF.getText()!=""&&wybierzKolor.getSelectedItem()!=""&&(r1.isSelected()==true||r2.isSelected()==true)) {
				try {
					c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/SZJ","postgres","zaq1@WSX");
					
					String stronaStr = null;
					
					if (r1.isSelected()==true) 
						stronaStr="Jasna";
					if (r2.isSelected()==true)
						stronaStr="Ciemna";

					String query = " INSERT INTO JEDI  (NAZWA, MIECZ, MOC, STRONA) VALUES"
					        + " ('"+nazwaJediTF.getText()+"','"+wybierzKolor.getSelectedItem()+"', "+slider.getValue()+", '"+stronaStr+"')";
					PreparedStatement preparedStmt = c.prepareStatement(query);
					preparedStmt.execute();
				      c.close();
	      
					pobierz.pobierz();
					pobierzJedi.PobierzJedi();
					nazwaJediTF.setText("");
					wybierzKolor.setSelectedIndex(0);
					slider.setValue(500);
					bg.clearSelection();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			    } 
			}
			}    
			}	
	
	ZarejestrujJ.addActionListener(new ZarejestrujJ());


	}
	
	public void importuj(JButton importJ, JTextField t2) {
		class ImportJ implements ActionListener{
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==importJ) { 
					JFileChooser fc=new JFileChooser();    
				    int i=fc.showOpenDialog(importJ);    
				    if(i==JFileChooser.APPROVE_OPTION){    
				        File f=fc.getSelectedFile();    
				        String filepath=f.getPath();    
				        t2.setText(filepath);
				        
				    }    
				}    
				}	
		}
		importJ.addActionListener(new ImportJ());
	}
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(1000, 700);
	}	
}
