package Panel;



import javax.swing.JFrame;

import Bazy.Pobierz;
import Bazy.PobierzJedi;





public class Main {
	
	
	
	public static void main(String[] args) {
		
			JFrame window = new JFrame("System Zarządzania Jedi");
			window.add(new Panel1(new Pobierz(),new PobierzJedi()));	
			
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setVisible(true);
			window.pack();

	}

}
