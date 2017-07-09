package Contract;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import Model.Character;

public class Window extends JFrame
{
 
	private static final long serialVersionUID = 1L; // add default serial versionID

public void window(ArrayList<Character> characters,ArrayList<JButton> buttons,int mode){

	
	this.setTitle("Boulder Fighter");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(1920, 800);
	this.setLocationRelativeTo(null);
	this.setResizable(false);
	this.setAlwaysOnTop(false);
	this.setContentPane(new WinEl(characters, buttons, mode));
    this.setVisible(true);
    

 }

 
}

