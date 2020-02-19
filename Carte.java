package InerfaceGraphique;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Carte extends JButton {
	public Carte(ImageIcon icon ) {
		super(icon);
		setOpaque(false);
		setFocusPainted(false);
		setBorderPainted(false);
		setContentAreaFilled(false);
		setBorder(BorderFactory.createEmptyBorder(0,0,0,0)); 
	}
	   
		
		
		
	}