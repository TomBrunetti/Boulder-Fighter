package Model;

public class Information {

	private int id,idAI,Life,Dmg,LifeAI,DmgAI,FLife,FLifeAI;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdAI() {
		return idAI;
	}

	public void setIdAI(int idAI) {
		this.idAI = idAI;
	}

	public int getLife() {
		return Life;
	}

	public void setLife(int life) {
		Life = life;
	}

	public int getDmg() {
		return Dmg;
	}

	public void setDmg(int dmg) {
		Dmg = dmg;
	}

	public int getLifeAI() {
		return LifeAI;
	}

	public void setLifeAI(int lifeAI) {
		LifeAI = lifeAI;
	}

	public int getDmgAI() {
		return DmgAI;
	}

	public void setDmgAI(int dmgAI) {
		DmgAI = dmgAI;
	}

	public int getFLife() {
		return FLife;
	}

	public void setFLife(int fLife) {
		FLife = fLife;
	}

	public int getFLifeAI() {
		return FLifeAI;
	}

	public void setFLifeAI(int fLifeAI) {
		FLifeAI = fLifeAI;
	}

	public void setAll(int id,int idAI,int Life,int Dmg,int LifeAI,int DmgAI,int FLife,int FLifeAI)
	{
		this.id = id;
		this.idAI = idAI;
		this.FLife = FLife;
		this.FLifeAI = FLifeAI;
		this.DmgAI = DmgAI;
		this.Dmg = Dmg;
		this.LifeAI = LifeAI;
		this.Life = Life;	
	}
}
