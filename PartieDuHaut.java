package InerfaceGraphique;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class PartieDuHaut extends JPanel{
	//layout de  cette partie qui va etre dynamique
	 GridLayout layout;
	//un tableau de list
	Packet packet[];
	ImageIcon img=new ImageIcon("D:\\Spider Solitaire\\Acarte.jpg");
	/**
	 * construvteur
	 */
	public PartieDuHaut(){
		super();
		//initialisation du gridlayout
		layout=new GridLayout(1,10);
		packet=new Packet [10];
		//initilasation de chaque List
	
			for(int i=0;i<packet.length;i++)
				 packet[i]=new Packet();
		affichage_graphique();
	}
	
	/*
	private void add(ArrayList<Carte> arrayList) {
		Point p;
		GridLayout l=new GridLayout(1,1);
		for(int i=0;i<arrayList.size();i++)
		{
			/*
			if(i!=0)
			{	
			p=new Point(arrayList.get(i-1).getX(),arrayList.get(i-1).getY()+5);
			this.add(arrayList.get(i),p);	
			//changerlayout(true);
			}
			
			
			this.add(arrayList.get(i),new GridLayout(i,1));
		 }
	}
	
*/


	/**
	 * une methode qui nous permet de changer le layout dependament de la distribution
	 * a chauque distribustion on ajoute une ligne
	 * le layout doit aussi changer pour chaque deplacement fais par le gamer 
	 * @param: est un boulean qui permet de savoir si une distribution a été faite ou pas 
	 * 
	 */
	
	public void changerlayout(Boolean fait, int cols)
	{
		if(fait)
			layout.setColumns(cols);
			
	}
	
	/**
	 * 
	 */
	public void superposer(Carte c,ArrayList<Carte> arrayList)
	{
		//Point p=new Point(arrayList.get(arrayList.size()-1).getX(),arrayList.get(arrayList.size()-1).getY()+5);
	   c.setBounds(arrayList.get(arrayList.size()-1).getX(), arrayList.get(arrayList.size()-1).getY()+5, 50, 100);
	   this.add(c);
	   }  
	public  void  affichage_graphique(){

		for(int i=0;i<10;i++)
		{

			
			
			packet[i].afficher();
			this.add(new Transparent());
	        this.add(packet[i]);
			
		}
		
	
		
		
	}

}
