package Panel;



import javax.swing.JFrame;



public class Main {

	public static void main(String[] args) {
		
			JFrame window = new JFrame("System Zarządzania Jedi");
			
			window.add(new Panel1());	
			
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setVisible(true);
			window.pack();

	}

}
