
public class Cars {

	private	String make;
	private	String model;
	private	int year;
	private	double price;
	
	public Cars(String enterMake, String enterModel, int enterYear, double enterPrice) {
		
		make = enterMake;
		model = enterModel;
		year = enterYear;
		price = enterPrice;
	}
	public Cars() { 
		make = "";
		model = "";
		year = 0;
		price = 0.0;
		
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return String.format("%-20s %-20s %-20s %s-20 %s-20 %20.2f \n",  make, model, year,  "---",  "$", price);
	}

	
}
