package Model;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Lose extends Character {
	GameImage CI = new GameImage(); 
	
	public Lose(int x, int y, int id, int Life,int FLife, int Dmg) {
		super(x, y, id, Life,FLife, Dmg);
	}
	
	
	
	public void draw(Graphics2D g2d)
	{
		g2d.drawImage(getLoseImg("picture/lose.png"), x, y, null);
		for (int i=0;i<Life;i++)
		{
			g2d.drawImage(CI.getLifeImg(), i*64, 0, null);
		}
		
		for (int i=0;i<Dmg;i++)
		{
			g2d.drawImage(CI.getDmgImg(), i*64, 120, null);
		}
	}
	
	
	public Image getLoseImg(String image)
	{
		ImageIcon ic = new ImageIcon(image);
		return ic.getImage();	
	}
	
}

