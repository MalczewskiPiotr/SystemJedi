package Bazy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import javax.swing.DefaultListModel;

import com.jdbc.Firma;
import com.jdbc.Osoba;

public class PobierzJedi {

	
	public static   DefaultListModel<Jedi> listaJBZ = new DefaultListModel<>();
	
	public void PobierzJedi() {
		listaJBZ.clear();	
		
		try {
			Connection c =DriverManager.getConnection("jdbc:postgresql://localhost:5432/SZJ","postgres","zaq1@WSX");
			Statement s =  c.createStatement();
			ResultSet data =s.executeQuery("Select * FROM ZAKON_JEDI;");
			
		while(data.next()) {
			int nrJedi = data.getInt("JEDI_ID");
			boolean przypisany= false;
			Jedi jediBZ = null;
			for(Jedi j : Jedi.listaJedi) {
				jediBZ=j;
				if(j.getJediID(j)==nrJedi && przypisany == false)
				przypisany = true;
			}
			if(przypisany == false);
			listaJBZ.addElement(jediBZ);
			
			}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	}

