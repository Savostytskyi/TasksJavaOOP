package appliances.small;

import appliances.Appliances;


public class SmallAppliances extends Appliances {
	
	protected String mode;
	protected int amperage;
	

	

	public SmallAppliances(int voltage, boolean connection, String type,
			String trademark, String mode, int amperage) {
		super(voltage, connection, type, trademark);
		setMode(mode);
		setAmperage(amperage);
	}


	public String getMode() {
		return mode;
	}


	public void setMode(String mode) {
		this.mode = mode;
	}



	public int getAmperage() {
		return amperage;
	}



	public void setAmperage(int amperage) {
		this.amperage = amperage;
	}




	@Override
	public void pluggedIn() {
		if (super.connection==false) {
			super.connection=true;
			System.out.println("Appliance "+super.getType()+ ", brands "+super.getTrademark()+ " turned on!!!");
		}	else {
			super.connection=false;
			System.out.println("Appliance "+super.getType()+ ", brands "+super.getTrademark()+ " turned off!!!");
		}
	}



	@Override
	public int calculatePower() {
		int power;		
				switch (getMode()) {
			    case "avarage":  
			    	power=getAmperage()*super.getVoltage();
			             break;
			    case "minimum": 
			    	power=(getAmperage()*super.getVoltage())/2;
			             break;
			    case "maximum": 
			    	power=(getAmperage()*super.getVoltage())*2;
			             break;
			    default: power=getAmperage()*super.getVoltage();
			             break;
			}
				return power;
		
	}
	
	public void inRange(int a, int b) {
		if ((this.getAmperage()>=a) && (this.getAmperage()<=b)) {
			System.out.println("Appliance "+super.getType()+ ", brands "+super.getTrademark()+ " amperage: "+this.getAmperage());
		}
		
	}


}