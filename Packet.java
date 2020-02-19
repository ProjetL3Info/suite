package InerfaceGraphique;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;



public class Packet extends JPanel{
	ArrayList <Carte> List ;
	ImageIcon img=new ImageIcon("D:\\Spider Solitaire\\Acarte.jpg");
	public Packet()
	{
		//this.setLayout(new GridLayout(1,1));
		List=new ArrayList <Carte> ();
		List.add(new Carte(img));
		List.add(new Carte(img));
		List.add(new Carte(img));
		afficher();
	}
	
	/**
	 * cette methode permet de placer les carte verticalement 
	 * @param List
	 */
	public void afficher()
	{
		
		 this.setLayout(new GridLayout(List.size(),1));
				 
				  
		
		
		for(int i=0;i<List.size();i++)
		{
			  if(i!=0)
			  {
				 
				 // List.get(i).setLocation(List.get(i-1).getX()+5, List.get(i-1).getY());
				  this.add( List.get(i));
				  
				  
				
			  }
			  else
				 
			  this.add( List.get(i));
			  
		}
		
	
	}
	
	
 
}
