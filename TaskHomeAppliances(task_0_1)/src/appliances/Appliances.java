package appliances;

public abstract class Appliances {
	
	public int voltage;
	public boolean connection;
	protected String type;
	protected String trademark;
	
	
	public abstract void pluggedIn();
	
	public abstract int calculatePower();
	
	public abstract void inRange(int a, int b);


	public Appliances(int voltage, boolean connection, String type,
			String trademark) {

		setVoltage(voltage);
		setConnection(connection);
		setType(type);
		setTrademark(trademark);
	
	}


	public int getVoltage() {
		return voltage;
	}


	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}


	public boolean isConnection() {
		return connection;
	}


	public void setConnection(boolean connection) {
		this.connection = connection;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getTrademark() {
		return trademark;
	}


	public void setTrademark(String trademark) {
		this.trademark = trademark;
	}


	
	

}
