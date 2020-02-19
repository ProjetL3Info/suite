package Essaie;

import java.awt.BorderLayout;

import javax.swing.*;

public class Fenetre extends JFrame{

	  private MyGlassPane glass = new MyGlassPane();
public Fenetre(){
	 super("Test de GlassPane");
	ImageIcon i=new ImageIcon("D:\\Spider Solitaire\\ACarte.jpg");
	ImageIcon i2=new ImageIcon("D:\\Spider Solitaire\\image.png");
    setSize(400, 200);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p1=new JPanel();
    JPanel p2=new JPanel();
    //On crée un composant
     Carte2 c1=new Carte2(i);
    //On y attache les écouteurs qui auront pour rôle
    //d'initialiser notre glace et d'y affecter les données
    //qui permettront de simuler le déplacement
    c1.addMouseListener(new MouseGlassListener(glass));
    c1.addMouseMotionListener(new MouseGlassMotionListener(glass));
    //On affecte maintenant un TranferHandler spécifique
    //initialisé avec la propriété JavaBean "text"
    //achanger
    c1.setTransferHandler(new TransferHandler("icon"));

    Carte2 c2= new Carte2(i2);
    c2.addMouseListener(new MouseGlassListener(glass));
    c2.addMouseMotionListener(new MouseGlassMotionListener(glass));
    //a changer 
    c2.setTransferHandler(new TransferHandler("icon"));


    
    //pan.add(label);
    p1.add(c1);
   // p1.add(label);
    add(p1, BorderLayout.NORTH);
    
    //pan2.add(text);
    p2.add(c2);
    //p2.add(text);
    add(p2, BorderLayout.SOUTH);

    setGlassPane(glass);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setVisible(true);
  }

  public static void main(String[] args){
    new Fenetre();
  }   
}
