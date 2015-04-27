package appliances.major;

import appliances.Appliances;

public class MajorAppliances extends Appliances {

	protected int amperage;
	protected int internalConsumers;
	protected int internalConsumersAmperage;


	public MajorAppliances(int voltage, boolean connection, String type,
			String trademark, int amperage, int internalConsumers,
			int internalConsumersAmperage) {
		super(voltage, connection, type, trademark);
		setAmperage(amperage);
		setInternalConsumers(internalConsumers);
		setInternalConsumersAmperage(internalConsumersAmperage);
	}






	public int getAmperage() {
		return amperage;
	}




	public void setAmperage(int amperage) {
		this.amperage = amperage;
	}



	public int getInternalConsumers() {
		return internalConsumers;
	}



	public void setInternalConsumers(int internalConsumers) {
		this.internalConsumers = internalConsumers;
	}



	public int getInternalConsumersAmperage() {
		return internalConsumersAmperage;
	}



	public void setInternalConsumersAmperage(int internalConsumersAmperage) {
		this.internalConsumersAmperage = internalConsumersAmperage;
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
		int power, internalCons;
		internalCons=getInternalConsumersAmperage()*getInternalConsumers();
	    	power=getAmperage()*super.getVoltage()+internalCons;
	    	
		return power;
	}
	
	public void inRange(int a, int b) {
		if ((this.getAmperage()>=a) && (this.getAmperage()<=b)) {
			System.out.println("Appliance "+super.getType()+ ", brands "+super.getTrademark()+ " amperage: "+this.getAmperage());
		}
		
	}


}


 
