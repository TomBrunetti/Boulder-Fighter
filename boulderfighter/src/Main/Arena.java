package Main;


import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import Contract.Window;
import Model.Character;
import Model.*;

public class Arena  {
	
	String Choosec;
	String Choosel;
	ArrayList<Character> characters = new ArrayList<Character>();
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	int mode = 0;
	
	public void Aren(){
		

	CharChoice(Choosec);
	LevelChoice(Choosel);
	
	Window wd = new Window();
	System.out.println(mode);
	wd.window(characters,buttons,mode);
	
}
	 public void CharChoice(String argv) {

		    String[] charac = {"1.Tank", "2.Healer", "3.Mushroom", "4.Fighter"}; 
		    String choose1 = (String)JOptionPane.showInputDialog(null, "Choose your Heroes !","Heroes !",JOptionPane.QUESTION_MESSAGE,null,charac,charac[3]);
		    this.Choosec = choose1;
		    int CC = Integer.parseInt(Choosec.substring(0,1));
		    if(CC==1)
		    {
		    	characters.add(new Tank(500, 550, 3, 5, 5, 1));
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
		    	characters.add(new Fighter(500, 550, 1, 3, 3, 2));
		    }	
		    Random r = new Random();
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
		    	characters.add(new Fighter(1400, 550, 1, 3, 3, 2));
		    }
		    }
		
	 public void LevelChoice(String argv2) {

		    String[] mode = {"1.Normal", "2.Hard", "3.Alea"};
		    String choose2 = (String)JOptionPane.showInputDialog(null, "Choose your mode !","Mode", JOptionPane.QUESTION_MESSAGE,null,mode,mode[2]);
		    this.Choosel = choose2;
		    int CC = Integer.parseInt(Choosel.substring(0,1));
		    if(CC==1)
		    {
		    	this.mode = 2;
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