package goods.telephones;

public abstract class Telephones {
	protected double price;
	protected String title;
	protected String model;
	protected String color;
	
	
	
	public Telephones(double price, String title, String model, String color) {
		setPrice(price);
		setTitle(title);
		setModel(model);
		setColor(color);
		
	
	}
	
	
	public Telephones() {
		this(0.00, "unnamed", "unnamed", "undefined");
	}




	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Telephones [price=" + price + ", title=" + title + ", model="
				+ model + ", color=" + color + "]";
	}
	
	
}
