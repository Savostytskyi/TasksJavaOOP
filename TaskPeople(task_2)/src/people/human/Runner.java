package people.human;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

		public static ArrayList<Human> humans = new ArrayList<Human>();
		public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args){
	

		  System.out.println("Введите пол первого человека M или М (Ж или W): ");
		  String sx = scan.next();
		  makePeople(sx);
		  
		  System.out.println("Введите пол второго человека M или М (Ж или W): ");
		  sx = scan.next();
		  makePeople(sx);
		  
		  for (int i=0; i<25; i++)
			    System.out.println();

			for (Human human : humans) {
				System.out.println(human);
				
			}

			humans.get(0).haveRelationship(humans.get(1));
				
	}

	public static void makePeople(String sx) {
	
		  if(sx.equals("W") || sx.equals("Ж") || sx.equals("w") || sx.equals("ж")) {
				Woman w = new Woman();
				try {
				System.out.println("Введите имя:");
				w.setName(scan.next());
				System.out.println("Введите фамилию:");
				w.setSurname(scan.next());
				System.out.println("Введите рост:");
				w.setGrowth(Float.parseFloat((scan.next())));
				System.out.println("Введите вес:");
				w.setWeight(Float.parseFloat((scan.next())));
				}catch (IllegalArgumentException e){
					System.out.println("Ошибка ввода!");
					System.exit(1);
				}
				humans.add(w);	
				
			} else if (sx.equals("M") || sx.equals("М") || sx.equals("м") || sx.equals("М")) {
				Man m = new Man();
				try {
				m.setBasisOfSex(true);
				System.out.println("Введите имя:");
				m.setName(scan.next());
				System.out.println("Введите фамилию:");
				m.setSurname(scan.next());
				System.out.println("Введите рост:");
				m.setGrowth(Float.parseFloat((scan.next())));
				System.out.println("Введите вес:");
				m.setWeight(Float.parseFloat((scan.next())));
				}catch (IllegalArgumentException e){
					System.out.println("Ошибка ввода!");
					System.exit(2);
				}
				humans.add(m);	
			} else {
			System.out.println("Ошибка ввода!");
			System.exit(3);}
		}
	
}
