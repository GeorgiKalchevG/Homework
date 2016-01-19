import java.time.Period;

import java.util.Random;

public class GasStation {
	Period week = Period.ofWeeks(1);
	Period month = Period.ofMonths(1);
	Period year = Period.ofYears(1);

	
	String name;
	Vinetka[] vins;
	double turnOver;
	
	
	public Vinetka[] createVinetki(){
		Vinetka[] vinetki = new Vinetka[10000];
		Random rand = new Random();
				
		for (int i =0; i<vinetki.length;i++){
			int vechilceType = rand.nextInt(3);
			int validity = rand.nextInt(3);
			
			switch(vechilceType){
			case 0:
				if(validity ==1){
					vinetki[i] = new Vinetka("Black", week, "car", 5, 5);
					
					
				}
				else{
					if(validity ==2){
						vinetki[i] = new Vinetka("Black", month, "car", 5*10, 5);
					}
					else{
						vinetki[i] = new Vinetka("Black",year, "car", 5*60, 5);
					}
				}
				break;
			case 1:
				if(validity ==1){
					vinetki[i] = new Vinetka("Yellow", week, "lorry", 7, 10);
				}
				else{
					if(validity ==2){
						vinetki[i] = new Vinetka("Yellow", month, "lorry", 7*10, 10);
					}
					else{
						vinetki[i] = new Vinetka("Yellow", year, "lorry",7*10*6, 10);
					}
				}
				break;
			case 2:
				if(validity ==1){
					vinetki[i] = new Vinetka("Red", week, "bus", 9, 20);
				}
				else{
					if(validity ==2){
						vinetki[i] = new Vinetka("Red", month, "bus",  9*10, 20);
					}
					else{
						vinetki[i] = new Vinetka("Red",year, "bus", 9*10*6, 20);
					}
				}
				break;
			}
			
		}
		bubbleSort(vinetki);
		return vinetki;
	}
	/**
	 * @param name
	
	 */
	public GasStation(String name) {

		this.name = name;
		this.vins = createVinetki();
		this.turnOver = 0;
		this.printVinetki();
	}
	public void printVinetki() {
		int id = 1;
		for (int i = 0;i<vins.length;i++){
			if(vins[i]!=null){
				System.out.println("Price :"+ vins[i].getPrice());
				System.out.println("Colour :"+ vins[i].getColour());
				System.out.println("Type :"+ vins[i].getType());
				System.out.println("Expiration date " + vins[i].getDate().plus(vins[i].getExpirationDate()));
				System.out.println("ID "+ id++);
				System.out.println("---------------------------");
			
			}
			
			
		}
		
	}
	/**
	 *  @param Vehicles
	 * @param type
	 */
	public Vinetka sellVinetka(Vehicles vehicle, int type){
		
		if(vehicle instanceof Car){
			for(int i = 0;i<vins.length;i++){
				if(vins[i]!=null){
					if(type==0){
						System.out.println("type "+type);
						if(vins[i].getExpirationDate().equals(week)){
							Vinetka vinetka = vins[i];
							turnOver +=vinetka.getPrice();
							System.out.println(vinetka.getPrice());
							 vins[i]=null;
							 return vinetka;
							
						}
						
					}if(type==1){
						if(vins[i].getExpirationDate().equals(month)){
							Vinetka vinetka= vins[i];
							System.out.println(vinetka.getPrice());
							turnOver +=vinetka.getPrice();
							 vins[i]=null;
							 return vinetka;
						
						}
						
					}if(type==2){
						if(vins[i].getExpirationDate().equals(year)){
							Vinetka vinetka = vins[i];
							turnOver +=vinetka.getPrice();
							System.out.println(vinetka.getPrice());
							 vins[i]=null;
							 return vinetka;
						
						}
					}	
				}
			}
		}
		if(vehicle instanceof Bus){
			for(int i = 0;i<vins.length;i++){
				if(vins[i]!=null){
					
					if(type==0){
						if(vins[i].getExpirationDate().equals(week)){
							Vinetka vinetka = vins[i];
							turnOver +=vinetka.getPrice();
							 vins[i]=null;
							 return vinetka;
						
						}
						
					}if(type==1){
						if(vins[i].getExpirationDate().equals(month)){
							Vinetka vinetka = vins[i];
							turnOver +=vinetka.getPrice();
							 vins[i]=null;
							 return vinetka;
							
						}
						
					}if(type==2){
						if(vins[i].getExpirationDate().equals(year)){
							Vinetka vinetka = vins[i];
							turnOver +=vinetka.getPrice();
							 vins[i]=null;
							 return vinetka;
						
						}
						
					}	 
				}	
			}
		}
		if(vehicle instanceof Lorry){
			for(int i = 0;i<vins.length;i++){
				

				if(vins[i]!=null){
					if(type==0){
						if(vins[i].getExpirationDate().equals(week)){
							Vinetka vinetka = vins[i];
							turnOver +=vinetka.getPrice();
							
							 vins[i]=null;
							 return vinetka;
					
						}
						
					}if(type==1){
						if(vins[i].getExpirationDate().equals(month)){
							Vinetka vinetka = vins[i];
							turnOver +=vinetka.getPrice();
						
							 vins[i]=null;
							 return vinetka;
						
						}
						
					}if(type==2){
						if(vins[i].getExpirationDate().equals(year)){
							Vinetka vinetka = vins[i];
							turnOver +=vinetka.getPrice();
							
							 vins[i]=null;
							 System.out.println(vinetka.getPrice());
							 return vinetka;
							
						}
						
					}	 
				}	
			}
		}
		return new Vinetka();
	}
	public void bubbleSort(Vinetka[] vinetki) {
	    boolean swapped = true;
	    int j = 0;
	    Vinetka tmp;
	    while (swapped) {
	        swapped = false;
	        j++;
	        for (int i = 0; i < vinetki.length - j; i++) {
	            if (vinetki[i].getPrice() > vinetki[i + 1].getPrice()) {
	                tmp = vinetki[i];
	                vinetki[i] = vinetki[i + 1];
	                vinetki[i + 1] = tmp;
	                swapped = true;
	            }
	        }
	    }
	}

	
}
