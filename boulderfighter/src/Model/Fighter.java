package Model;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Fighter extends Character{ // sp�cialisation de charater

	public Fighter(int x, int y) { // m�thode qui d�finit les coordonn�es du caract�re
		super (x, y);
		
	}
	
	public void draw(Graphics2D g2d)
	{
		g2d.drawImage(getFighterImg("picture\tank.png"), x, y, null); // cherche le fichier png correspondant et l'affiche au coordonn�e x et y
		
	}

	public Image getFighterImg(String image)
	{
		ImageIcon ii = new ImageIcon(image); // donne l'icone de l'image 
		return ii.getImage(); // renvoie l'image contenu dans l'imageicone
	}
}
