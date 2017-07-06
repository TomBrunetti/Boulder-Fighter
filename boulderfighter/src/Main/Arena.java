package Main;


import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
	
	
	buttons.add(new JButton("Attack"));
	buttons.add(new JButton("Defense"));
	buttons.add(new JButton("Special Move"));
	
}
	 public void CharChoice(String argv) {

		    String[] charac = {"Tank", "Healer", "Mushroom", "Fighter"};

		    JOptionPane jop = new JOptionPane(), jop2 = new JOptionPane();

		    String choose1 = "lol";
		    
		    choose1 = (String)jop.showInputDialog(null, "Choose your Heroes !","Heroes !",JOptionPane.QUESTION_MESSAGE,null,charac,charac[3]);
		    this.Choosec = choose1;
		    System.out.println(Choosec);
		    

		    
		   
	 }
		
	 public void LevelChoice(String argv2) {

		    String[] charac = {"Normal", "Hard", "Alea"};
		    JOptionPane jop = new JOptionPane(), jop2 = new JOptionPane();
		    String choose2 = (String)jop.showInputDialog(null, "Choose your Heroes !","Heroes !", JOptionPane.QUESTION_MESSAGE,null,charac,charac[2]);
		    this.Choosel = choose2;
		    System.out.println(Choosel);

		    
		   
	 }
}