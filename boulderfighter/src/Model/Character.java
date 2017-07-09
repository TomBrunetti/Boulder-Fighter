package Model;

import java.awt.Graphics2D;

public class Character {
	protected int x,y,id,Life,FLife,Dmg;
	
	public Character(int x, int y, int id, int Life,int FLife, int Dmg) // constructor of Character
	{
		this.x = x;
		this.y = y;
		this.id = id;
		this.Life = Life;
		this.FLife = FLife;
		this.Dmg = Dmg;
	}
	
	public void draw(Graphics2D g2d){} // method for place picture
	
	public void drawReverse(Graphics2D g2d){} // method for place reverse picture
	
	public int getId() // method to get the character
	{
		return id;
	}
	
	public int getLife() // method to get the player's life
	{
		return Life;
	}
	
	public int getFLife() // method to get the foraign life
	
	{
		return FLife;
	}
	
	public int getDmg() // method to get the player's damage
	{
		return Dmg;
	}
}
