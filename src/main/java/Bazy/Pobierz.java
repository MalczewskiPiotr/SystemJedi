package Bazy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Pobierz {

	
	public Pobierz() {
	try {
		Connection c =DriverManager.getConnection("jdbc:postgresql://localhost:5432//SZJ","postgres",
				"zaq1@WSX");
		Statement s =  c.createStatement();
		
		ResultSet data =s.executeQuery("SELECT * FROM JEDI");
		ResultSet data2 =s.executeQuery("SELECT * FROM ZAKON");
	//	ResultSet data3 =s.executeQuery("SELECT * FROM ZAKON_JEDI");
		
		while(data.next())
		new Jedi(data.getInt("ID_Jedi"),data.getString("Nazwa"), data.getString("Miecz"), data.getInt("Moc"), data.getString("Strona"));
	
		while(data2.next())
		new Zakon(data2.getInt("ID_Zakon"),data2.getString("Nazwa"));		
		
		
		
	for(Jedi j : Jedi.listaJedi)
		System.out.println(j);
	
	for(Zakon z : Zakon.listaZakon)
		System.out.println(z);

	
} catch (Exception e) {
	e.printStackTrace();
}
}	
}
