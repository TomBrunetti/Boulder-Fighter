package Model;

import java.awt.Graphics2D;

public class Character {
	protected int x,y,id,Life,FLife,Dmg;
	
	public Character(int x, int y, int id, int Life,int FLife, int Dmg)
	{
		this.x = x;
		this.y = y;
		this.id = id;
		this.Life = Life;
		this.FLife = FLife;
		this.Dmg = Dmg;
	}
	
	public void draw(Graphics2D g2d){}
	
	public void drawReverse(Graphics2D g2d){}
	
	public int getId()
	{
		return id;
	}
	
	public int getLife()
	{
		return Life;
	}
	
	public int getFLife()
	{
		return FLife;
	}
	
	public int getDmg()
	{
		return Dmg;
	}
}
