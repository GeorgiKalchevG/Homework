import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		GasStation gas = new GasStation("shell");
		Driver[] shofiori = new Driver[20];
		String[] imena = {"sasho","gosho","misho","aver","nikolcho","haralampi"};
		Random r = new Random();
		int razdavane = 0;
		int selectCar = 0;
		int selecType = 0;
		for (int i = 0; i<shofiori.length;i++){
			int rnd = r.nextInt(6);
			shofiori[i]=new Driver(imena[rnd], 4000, gas);
				
			}
		
		Vehicles[] vehicles = new Vehicles[200];
		for(int i = 0; i<vehicles.length;i++){
			int rnd = r.nextInt(3);
			int yearOfProduction = r.nextInt(10)+2005;
			int name = r.nextInt(1000);
			if(rnd==0){
				vehicles[i] = new Car(name+"gti", yearOfProduction);
			}
			if(rnd==1){
				vehicles[i] = new Bus(name+"bus", yearOfProduction);
			}
			if(rnd==2){
				vehicles[i] = new Lorry(name+"Kamion", yearOfProduction);
			}
			
		}
		
		for (int i = 0;i<shofiori.length;i++){
			Vehicles[] razdavamKoli = new Vehicles[10];
			for(int j = 0; j<shofiori[i].getAvtomobili().length;j++){
				razdavamKoli[j]=vehicles[razdavane];
				razdavane++;
				
			}
			shofiori[i].setAvtomobili(razdavamKoli);
		}
		for(int i = 0;i<shofiori.length;i++){
			if(i%3==0){
				selectCar = r.nextInt(10);
				selecType = r.nextInt(3);
				shofiori[i].getAvtomobili()[selectCar].setVin(shofiori[i].buyVinetka(shofiori[i].getAvtomobili()[selectCar], selecType));
				selectCar = r.nextInt(10);
				selecType = r.nextInt(3);
				shofiori[i].getAvtomobili()[selectCar].setVin(shofiori[i].buyVinetka(shofiori[i].getAvtomobili()[selectCar], selecType));
				selectCar = r.nextInt(10);
				selecType = r.nextInt(3);
				shofiori[i].getAvtomobili()[selectCar].setVin(shofiori[i].buyVinetka(shofiori[i].getAvtomobili()[selectCar], selecType));
				selectCar = r.nextInt(10);
				selecType = r.nextInt(3);
				shofiori[i].getAvtomobili()[selectCar].setVin(shofiori[i].buyVinetka(shofiori[i].getAvtomobili()[selectCar], selecType));
				selectCar = r.nextInt(10);
				selecType = r.nextInt(3);
				shofiori[i].getAvtomobili()[selectCar].setVin(shofiori[i].buyVinetka(shofiori[i].getAvtomobili()[selectCar], selecType));
			}
			else{
				shofiori[i].buyVinetkaForAll(shofiori[i].getAvtomobili());
			}
		}
		
		shofiori[4].printInfo();

		
		Vehicles[] kamioni = new Vehicles[200];
		int count = 0;
		for(int i = 0;i<shofiori.length;i++){
			for(int j =0;j<shofiori[i].getAvtomobili().length;j++){
				if(shofiori[i].getAvtomobili()[j] instanceof Lorry){
					kamioni[count++] = shofiori[i].getAvtomobili()[j];
					
				}
				
			}
		}
		System.out.println(count++);
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date ");
		System.out.println("Enter year ");
		int year =sc.nextInt();
		System.out.println("Enter month ");
		int month =sc.nextInt();
		System.out.println("Enter day ");
		int day =sc.nextInt();
		LocalDate adate =  LocalDate.of(year, month, day);
		for(int i = 0;i<count;i++){
			if(kamioni[i]!=null){
				if(kamioni[i].getVin().getExpirationDate()!=null){
					if(adate.isAfter(kamioni[i].getVin().getDate().plus(kamioni[i].getVin().getExpirationDate()))){
						System.out.println(kamioni[i].getModel());
					}
				}
					else{
						System.out.println(kamioni[i].getModel()+ " doesnt have vinetka at all");
					}
			}
			

			
		
		
		} 
	
	}
}
