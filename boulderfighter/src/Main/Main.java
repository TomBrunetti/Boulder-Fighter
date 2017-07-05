package Main;

import java.util.ArrayList;

import javax.swing.JButton;

import Model.Character;

public class Main {
	
	public static void main(String[] args) {
		
	ArrayList<Character> characters = new ArrayList<Character>();
	ArrayList<JButton> buttons = new ArrayList<JButton>();
    Window wd = new Window();
		wd.window(characters,buttons);
	}
}

		