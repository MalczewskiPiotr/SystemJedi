package Bazy;

import java.util.ArrayList;
import java.util.List;
public class Zakon {
	public static List<Zakon> listaZakon = new ArrayList<Zakon>();
	
	 int ID_Zakon;
	 String nazwa;
	

	
	public Zakon(int ID_Zakon, String nazwa) {
		this.ID_Zakon=ID_Zakon;
		this.nazwa = nazwa;
		
		
		listaZakon.add(this);
	}
	@Override
	public String toString() {
		return "Zakon [nazwa=" + nazwa + "]";
	}
	
}
