package Main;
import java.util.ArrayList;

import javax.swing.JButton;

import Contract.Window;
import Model.Character;


public class Main {
	
	
	public static void main(String[] args) {
	
		setter();
		Window wd = new Window();
		ArrayList<Character> characters = new ArrayList<Character>();
		ArrayList<JButton> buttons = new ArrayList<JButton>();
		wd.window(characters,buttons);
		
		

	
    
	}
	public static void setter() {
		Arena ar = new Arena();
		ar.Aren();
		
	}
}

		