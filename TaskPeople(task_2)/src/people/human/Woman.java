package people.human;

import java.util.Scanner;

public class Woman<P> extends Human {
	
	
	
	protected Human<P> humanBirth(Man obj) {
		int rand=1 + (int)(Math.random() * ((10 - 1) + 1));
		if (rand<=5) {
			Man m = new Man();
			System.out.println("¬ведите им€ нового человека (мужчина):");
			Scanner scan = new Scanner(System.in);
			m.setBasisOfSex(true);
			m.setName(scan.next());
			m.setSurname(obj.getSurname());
			m.setGrowth(obj.getGrowth()+0.1f*(this.getGrowth()-obj.getGrowth()));
			m.setWeight(obj.getWeight()+0.1f*(this.getWeight()-obj.getWeight()));
			return m;
		} else {
			Woman w = new Woman();
			System.out.println("¬ведите им€ нового человека (женщина):");
			Scanner scan = new Scanner(System.in);
			w.setName(scan.next());
			w.setSurname(obj.getSurname());
			w.setGrowth(this.getGrowth()+0.1f*(obj.getGrowth()-this.getGrowth()));
			w.setWeight(this.getWeight()+0.1f*(obj.getWeight()-this.getWeight()));
			return w;
		}
		
	}

	@Override
	public String toString() {
		return "Woman [basisOfSex=" + basisOfSex + ", name=" + name
				+ ", surname=" + surname + ", growth=" + growth + ", weight="
				+ weight + "]";
	}
	
}
