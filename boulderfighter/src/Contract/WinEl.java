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
import Main.Arena;
import Model.Character;


@SuppressWarnings("serial")
public class WinEl extends JPanel implements ActionListener

{
	ArrayList<Character> characters = new ArrayList<Character>();
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	Window W = new Window();
	JLabel wallpaper;
	JLabel tank;
	String title = "TEST";
	int action = 0;
	Gameplay g = new Gameplay();
	
	
	
	
	public WinEl(ArrayList<Character> characters, ArrayList<JButton> buttons)
	{
		buttons.add(new JButton("Attack"));
		buttons.add(new JButton("Defense"));
		buttons.add(new JButton("Special Move"));
		this.setLayout(null); // pour les JButton
		this.characters = characters;
		this.buttons = buttons;
		setFocusable(true);
		
		for (int i = 0; i < buttons.size(); i++)
		{
			JButton tempButton = buttons.get(i);
			tempButton.setBounds(1250/2-(225*i), 1900/2-50, 150, 100);
			tempButton.addActionListener(this);
			this.add(tempButton);
		}
		/*ImageIcon ii2 = new ImageIcon("picture/tank.png");
		tank = new JLabel(ii2);
		tank.setBounds(500, 550, 122, 116);
		this.add(tank);*/
		
		ImageIcon ii = new ImageIcon("picture/background.png");
		wallpaper = new JLabel(ii);
		wallpaper.setBounds(0, 0, 1920, 1080);
		this.add(wallpaper);
		
		
		
	}
	
	
	
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g; // change le g de graphics en grpahics 2d
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
	public void actionPerformed(ActionEvent arg0) {// permet de définir les actions des boutons
		Arena a = new Arena();
		
		if(arg0.getSource() == buttons.get(0))
		{
			action = 1;
			int mode = a.getMode();
			g.Fight(mode, action, characters);
			
		}
		if(arg0.getSource() == buttons.get(1))
		{
			action = 2;
			int mode = a.getMode();
			g.Fight(mode, action, characters);
			
		}
		if(arg0.getSource() == buttons.get(2))
		{
			action = 3;
			int mode = a.getMode();
			g.Fight(mode, action, characters);
			
		}
		else{}
	}
}
		
		
		
		
		
	
