package appliances;

import java.util.Arrays;

import appliances.major.MajorAppliances;
import appliances.small.SmallAppliances;

public class AppliancesRuner {

	public static void main(String[] args) {
		int totalPower=0,i=0;

		
		Appliances[] app = { 
			new  SmallAppliances(12, false, "kettle", "Bosch", "average", 12),
			new  MajorAppliances(12, false, "refrigerator", "Vitek", 150, 2, 12), 
			new  SmallAppliances(30, false, "toaster", "Moulinex", "average", 15), 
			new  MajorAppliances(15, false, "stove", "Scarlett", 100, 1, 10), 
			new  SmallAppliances(12, false, "fan", "Kerher", "average", 20), 
			new  MajorAppliances(10, false, "washer", "Vitek", 200, 2, 15), 
			new  SmallAppliances(12, true, "floor lamp", "Maximus", "average", 20), 
			new  MajorAppliances(35, false, "dishwasher", "Scarlett", 110, 1, 10)};

		
		String sorted[]= new String[app.length];	
			app[0].pluggedIn();
			app[1].pluggedIn();
			app[2].pluggedIn();
			app[3].pluggedIn();

		for (Appliances appliances : app) {			
			sorted[i]=Integer.toString(appliances.calculatePower())+ " "+appliances.getType();
			i++;
				if (appliances.connection) {
					totalPower=totalPower+appliances.calculatePower();				
			}
		}
		
		
		System.out.println("Total power: "+totalPower+" W");		
		 	for (int n = 0; n < sorted.length-1; n++){
		        for (int m = n+1; m < sorted.length; m++){		        	
		        	String[] arr = sorted[n].split(" ");
		        	String[] brr = sorted[m].split(" ");	        	
		            if (Integer.parseInt(arr[0]) < Integer.parseInt(brr[0])) {
		                String t = sorted[n];
		                sorted[n] = sorted[m];
		                sorted[m] = t;
		            }
		        }
		    }
		
		System.out.println("All appliances in flat, sorted by power: "+ Arrays.toString(sorted));
		System.out.println();
		System.out.println("Devices in the specified range of current:");
		
		
			for (Appliances appliances : app) {
					appliances.inRange(100, 200);
				}
	}
}
