package Main;


import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import Contract.Window;
import Model.Character;

public class Arena  {
	
	String Choosec;
	String Choosel;
	ArrayList<Character> characters = new ArrayList<Character>();
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	
	public void Aren(){
		

	CharChoice(Choosec);
	LevelChoice(Choosel);
	
	
	
	
	Window wd = new Window();
	ArrayList<Character> characters = new ArrayList<Character>();
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	wd.window(characters,buttons);
	
}
	 public void CharChoice(String argv) {

		    String[] charac = {"Tank", "Healer", "Mushroom", "Fighter"}; 
		    String choose1 = (String)JOptionPane.showInputDialog(null, "Choose your Heroes !","Heroes !",JOptionPane.QUESTION_MESSAGE,null,charac,charac[3]);
		    this.Choosec = choose1;
		    System.out.println(Choosec);
		   
		   
	 }
		
	 public void LevelChoice(String argv2) {

		    String[] charac = {"Normal", "Hard", "Alea"};
		    String choose2 = (String)JOptionPane.showInputDialog(null, "Choose your Heroes !","Heroes !", JOptionPane.QUESTION_MESSAGE,null,charac,charac[2]);
		    this.Choosel = choose2;
		    System.out.println(Choosel);

		    
		   
	 }
}