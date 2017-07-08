package Contract;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;

import Model.Character;
import Model.*;


public class Gameplay {
	
	private int Life,Dmg,LifeAI,DmgAI,FLife,FLifeAI,id_Character,id_AI;
	ArrayList<Character> characters = new ArrayList<Character>();
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	
		
	public void special(int id,int idE,int Action,int ActionE,boolean AI)
	{
		if (id==1 && ActionE==1)
		{
			if(AI==true){Life=Life-Dmg;}
			else{LifeAI=LifeAI-DmgAI;}
			System.out.println("Special: Dmg reverberate");
		}
		
		if (id==2)
		{
			if(AI==true) 
			{
				LifeAI=LifeAI+2;
				if (LifeAI>FLifeAI){LifeAI=FLifeAI;}
			}
			else
			{
				Life=Life+2;
				if (Life>FLife){Life=FLife;}
			}
			System.out.println("Special: Heal(Life +2)");
		}
		
		if (id==3)
		{
			if(AI==true)
			{
			LifeAI=LifeAI-1;
			Life=Life-DmgAI-1;
			}
			else
			{
			LifeAI=LifeAI-Dmg-1;
			Life=Life-1;
			}
			
			System.out.println("Special: PowerBlow(Dmg+1,Life-1)");
			if (ActionE==2)
			{
				System.out.println("protection : ON");
				if(AI==false)
				{
				System.out.println("You hurt yourself");
				LifeAI=LifeAI+Dmg+1;
				}
				else
				{
				System.out.println("ennemy hurt itself");
				Life=Life+DmgAI+1;
				}
			}
			
			if (ActionE==3 && idE==1)
			{
				if(AI==true)
				{
					LifeAI=LifeAI-DmgAI-1;
				}
				else
				{
					Life=Life-Dmg-1;
				}
			}
		}
			
		if (id==4)
		{
			if(AI==true)
			{
				if(Action==1)
				{
					LifeAI=LifeAI+1;
				}
					Life=Life-DmgAI-1;
				if(Action==3)
				{
					if(id==3)
					{
						LifeAI=LifeAI+1;
						Life=Life-DmgAI-2;
					}
					if(id==4)
					{
						Life=Life-DmgAI;
					}
				}
			}
			else
			{
				if(ActionE==1)
				{
					Life=Life+1;
				}
					LifeAI=LifeAI-Dmg-1;
				if(ActionE==3)
				{
					if(idE==3)
					{
						Life=Life+1;
						LifeAI=LifeAI-Dmg-2;
					}
					if(idE==4)
					{
						LifeAI=LifeAI-Dmg;
					}
				}
			}
			System.out.println("Special: D.Mg (Dmg+1,DmgE-1)");
			
			if (ActionE==2)
			{
				if(AI==true)
				{
				LifeAI=LifeAI-1;
				Life=Life+1;
				}
				else
				{
				LifeAI=LifeAI+1;
				Life=Life-1;
				}
				System.out.println("protection : ON");
				System.out.println("Noting Happen");
			}
			
			if (ActionE==3 && idE==1)
			{
				if(AI==true)
				{
				LifeAI=LifeAI-2;
				}
				else
				{
				Life=Life-2;
				}
			}
		}
	}
	
	public void go(int Action,int Action_AI,int id_Character,int id_AI)
	{
		boolean AI;
		if (Action_AI==2)
		{
			System.out.println("AI protect itself");
		}
		if (Action==2)
		{
			System.out.println("You're protect yourself");
		}
		if (Action==1)
		{
			System.out.println("You Attack");
			if (Action_AI==2)
			{
				System.out.println("But the AI protect itself");
				LifeAI=LifeAI+1-Dmg;
			}
			else{LifeAI=LifeAI-Dmg;}
		}
		if (Action==3)
		{
			AI=false;
			special(id_Character,id_AI,Action,Action_AI,AI);
		}
		if (Action_AI==1)
		{
			System.out.println("AI attack");
			if (Action==2)
			{
				Life=Life+1-DmgAI;
				System.out.println("But you're protecting yourself");
			}
			else{Life=Life-DmgAI;}
		}
		if (Action_AI==3)
		{
			AI=true;
			special(id_AI,id_Character,Action_AI,Action,AI);
		}
		System.out.println("Your Life: "+Life);
		System.out.println("AI Life: "+LifeAI);
	}
	
	public void Alea(int Action,int id_Character,int id_AI)
	{
		Random r = new Random();
		int Action_AI=1+r.nextInt(3-1);
		go(Action,Action_AI,id_Character,id_AI);
	}
	
	public void Normal(int Action,int id_Character,int id_AI)
	{
		Random r = new Random();
		int Action_AI=1;
		if (Action==1){Action_AI=2+r.nextInt(3-2);}
		if (Action==3){Action_AI=3;}		
		go(Action,Action_AI,id_Character,id_AI);
	}
	
	public void Hard(int Action,int id_Character,int id_AI)
	{
		int Action_AI=1;
		if (Action==1)
		{
			if (id_Character==1 || id_Character==4)
			{
				Action_AI=3;
			}
			else {Action_AI=2;}
		}
		if (Action==2)
		{
			if (id_AI==2)
			{
				Action_AI=3;
			}
			else {Action_AI=1;}
		}
		if (Action==3)
		{
			if (id_Character==1 || id_Character==3 || id_Character==4)
			{
				Action_AI=2;
			}
		}
		go(Action,Action_AI,id_Character,id_AI);
	}
	
	public void Fight(int Difficulty,int Action,ArrayList<Character> characters)
	{
		setCharacter(characters);
		if (Difficulty==1)
		{
			Alea(Action,id_Character,id_AI);
		}
		if (Difficulty==2)
		{
			Normal(Action,id_Character,id_AI);
		}
		if (Difficulty==3)
		{
			Hard(Action,id_Character,id_AI);
		}
		if(LifeAI<=0||Life<=0)
		{
			
			if(Life<=0)
			{
				
				characters.clear();
				buttons.clear();
				characters.add(new Lose(720, 210, 0, 0, 0, 0));
				if (id_AI==1)
				{
					characters.add(new Fighter(1400,550,1,0,0,0));
				}
				if (id_AI==2)
				{
					characters.add(new Healer(1400,550,2,0,0,0));
				}
				if (id_AI==3)
				{
					characters.add(new Tank(1400,550,3,0,0,0));
				}
				if (id_AI==4)
				{
					characters.add(new Mushroom(1400,550,4,0,0,0));
				}
				
			}
			else
			{
				characters.clear();
				buttons.clear();
				characters.add(new Win(750, 210, 0, 0, 0, 0));
				if (id_Character==1)
				{
					characters.add(new Fighter(500,550,1,0,0,0));
				}
				if (id_Character==2)
				{
					characters.add(new Healer(500,550,2,0,0,0));
				}
				if (id_Character==3)
				{
					characters.add(new Tank(500,550,3,0,0,0));
				}
				if (id_Character==4)
				{
					characters.add(new Mushroom(500,550,4,0,0,0));
				}
			}	
		}
		else
		{
		characters.clear();
		Reset(characters);
		}
	}
	
	public void setCharacter(ArrayList<Character> characters)
	{
		for(int i=0;i<characters.size();i++)
		{
			Character TempCharacter = characters.get(i);
			if(i==0)
			{
				id_Character = TempCharacter.getId();
				Life = TempCharacter.getLife();
				FLife = TempCharacter.getFLife();
				Dmg = TempCharacter.getDmg();
			}
			else
			{
				id_AI = TempCharacter.getId();
				LifeAI = TempCharacter.getLife();
				FLifeAI = TempCharacter.getFLife();
				DmgAI = TempCharacter.getDmg();
			}
		}
	}
	
	public void Reset(ArrayList<Character> characters)
	{
		if (id_Character==1)
		{
			characters.add(new Fighter(500,550,1,Life,3,2));
		}
		if (id_Character==2)
		{
			characters.add(new Healer(500,550,2,Life,4,1));
		}
		if (id_Character==3)
		{
			characters.add(new Tank(500,550,3,Life,5,1));
		}
		if (id_Character==4)
		{
			characters.add(new Mushroom(500,550,4,Life,3,1));
		}
		if (id_AI==1)
		{
			characters.add(new Fighter(1400,550,1,LifeAI,3,2));
		}
		if (id_AI==2)
		{
			characters.add(new Healer(1400,550,2,LifeAI,4,1));
		}
		if (id_AI==3)
		{
			characters.add(new Tank(1400,550,3,LifeAI,5,1));
		}
		if (id_AI==4)
		{
			characters.add(new Mushroom(1400,550,4,LifeAI,3,1));
		}
	}
}