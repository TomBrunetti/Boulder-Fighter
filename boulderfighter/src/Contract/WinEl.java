package Contract;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Model.Character;


@SuppressWarnings("serial")
public class WinEl extends JPanel implements ActionListener

{
	ArrayList<Character> characters = new ArrayList<Character>();
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	Window W = new Window();
	JLabel wallpaper;
	int action = 0,mode = 1;
	Gameplay g = new Gameplay();
	
	
	
	
	public WinEl(ArrayList<Character> characters, ArrayList<JButton> buttons,int mode)
	{
		this.mode=mode;
		buttons.add(new JButton("Attack")); // add attack button
		buttons.add(new JButton("Defense")); // add defense button
		buttons.add(new JButton("Special Move")); // add special move button
		this.setLayout(null); // for JButton
		this.characters = characters; // association of character
		this.buttons = buttons; // association of buttons
		setFocusable(true);
		
		for (int i = 0; i < buttons.size(); i++)
		{
			JButton tempButton = buttons.get(i);
			tempButton.setBounds(1000/2-(225*i), 1000/2-50, 150, 100);
			tempButton.addActionListener(this);
			this.add(tempButton);
		}
		
		
		ImageIcon ii = new ImageIcon("picture/background.png"); //import background in ii
		wallpaper = new JLabel(ii); // new wallpaper object
		wallpaper.setBounds(0, 0, 1920, 1080); // setting of wallpaper
		this.add(wallpaper); // add new wallpaper
		
		
		
		
		
	}
	
	
	
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g; // change g graphics into graphics 2d
		for (int i = 0; i < characters.size(); i++)
		{
			Character tempPlayer = characters.get(i);
			if ( i == 0)
			{
				tempPlayer.draw(g2d);
			}
			else
			{
				tempPlayer.drawReverse(g2d);
			}
			
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {// setting of action button
		
		if(arg0.getSource() == buttons.get(0)) // if attack's button is pressed
		{
			action = 1;
			g.fight(mode, action, characters); // then attack
			
		}
		if(arg0.getSource() == buttons.get(1)) // if defense's button is pressed
		{
			action = 2;
			g.fight(mode, action, characters); // defense
			
		}
		if(arg0.getSource() == buttons.get(2)) // if special's button is pressed
		{
			action = 3;
			g.fight(mode, action, characters); // special move
			
		}
		else{}
		repaint();
	}
}
		
		
		
		
		
	
