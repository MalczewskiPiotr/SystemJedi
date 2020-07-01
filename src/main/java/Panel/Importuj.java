package Panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;

public abstract class Importuj implements ActionListener{
	JButton button;
	JTextField tf;
	ActionEvent e;
	
	
		@Override
	public void actionPerformed(ActionEvent e) {
		    
		}
		public void importuj(JButton button, JTextField tf) {
			actionPerformed(e);
			if(e.getSource()==button) { 
			    JFileChooser fc=new JFileChooser();    
			    int i=fc.showOpenDialog(button);    
			    if(i==JFileChooser.APPROVE_OPTION){    
			        File f=fc.getSelectedFile();    
			        String filepath=f.getPath();    
			        tf.setText(filepath);               
			    }    
			}
	//		button.addActionListener(new Importuj());
		}

		
	}

