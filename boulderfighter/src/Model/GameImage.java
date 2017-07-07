package Model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class GameImage {

	public Image getLifeImg()
	{
		ImageIcon ic = new ImageIcon("picture/heart.png");
		return ic.getImage();
	}
	public Image getDmgImg()
	{
		ImageIcon ic = new ImageIcon("picture/star.png");
		return ic.getImage();
	}
}
