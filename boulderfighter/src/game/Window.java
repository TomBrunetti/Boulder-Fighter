package game;

import javax.swing.JFrame;

public class Window extends JFrame
{
{
    World w = new World();
    
	
	this.setTitle("Test");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(700, 360);
	this.setLocationRelativeTo(null);
	this.setResizable(false);
	this.setAlwaysOnTop(true);
    
	this.setContentPane(w);
    this.setVisible(true);

}
}

