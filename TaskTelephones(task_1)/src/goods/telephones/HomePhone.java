package goods.telephones;

public class HomePhone extends Telephones {

	protected String telephoneWireSocet;
	protected String numButtonsType;
	protected static double counter=0;
	protected static double total=0;
	
	public HomePhone(double price, String title, String model, String color,
			String telephoneWireSocet, String numButtonsType) {
		super(price, title, model, color);
		setTelephoneWireSocet(telephoneWireSocet);
		setNumButtonsType(numButtonsType);
		counter++;
		total=total+getPrice();
	}
	


	public HomePhone(){
		this(0.00, "unnamed", "unnamed", "undefined","unknown","unknown");
	}



	public String getTelephoneWireSocet() {
		return telephoneWireSocet;
	}


	public void setTelephoneWireSocet(String telephoneWireSocet) {
		this.telephoneWireSocet = telephoneWireSocet;
	}


	public String getNumButtonsType() {
		return numButtonsType;
	}


	public void setNumButtonsType(String numButtonsType) {
		this.numButtonsType = numButtonsType;
	}

	public static double getAvg() {
		double avg;
		avg=total/counter;
		return avg;
	}
	

	@Override
	public String toString() {
		return "HomePhone [telephoneWireSocet=" + telephoneWireSocet
				+ ", numButtonsType=" + numButtonsType + ", price=" + price
				+ ", title=" + title + ", model=" + model + ", color=" + color
				+ "]";
	}
	
	
}
