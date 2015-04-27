package people.human;

public abstract class Human<P> {

	protected boolean basisOfSex=false;
	protected String name;
	protected String surname;
	protected float growth;
	protected float weight;

	
	public boolean isBasisOfSex() {
		return basisOfSex;
	}

	public void setBasisOfSex(boolean basisOfSex) {
		this.basisOfSex = basisOfSex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public float getGrowth() {
		return growth;
	}

	public void setGrowth(float growth) {
		this.growth = growth;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	protected boolean talk(Human<P> obj) {
		if (this.isBasisOfSex()==false && obj.isBasisOfSex()==false)
		return true;
		else if (this.isBasisOfSex() ^ obj.isBasisOfSex()) 
			return true;
		else if (this.isBasisOfSex() & obj.isBasisOfSex())
			return Math.random() < 0.5 ? true : false;
		else return false;
	}
	
	protected boolean tolerate (Human<P> obj) {
		if (this.isBasisOfSex()==false && obj.isBasisOfSex()==false) {
		return Math.random() < 0.05 ? true : false;
		} else if (this.isBasisOfSex() ^ obj.isBasisOfSex()) {
			return Math.random() < 0.7 ? true : false;
		} else if (this.isBasisOfSex() & obj.isBasisOfSex()) {
			return Math.random() < 0.056 ? true : false;
		} else return false;
	}
	
	protected boolean spendTimeTogether (Human<P> obj) {
		float percent;
		percent = this.getGrowth()*100/obj.getGrowth();
		//System.out.println(percent);
		if ((percent>=90) && (percent<=110)) {
			return Math.random() < 0.95 ? true : false;
		} else return Math.random() < 0.85 ? true : false;
		
	}
	
	protected void haveRelationship(Human<P> obj) {
		boolean time=this.spendTimeTogether(obj);
		boolean toler=this.tolerate(obj);
		boolean tall=this.talk(obj);
		if (this.isBasisOfSex() ^ obj.isBasisOfSex()) {
			
		if (time==true && toler==true && tall==true) {
			
			System.out.println("Ура получилось!");
			if(this.isBasisOfSex()==false)
				System.out.println(((Woman) this).humanBirth((Man) obj));
			else System.out.println(((Woman) obj).humanBirth((Man) this));}
			else System.out.println("Не вышло разбежались.....");	
		} else System.out.println("Не вышло разбежались..... Однополый брак))");
	//	System.out.println("(Говорить: "+tall+" Терпеть: "+toler+" Проводить время: "+time+" )");
	}
	
	@Override
	public String toString() {
		return "Human [basisOfSex=" + basisOfSex + ", name=" + name
				+ ", surname=" + surname + ", growth=" + growth + ", weight="
				+ weight + "]";
	}

	

	

	
}
