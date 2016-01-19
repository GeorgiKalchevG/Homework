
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Driver {
	private String name;
	private Vehicles[] avtomobili;
	private double money;
	private GasStation gasStation;
	
	
	
	/**
	 * @param name
	 * @param avtomobili
	 * @param money
	 * @param gasStation
	 */
	public Driver(String name,  double money, GasStation gasStation) {
		super();
		this.name = name;
		this.avtomobili = new Vehicles[10];
		this.money = money;
		this.gasStation = gasStation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Vehicles[] getAvtomobili() {
		return avtomobili;
	}
	public void setAvtomobili(Vehicles[] avtomobili) {
		this.avtomobili = avtomobili;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public GasStation getGasStation() {
		return gasStation;
	}
	public void setGasStation(GasStation gasStation) {
		this.gasStation = gasStation;
	}
	public void buyVinetkaForAll(Vehicles[] avtomobili){
		Random rnd = new Random();
		
		for(int i = 0;i<avtomobili.length;i++){
			int rand = rnd.nextInt(3);
			avtomobili[i].setVin(gasStation.sellVinetka(avtomobili[i],rand));
			money = money- avtomobili[i].getVin().getPrice();
			System.out.println("kupih vinetka "+(i+1)+ " cena "+ avtomobili[i].getVin().getPrice());
		}
		
	}
	public Vinetka buyVinetka(Vehicles vehicle,int type){
	
		
		Vinetka vin   = gasStation.sellVinetka(vehicle,type);
		System.out.println("na cena "+vin.getPrice());
		money= money-vin.getPrice();
		System.out.println("kupih vinetka samo za 1 avtomobil");
		System.out.println("na cena "+vin.getPrice());
		return vin;
		
	}
	
	public Vehicles[] vinetkiExpired(LocalDate date){
		Vehicles[] vehiclesExpiredVinetki = new Vehicles[10];
		int place = 0;
		for(int i = 0;i<avtomobili.length;i++){
				if(date.isAfter(avtomobili[i].getVin().getDate().plus(avtomobili[i].getVin().getExpirationDate()))){
					System.out.println(avtomobili[i].getModel()+" vinetka's expired!!!");
					
					vehiclesExpiredVinetki[place]=avtomobili[i];
					place++;
				}
				
			}
		
		return vehiclesExpiredVinetki;
		
	}
	public void printInfo(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Money left"+money);
		System.out.println("Vehicles available"+avtomobili.length);
		System.out.println("Enter date ");
		System.out.println("Enter year ");
		int year =sc.nextInt();
		System.out.println("Enter month ");
		int month =sc.nextInt();
		System.out.println("Enter day ");
		int day =sc.nextInt();
		LocalDate myDate =  LocalDate.of(year	, month, day);
		
		System.out.println("Vehicles without vinetka"+vinetkiExpired(myDate).length);
		
		
	}
}
