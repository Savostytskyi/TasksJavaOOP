package goods.telephones;

public class SmartPhone extends Telephones {

	protected String camera;
	protected String display;
	protected String operationSystem;
	protected static double counter=0;
	protected static double total=0;
	
	public SmartPhone(double price, String title, String model, String color,
			String camera, String display, String operationSystem) {
		super(price, title, model, color);
		setCamera(camera);
		setDisplay(display);
		setOperationSystem(operationSystem);
		counter++;
		total=total+getPrice();
	}
	
	

	public SmartPhone() {
		this(0.00, "unnamed", "unnamed", "undefined","unknown","unknown","unknown");
	}



	public SmartPhone(double price, String title, String model, String color) {
		super(price, title, model, color);
		// TODO Auto-generated constructor stub
	}



	public String getCamera() {
		return camera;
	}

	public void setCamera(String camera) {
		this.camera = camera;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	public void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
	}

	public static double getAvg() {
		double avg;
		avg=total/counter;
		return avg;
	}
	

	@Override
	public String toString() {
		return "SmartPhone [camera=" + camera + ", display=" + display
				+ ", operationSystem=" + operationSystem + ", price=" + price
				+ ", title=" + title + ", model=" + model + ", color=" + color
				+ "]";
	}
	
	
}
