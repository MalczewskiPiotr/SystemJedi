package Bazy;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;

public class Zakon_Jedi {
	int ID_ZAKON_JEDI;
	int ZAKON_ID;
	int JEDI_ID;
	public static List<Zakon_Jedi> listaZakonJedi = new ArrayList<Zakon_Jedi>();
	public  static DefaultListModel<String> listaZJ = new DefaultListModel<>();
	 

	
	public  Zakon_Jedi(int ID_ZAKON_JEDI,int ZAKON_ID, int JEDI_ID) {
		this.ID_ZAKON_JEDI=ID_ZAKON_JEDI;
		this.JEDI_ID=JEDI_ID;
		this.ZAKON_ID=ZAKON_ID;
		
		listaZakonJedi.add(this);
		
	//	listaZJ.addElement("Zakon [nazwa=" + nazwa + "]");
}
}