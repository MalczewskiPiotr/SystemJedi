package Panel;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;


public class Panel1 extends JPanel {

	public Panel1() {
		
		setLayout(null);
		// separator
        
        JSeparator s = new JSeparator(); 
        s.setOrientation(SwingConstants.VERTICAL); 
        add(s); 

        
		JLabel zakony = new JLabel("Zakony Jedi");
		zakony.setBounds(200, 20, 120, 30);
		add(zakony);
				
		JLabel zakonyRej = new JLabel("Rejestracja Zakonu");
		zakonyRej.setBounds(200, 350, 120, 30);
		add(zakonyRej);
		
		JTextField t1,t2;  
	    t1=new JTextField();  
	    t1.setBounds(20,60, 450,280);  
	    t2=new JTextField();  
	    t2.setBounds(150,580, 250,30);  
	    add(t1); add(t2);  
		
		JLabel nazwaZakon = new JLabel("Nazwa");
		nazwaZakon.setBounds(40, 400, 50, 20);
		add(nazwaZakon);
      
		JTextField nazwaZakonTF = new JTextField();
		nazwaZakonTF.setBounds(150, 400, 250, 30);
		add(nazwaZakonTF);

		JButton wybierzZ = new JButton("Wybierz");
		wybierzZ.setBounds(40, 450, 90, 30);
		add(wybierzZ);
			
		JButton importZ = new JButton("Import");
		importZ.setBounds(40, 560, 90, 30);
		add(importZ);
		
		JButton eksportZ = new JButton("Eksport");
		eksportZ.setBounds(40, 600, 90, 30);
		add(eksportZ);

		JButton ZarejestrujZ = new JButton("Zarejestruj");
		ZarejestrujZ.setBounds(150, 650, 110, 30);
		add(ZarejestrujZ);
		
		JButton WyczyscZ = new JButton("Wyczyść");
		WyczyscZ.setBounds(280, 650, 90, 30);
		add(WyczyscZ);
		
		JList<String> list = new JList<>();  
        list.setBounds(150, 450, 250, 100);  
        add(list);  	
        

        
		
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
	
	JButton eksportJ = new JButton("Eksport");
	eksportJ.setBounds(540, 600, 90, 30);
	add(eksportJ);


	JTextField t3,t4;  
	t3=new JTextField();  
	t3.setBounds(520,60, 450,280);  
	t4=new JTextField();  
	t4.setBounds(650, 580, 250 ,30);  
    add(t3); add(t4);
	
	JButton ZarejestrujJ = new JButton("Zarejestruj");
	ZarejestrujJ.setBounds(650, 650, 110, 30);
	add(ZarejestrujJ);
	
	JButton WyczyscJ = new JButton("Wyczyść");
	WyczyscJ.setBounds(780, 650, 90, 30);
	add(WyczyscJ);

	}
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(1000, 700);
	}	
}
