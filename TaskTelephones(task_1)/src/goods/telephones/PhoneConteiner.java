package goods.telephones;



public class PhoneConteiner {
	Telephones[] t=new Telephones[0];

	
	public void add(Telephones a) {
		int size=t.length;
		Telephones[] temp=new Telephones[size+1];
		System.arraycopy(t,0,temp,0,t.length);
		temp[temp.length-1]=a;
		t=new Telephones[temp.length];
		System.arraycopy(temp,0,t,0,temp.length);
				
	}
	
	public void count() {
		int allgoods=t.length;
		int home = 0, smart=0;
		for (int j = 0; j < t.length; j++) {
			if (t[j].getClass().getName().contains("HomePhone")) {
				home++;
			} else smart++;
		}
		
		System.out.println("Number of items: "+allgoods+", smartphones: "+smart+", home phones: "+home+"\n");
	}
	
	public void getByIndex(int i) {
		try {
			System.out.println("Goods number "+i+"  "+t[i]);}
			catch(ArrayIndexOutOfBoundsException e) { 
				System.out.println("This product is not available in the store: " + e);
				}
		}
	
	public void sort() {
		  for (int i = 0; i < t.length-1; i++){
		        for (int j = i+1; j < t.length; j++){
		            if (t[i].getPrice() < t[j].getPrice()) {
		                Telephones temp = t[i];
		                t[i] = t[j];
		                t[j] = temp;
		            }
		        }
		    }



		
	}
		
	}


