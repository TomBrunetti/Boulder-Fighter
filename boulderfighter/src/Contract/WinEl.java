package Contract;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import Model.Character;
import Model.*;


public class WinEl extends JPanel implements ActionListener

{
	ArrayList<Character> characters = new ArrayList<Character>();
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	Window W = new Window();
	JLabel wallpaper;
	String title = "TEST";
	
	
	
	
	
	public WinEl(ArrayList<Character> characters, ArrayList<JButton> buttons)
	{
		
		this.setLayout(null); // pour les JButton
		this.characters = characters;
		this.buttons = buttons;
		setFocusable(true);
		
		for (int i = 0; i < buttons.size(); i++)
		{
			JButton tempButton = buttons.get(i);
			tempButton.setBounds(1920/2-(225*i), 1080/2-50, 150, 100);
			tempButton.addActionListener(this);
			this.add(tempButton);
		}
		
		ImageIcon ii = new ImageIcon("picture/background.png");
		wallpaper = new JLabel(ii);
		wallpaper.setBounds(0, 0, 1920, 1080);
		this.add(wallpaper);
		
		
		
	}
	
	
	
	public void paintCompenent(Graphics g)
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
	public void actionPerformed(ActionEvent arg0) { // permet de définir les actions des boutons
		if(arg0.getSource() == buttons.get(0))
		{
			SwingUtilities.windowForComponent(this).dispose();
			
		}
		if(arg0.getSource() == buttons.get(1))
		{
			SwingUtilities.windowForComponent(this).dispose();
		}
		else{}
	}
}
		
		
		
		
		
	
