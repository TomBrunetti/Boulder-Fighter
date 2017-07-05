package Main;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import Model.*;
import Model.Character;

public class Window extends JFrame
{
 public void window(ArrayList<Character> characters, ArrayList<JButton> buttons){
    
	//ArrayList<Character> characters = new ArrayList<Character>();
	//ArrayList<JButton> buttons = new ArrayList<JButton>();
	
	this.setTitle("Test");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(1920, 1080);
	this.setLocationRelativeTo(null);
	this.setResizable(false);
	this.setAlwaysOnTop(true);
	this.setContentPane(new WinEl(characters, buttons));
    this.setVisible(true);

 }
}

