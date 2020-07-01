package Bazy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class PobierzJedi {

	public static List<Jedi> PobierzJedi() {
		try {
			Connection c =DriverManager.getConnection("jdbc:postgresql://localhost:5432/SZJ","postgres",
					"zaq1@WSX");
			Statement s =  c.createStatement();
			
			ResultSet data =s.executeQuery("SELECT * FROM JEDI");
		
			
			while(data.next())
			new Jedi(data.getInt("ID_Jedi"),data.getString("Nazwa"), data.getString("Miecz"), data.getInt("Moc"), data.getString("Strona"));
		
	} catch (Exception e) {
		e.printStackTrace();
	}
		
		
		return 
		
		Jedi.listaJedi;
		
	}
	}

