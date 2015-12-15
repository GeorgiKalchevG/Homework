
public class Computer {
	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;
	Computer(){
		isNotebook=false;
		operationSystem ="Win XP";
	}
	Computer(int year,double price,double hardDiskMemory, double freeMemory){
		this();
		this.year=year;
		this.price=price;
		this.hardDiskMemory=hardDiskMemory;
		this.freeMemory=freeMemory;
		
	}
	Computer(int year,double price,double hardDiskMemory, double freeMemory,boolean isNotebook, String operationSystem){
		this( year, price, hardDiskMemory,  freeMemory);
		this.isNotebook = isNotebook;
		this.operationSystem = operationSystem;
		
	}
	
	int comparePrice(Computer comp){
		int result;
		if(price>comp.price){
			result = -1;
			
		}
		else
			{
				if(price<comp.price){
					result = 1;
				}
				else{
					result=0;
				}
			}
		return result;
	}
	void changeOperationSystem(String newOperationSystem){
		operationSystem = newOperationSystem;
	}
	void useMemory(double memory){
		if(freeMemory+memory<=hardDiskMemory){
			freeMemory -=memory; 
		}
		else{
			System.out.println("Not enough free memory!");
		}
	}
	
	
}
