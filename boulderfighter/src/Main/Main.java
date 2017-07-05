package Main;

import java.util.ArrayList;

import javax.swing.JButton;

import Contract.Window;
import Model.Character;

public class Main {
	
	
	public static void main(String[] args) {
	
	ArrayList<Character> characters = new ArrayList<Character>();
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	
	buttons.add(new JButton("Play"));
	buttons.add(new JButton("Quit"));
	
    Window wd = new Window();
		wd.window(characters,buttons);
	}
}

		