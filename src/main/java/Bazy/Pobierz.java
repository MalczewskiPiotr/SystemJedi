package Bazy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Pobierz {

	
	public void pobierz() {
	     Jedi.listaJ.clear();;
	     Zakon.listaZ.clear();;
		
		try {
		Connection c =DriverManager.getConnection("jdbc:postgresql://localhost:5432/SZJ","postgres",
				"zaq1@WSX");
		Statement s =  c.createStatement();
		
		ResultSet dataa =s.executeQuery("SELECT * FROM JEDI");
		
	//	ResultSet data3 =s.executeQuery("SELECT * FROM ZAKON_JEDI");
		
		while(dataa.next())
		new Jedi(dataa.getInt("ID_Jedi"),dataa.getString("Nazwa"), dataa.getString("Miecz"), dataa.getInt("Moc"), dataa.getString("Strona"));
		dataa =s.executeQuery("SELECT * FROM ZAKON");
		while(dataa.next())
		new Zakon(dataa.getInt("ID_Zakon"),dataa.getString("Nazwa"));		
		
		
		c.close();
	

	
} catch (Exception e) {
	e.printStackTrace();
}
	
	

	for(Zakon z : Zakon.listaZakon)
		System.out.println(z);
	
	
}


	}



