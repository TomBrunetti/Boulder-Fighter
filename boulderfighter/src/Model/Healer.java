package Model;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Healer extends Character {
	public Healer(int x, int y) { // m�thode qui d�finit les coordonn�es du caract�re
		super (x, y);
		
	}
	
	public void draw(Graphics2D g2d)
	{
		g2d.drawImage(getHealerImg("picture\tank.png"), x, y, null); // cherche le fichier png correspondant et l'affiche au coordonn�e x et y
		
	}

	public Image getHealerImg(String image)
	{
		ImageIcon ii = new ImageIcon(image); // donne l'icone de l'image 
		return ii.getImage(); // renvoie l'image contenu dans l'imageicone
	}
}
