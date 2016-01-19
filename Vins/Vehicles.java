
public class Vehicles {
	private String model;
	private Vinetka vin;
	private int yearOfProduction;
	public String getModel() {
		return model;
	}
	public Vinetka getVin() {
		return vin;
	}
	public void setVin(Vinetka vin) {
		this.vin = vin;
	}
	/**
	 * @param model
	 * @param vin
	 * @param yearOfProduction
	 */
	public Vehicles(String model, int yearOfProduction) {

		this.model = model;
		this.yearOfProduction = yearOfProduction;
		this.vin = new Vinetka();
	}
	
	

}
