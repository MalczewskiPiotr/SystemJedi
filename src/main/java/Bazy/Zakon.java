package Bazy;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
public class Zakon{
	public static List<Zakon> listaZakon = new ArrayList<Zakon>();
	 int ID_Zakon;
	 String nazwa;
	 public  static DefaultListModel<String> listaZ = new DefaultListModel<>();
	 

	
	public Zakon(int ID_Zakon, String nazwa) {
		this.ID_Zakon=ID_Zakon;
		this.nazwa = nazwa;
		
		listaZakon.add(this);
		
		listaZ.addElement("Zakon [nazwa=" + nazwa + "]");
			
		
		
	}
	@Override
	public String toString() {
		return "Zakon [nazwa=" + nazwa + "]";
	}	
	
public void zakon() {
	
}
	}

