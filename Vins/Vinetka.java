import java.time.LocalDate;
import java.time.Period;

public class Vinetka {
	private LocalDate date = LocalDate.now();; 
	private String colour;
	private Period expirationDate;
	private String type;
	private int price;
	private int placeVinetka;
	
	
	public Vinetka() {
		
	}

	public String getColour() {
		return colour;
	}

	public Period getExpirationDate() {
		return expirationDate;
	}

	public int getPlaceVinetka() {
		return placeVinetka;
	}
	
	/**
	 * @param date
	 * @param colour
	 * @param expirationDate
	 * @param type
	 * @param price
	 * @param placeVinetka
	 */
	public Vinetka( String colour,Period expirationDate, String type, int price, int placeVinetka) {
	
		this.colour = colour;
		this.expirationDate = expirationDate;
		this.type = type;
		this.price = price;
		this.placeVinetka = placeVinetka;
	}

	public LocalDate getDate() {
		return date;
	}
//
//	public void setDate(LocalDate date) {
//		this.date = date;
//	}

	public int getPrice() {
		return price;
	}

	public String getType() {
		return type;
	}

	/**
	 * 
	 */
	
	
	
	

}
