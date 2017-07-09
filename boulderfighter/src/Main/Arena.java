package Main;


import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import Contract.Window;
import Model.Character;
import Model.*;

public class Arena  { // Arena class
	
	String Choosec; // attribute declaration
	String Choosel;
	ArrayList<Character> characters = new ArrayList<Character>();
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	int mode = 0;
	
	public void Aren(){
		

	CharChoice(Choosec); // method who get the character's choice of player
	LevelChoice(Choosel); // method who get the level's choice of player
	
	Window wd = new Window(); // create window's object
	System.out.println(mode); // display the mode in the console
	wd.window(characters,buttons,mode); // set a new window with player's parameters
	
}
	 public void CharChoice(String argv) { // method to have the player's character

		    String[] charac = {"1.Tank", "2.Healer", "3.Mushroom", "4.Fighter"}; // String variable for choose
		    String choose1 = (String)JOptionPane.showInputDialog(null, "Choose your Heroes !","Heroes !",JOptionPane.QUESTION_MESSAGE,null,charac,charac[3]); // setting of the OptionPanel
		    this.Choosec = choose1;
		    int CC = Integer.parseInt(Choosec.substring(0,1)); // CC take the first caracter (1, 2, 3, or 4)
		    if(CC==1)
		    {
		    	characters.add(new Tank(500, 550, 3, 5, 5, 1)); // if it's 1 then it's the Tank etc...
		    }
		    if(CC==2)
		    {
		    	characters.add(new Healer(500, 550, 2, 4, 4, 1));
		    }
		    if(CC==3)
		    {
		    	characters.add(new Mushroom(500, 550, 4, 3, 3, 1));
		    }
	
		    if(CC==4)
		    {
		    	characters.add(new Damager(500, 550, 1, 3, 3, 2));
		    }	
		    Random r = new Random(); // the program choose an IA randomly
		    CC= 1+r.nextInt(5-1);
		    if(CC==1)
		    {
		    	characters.add(new Tank(1400, 550, 3, 5, 5, 1));
		    }
		    if(CC==2)
		    {
		    	characters.add(new Healer(1400, 550, 2, 4, 4, 1));
		    }
		    if(CC==3)
		    {
		    	characters.add(new Mushroom(1400, 550, 4, 3, 3, 1));
		    }
	
		    if(CC==4)
		    {
		    	characters.add(new Damager(1400, 550, 1, 3, 3, 2));
		    }
		    }
		
	 public void LevelChoice(String argv2) { // method to choose the level

		    String[] mode = {"1.Normal", "2.Hard", "3.Alea"};// String variable for choose
		    String choose2 = (String)JOptionPane.showInputDialog(null, "Choose your mode !","Mode", JOptionPane.QUESTION_MESSAGE,null,mode,mode[2]); // setting of the OptionPanel
		    this.Choosel = choose2;
		    int CC = Integer.parseInt(Choosel.substring(0,1));// CC take the first character (1, 2, or 3)
		    if(CC==1)
		    {
		    	this.mode = 2; // if it's 1 then it(s level normal etc...
		    }
		    if(CC==2)
		    {
		    	this.mode = 3;
		    }
		    if(CC==3)
		    {
		    	this.mode = 1;
		    }
		   
	 }
}