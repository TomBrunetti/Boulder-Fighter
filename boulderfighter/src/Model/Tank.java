package Model;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;



	public class Tank extends Character {
		public Tank(int x, int y) { // méthode qui définit les coordonnées du caractère
			super (x, y);
			
		}
		
		public void draw(Graphics2D g2d)
		{
			g2d.drawImage(getTankImg("picture/tank.png"), x, y, null); // cherche le fichier png correspondant et l'affiche au coordonnée x et y
			
		}

		public Image getTankImg(String image)
		{
			ImageIcon ii = new ImageIcon(image); // donne l'icone de l'image 
			return ii.getImage(); // renvoie l'image contenu dans l'imageicone
		}
}

