package people.human;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

		public static ArrayList<Human> humans = new ArrayList<Human>();
		public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args){
	

		  System.out.println("������� ��� ������� �������� M ��� � (� ��� W): ");
		  String sx = scan.next();
		  makePeople(sx);
		  
		  System.out.println("������� ��� ������� �������� M ��� � (� ��� W): ");
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
	
		  if(sx.equals("W") || sx.equals("�") || sx.equals("w") || sx.equals("�")) {
				Woman w = new Woman();
				try {
				System.out.println("������� ���:");
				w.setName(scan.next());
				System.out.println("������� �������:");
				w.setSurname(scan.next());
				System.out.println("������� ����:");
				w.setGrowth(Float.parseFloat((scan.next())));
				System.out.println("������� ���:");
				w.setWeight(Float.parseFloat((scan.next())));
				}catch (IllegalArgumentException e){
					System.out.println("������ �����!");
					System.exit(1);
				}
				humans.add(w);	
				
			} else if (sx.equals("M") || sx.equals("�") || sx.equals("�") || sx.equals("�")) {
				Man m = new Man();
				try {
				m.setBasisOfSex(true);
				System.out.println("������� ���:");
				m.setName(scan.next());
				System.out.println("������� �������:");
				m.setSurname(scan.next());
				System.out.println("������� ����:");
				m.setGrowth(Float.parseFloat((scan.next())));
				System.out.println("������� ���:");
				m.setWeight(Float.parseFloat((scan.next())));
				}catch (IllegalArgumentException e){
					System.out.println("������ �����!");
					System.exit(2);
				}
				humans.add(m);	
			} else {
			System.out.println("������ �����!");
			System.exit(3);}
		}
	
}
