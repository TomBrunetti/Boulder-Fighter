package Model;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Mushroom extends Character {

	
		public Mushroom(int x, int y) { // m�thode qui d�finit les coordonn�es du caract�re
			super (x, y);
			
		}
		
		public void draw(Graphics2D g2d)
		{
			g2d.drawImage(getMushroomImg("picture\tank.png"), x, y, null); // cherche le fichier png correspondant et l'affiche au coordonn�e x et y
			
		}

		public Image getMushroomImg(String image)
		{
			ImageIcon ii = new ImageIcon(image); // donne l'icone de l'image 
			return ii.getImage(); // renvoie l'image contenu dans l'imageicone
		}
}
