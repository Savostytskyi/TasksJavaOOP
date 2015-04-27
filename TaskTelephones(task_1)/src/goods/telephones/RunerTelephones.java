package goods.telephones;

import javax.jws.Oneway;

public class RunerTelephones {

	public static void main(String[] args) {	
		PhoneConteiner container = new PhoneConteiner();
		SmartPhone smg = new SmartPhone(6500.00, "Sumsung", "Galexy 4", "black", "8mp", "4.7 inc.", "Androin 4.0.1");
		SmartPhone htc = new SmartPhone(3500.00, "HTC", "WildFire", "red", "3mp", "4.5 inc.", "Androin 4.1.1");
		HomePhone psc = new HomePhone(1200.00, "Panasonic", "k200", "white", "RJ-11", "backlit buttons");
		HomePhone lg = new HomePhone();
		
		container.add(smg);
		container.add(htc);
		container.add(psc);
		container.add(lg);
		container.count();
	
		container.getByIndex(2);
		System.out.println();
		container.sort();
		

		for (int i = 0; i < container.t.length; i++) {
			System.out.println(container.t[i]);
		}
			System.out.println();
System.out.println("Sorted collection:");
		for (int i = 0; i < container.t.length; i++) {
			System.out.println(container.t[i]);
		}

System.out.println("Average price of of home phones: "+HomePhone.getAvg());
System.out.println("Average price of smartphones: "+SmartPhone.getAvg());
System.out.println();
	}

}
