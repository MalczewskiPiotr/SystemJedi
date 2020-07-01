package Bazy;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
public class Jedi {
	public static List<Jedi> listaJedi = new ArrayList<Jedi>();
	public static DefaultListModel<String> listaJ = new DefaultListModel<>();
	 int ID_Jedi;
	 String nazwa;
	 String miecz;
	 int moc;
	 String strona;

	
	public Jedi(int ID_Jedi, String nazwa, String miecz, int moc, String strona) {
		this.ID_Jedi=ID_Jedi;
		this.nazwa = nazwa;
		this.miecz = miecz;
		this.moc = moc;
		this.strona = strona;
		
		listaJedi.add(this);
		listaJ.addElement("Jedi [imie=" + nazwa + ", kolor miecza=" + miecz + ", moc=" + moc + " ,strona=" + strona +"]");
	}
	@Override
	public String toString() {
		return "Jedi [imie=" + nazwa + ", kolor miecza=" + miecz + ", moc=" + moc + " ,strona=" + strona +"]";
	}
	
}
