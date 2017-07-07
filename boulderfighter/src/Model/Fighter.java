package Model;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Fighter extends Character{

	GameImage CI = new GameImage(); 
	
	public Fighter(int x, int y, int id, int Life,int FLife, int Dmg) {
		super(x, y, id, Life,FLife, Dmg);
	}
	
	public int getId()
	{
		return super.getId();
	}
	
	public int getLife()
	{
		return super.getLife();
	}
	
	public int getFLife()
	{
		return super.getFLife();
	}
	
	public int getDmg()
	{
		return super.getDmg();
	}
	public void draw(Graphics2D g2d)
	{
		g2d.drawImage(getFighterImg("picture/fighter.png"), x, y, null);
		for (int i=0;i<Life;i++)
		{
			g2d.drawImage(CI.getLifeImg(), i*64, 0, null);
		}
		
		for (int i=0;i<Dmg;i++)
		{
			g2d.drawImage(CI.getDmgImg(), i*64, 120, null);
		}
	}
	
	public void drawReverse(Graphics2D g2d)
	{
		g2d.drawImage(getFighterImg("picture/fighterreverse.png"), x, y, null);
		for (int i=0;i<Life;i++)
		{
			g2d.drawImage(CI.getLifeImg(), 1772-i*64, 0, null);
		}
		
		for (int i=0;i<Dmg;i++)
		{
			g2d.drawImage(CI.getDmgImg(), 1812-i*64, 120, null);
		}
	}
	
	public int getFighterLife()
	{
		return Life;
	}
	
	public int getFighterDmg()
	{
		return Dmg;
	}
	
	public Image getFighterImg(String image)
	{
		ImageIcon ic = new ImageIcon(image);
		return ic.getImage();	
	}
	
}
