package Model;

import java.awt.Graphics2D;

public class Character {

	protected int x, y;
	
	
	
	
    public Character(int x, int y) // constructeur de base
    {
    	this.x = x; // définis les coodrdonnée du caractère comme coordonnée à utiliser dans les méthodes
    	this.y = y;
    }

    public void draw(Graphics2D g2d){}
    
    public void drawReverse(Graphics2D g2d){}
    
    
}
