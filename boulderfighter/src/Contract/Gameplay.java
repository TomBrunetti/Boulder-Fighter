package Contract;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;

import Model.Character;
import Model.*;


public class Gameplay {
	
	private int lifeP,dC,lifeIA,dIA,fLife,flifeIA,idC,idIA; // variable initialize
	ArrayList<Character> characters = new ArrayList<Character>(); // add the arraylist characters and buttons
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	
		
	public void special(int id,int idE,int Action,int ActionE,boolean AI) // methods for character's special move
	{
		if (id==1 && ActionE==1) 
		{
			if(AI==true){lifeP=lifeP-dC;}
			else{lifeIA=lifeIA-dIA;}
			System.out.println("Special: dC reverberate");
		}
		
		if (id==2) // if player use Healer power
		{
			if(AI==true) 
			{
				lifeIA=lifeIA+2;
				if (lifeIA>flifeIA){lifeIA=flifeIA;}
			}
			else
			{
				lifeP=lifeP+2;
				if (lifeP>fLife){lifeP=fLife;}
			}
			System.out.println("Special: Heal(Life +2)");
		}
		
		if (id==3)
		{
			if(AI==true)
			{
			lifeIA=lifeIA-1;
			lifeP=lifeP-dIA-1;
			}
			else
			{
			lifeIA=lifeIA-dC-1;
			lifeP=lifeP-1;
			}
			
			System.out.println("Special: PowerBlow(dC+1,Life-1)");
			if (ActionE==2)
			{
				System.out.println("protection : ON");
				if(AI==false)
				{
				System.out.println("You hurt yourself");
				lifeIA=lifeIA+dC+1;
				}
				else
				{
				System.out.println("ennemy hurt itself");
				lifeP=lifeP+dIA+1;
				}
			}
			
			if (ActionE==3 && idE==1)
			{
				if(AI==true)
				{
					lifeIA=lifeIA-dIA-1;
				}
				else
				{
					lifeP=lifeP-dC-1;
				}
			}
		}
			
		if (id==4)
		{
			if(AI==true)
			{
				if(Action==1)
				{
					lifeIA=lifeIA+1;
				}
					lifeP=lifeP-dIA-1;
				if(Action==3)
				{
					if(id==3)
					{
						lifeIA=lifeIA+1;
						lifeP=lifeP-dIA-2;
					}
					if(id==4)
					{
						lifeP=lifeP-dIA;
					}
				}
			}
			else
			{
				if(ActionE==1)
				{
					lifeP=lifeP+1;
				}
					lifeIA=lifeIA-dC-1;
				if(ActionE==3)
				{
					if(idE==3)
					{
						lifeP=lifeP+1;
						lifeIA=lifeIA-dC-2;
					}
					if(idE==4)
					{
						lifeIA=lifeIA-dC;
					}
				}
			}
			System.out.println("Special: D.Mg (dC+1,dCE-1)");
			
			if (ActionE==2)
			{
				if(AI==true)
				{
				lifeIA=lifeIA-1;
				lifeP=lifeP+1;
				}
				else
				{
				lifeIA=lifeIA+1;
				lifeP=lifeP-1;
				}
				System.out.println("protection : ON");
				System.out.println("Noting Happen");
			}
			
			if (ActionE==3 && idE==1)
			{
				if(AI==true)
				{
				lifeIA=lifeIA-2;
				}
				else
				{
				lifeP=lifeP-2;
				}
			}
		}
	}
	
	public void go(int Action,int Action_AI,int idC,int idIA) // method during a round when player and chooses the actions
	{
		boolean AI;
		if (Action_AI==2) // if IA use defense
		{
			System.out.println("AI protect itself");
		}
		if (Action==2) // if player use defense
		{
			System.out.println("You're protect yourself");
		}
		if (Action==1) // if player attack
		{
			System.out.println("You Attack"); // if in the same round, ia use defense
			if (Action_AI==2)
			{
				System.out.println("But the AI protect itself");
				lifeIA=lifeIA+1-dC;
			}
			else{lifeIA=lifeIA-dC;} // ia takes player's damage
		}
		if (Action==3)
		{
			AI=false;
			special(idC,idIA,Action,Action_AI,AI);
		}
		if (Action_AI==1)
		{
			System.out.println("AI attack");
			if (Action==2)
			{
				lifeP=lifeP+1-dIA;
				System.out.println("But you're protecting yourself");
			}
			else{lifeP=lifeP-dIA;}
		}
		if (Action_AI==3)
		{
			AI=true;
			special(idIA,idC,Action_AI,Action,AI);
		}
		System.out.println("Your Life: "+lifeP);
		System.out.println("AI Life: "+lifeIA);
	}
	
	public void alea(int Action,int idC,int idIA)
	{
		Random r = new Random();
		int Action_AI=1+r.nextInt(3-1);
		go(Action,Action_AI,idC,idIA);
	}
	
	public void normal(int Action,int idC,int idIA) // algorytm of the normal mode
	{
		Random r = new Random(); 
		int Action_AI=1;
		if (Action==1){Action_AI=2+r.nextInt(3-2);} // if player attack, ia choose only special move or defense
		if (Action==3){Action_AI=3;}		
		go(Action,Action_AI,idC,idIA); // apply the action with parameters
	}
	
	public void hard(int Action,int idC,int idIA) // Algorytm of the hard mode 
	{
		int Action_AI=1;
		if (Action==1)
		{
			if (idC==1 || idC==4)
			{
				Action_AI=3;
			}
			else {Action_AI=2;}
		}
		if (Action==2)
		{
			if (idIA==2)
			{
				Action_AI=3;
			}
			else {Action_AI=1;}
		}
		if (Action==3)
		{
			if (idC==1 || idC==3 || idC==4)
			{
				Action_AI=2;
			}
		}
		go(Action,Action_AI,idC,idIA);
	}
	
	public void fight(int Difficulty,int Action,ArrayList<Character> characters) // method who set characters with the mode choose by the player
	{
		setCharacter(characters);
		if (Difficulty==1)
		{
			alea(Action,idC,idIA);
		}
		if (Difficulty==2)
		{
			normal(Action,idC,idIA);
		}
		if (Difficulty==3)
		{
			hard(Action,idC,idIA);
		}
		if(lifeIA<=0||lifeP<=0)
		{
			
			if(lifeP<=0) // if player lose the game
			{
				
				characters.clear(); // remove all character
				
				characters.add(new Lose(720, 210, 0, 0, 0, 0)); // add lose picture
				if (idIA==1) // add only the Ia's character in the window
				{
					characters.add(new Damager(1400,550,1,0,0,0));
				}
				if (idIA==2)
				{
					characters.add(new Healer(1400,550,2,0,0,0));
				}
				if (idIA==3)
				{
					characters.add(new Tank(1400,550,3,0,0,0));
				}
				if (idIA==4)
				{
					characters.add(new Mushroom(1400,550,4,0,0,0));
				}
				
			}
			else // if the player win
			{
				characters.clear(); // remove all character
				
				characters.add(new Win(750, 210, 0, 0, 0, 0)); // add win picture
				if (idC==1) // add only the player's character in the window
				{
					characters.add(new Damager(500,550,1,0,0,0));
				}
				if (idC==2)
				{
					characters.add(new Healer(500,550,2,0,0,0));
				}
				if (idC==3)
				{
					characters.add(new Tank(500,550,3,0,0,0));
				}
				if (idC==4)
				{
					characters.add(new Mushroom(500,550,4,0,0,0));
				}
			}	
		}
		else
		{
		characters.clear(); // to complete if ther is a problem
		reset(characters);
		}
	}
	
	public void setCharacter(ArrayList<Character> characters) // setting of the characters
	{
		for(int i=0;i<characters.size();i++)
		{
			Character TempCharacter = characters.get(i);
			if(i==0)
			{
				idC = TempCharacter.getId();
				lifeP = TempCharacter.getLife();
				fLife = TempCharacter.getFLife();
				dC = TempCharacter.getDmg();
			}
			else
			{
				idIA = TempCharacter.getId();
				lifeIA = TempCharacter.getLife();
				flifeIA = TempCharacter.getFLife();
				dIA = TempCharacter.getDmg();
			}
		}
	} 
	
	public void reset(ArrayList<Character> characters) // redefine life and damage and display it
	{
		if (idC==1)
		{
			characters.add(new Damager(500,550,1,lifeP,3,2));
		}
		if (idC==2)
		{
			characters.add(new Healer(500,550,2,lifeP,4,1));
		}
		if (idC==3)
		{
			characters.add(new Tank(500,550,3,lifeP,5,1));
		}
		if (idC==4)
		{
			characters.add(new Mushroom(500,550,4,lifeP,3,1));
		}
		if (idIA==1)
		{
			characters.add(new Damager(1400,550,1,lifeIA,3,2));
		}
		if (idIA==2)
		{
			characters.add(new Healer(1400,550,2,lifeIA,4,1));
		}
		if (idIA==3)
		{
			characters.add(new Tank(1400,550,3,lifeIA,5,1));
		}
		if (idIA==4)
		{
			characters.add(new Mushroom(1400,550,4,lifeIA,3,1));
		}
	}
}