package Contract;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import Model.Character;

public class Window extends JFrame
{
 
	private static final long serialVersionUID = 1L; // add default serial versionID

public void window(ArrayList<Character> characters,ArrayList<JButton> buttons,int mode){ // setting of the JFrame

	
	this.setTitle("Boulder Fighter"); // name of the window
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit the program when you close the window
	this.setSize(1920, 800); // size of the window
	this.setLocationRelativeTo(null); // window spawn in the center of the screen
	this.setResizable(false); // the window isn't resizable
	this.setAlwaysOnTop(false); 
	this.setContentPane(new WinEl(characters, buttons, mode)); // setting of the panel
    this.setVisible(true); // the window is visible
    

 }

 
}

