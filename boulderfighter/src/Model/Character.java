package Model;

import java.awt.Graphics2D;

public class Character {

	protected int x, y;
	
	
	
	
    public Character(int x, int y) // constructeur de base
    {
    	this.x = x; // d�finis les coodrdonn�e du caract�re comme coordonn�e � utiliser dans les m�thodes
    	this.y = y;
    }

    public void draw(Graphics2D g2d){}
    
    public void drawReverse(Graphics2D g2d){}
    
    
}
