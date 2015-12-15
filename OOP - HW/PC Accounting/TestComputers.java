
public class TestComputers {

	public static void main(String[] args) {
		Computer firstComputer = new Computer();
		Computer secondComputer = new Computer();
		firstComputer.year = 2009;
		firstComputer.price = 529.95;
		firstComputer.isNotebook = false;
		firstComputer.hardDiskMemory = 500;// in GB
		firstComputer.freeMemory = 300;//in GB
		firstComputer.operationSystem = "MS Windows";
		secondComputer.year = 2011;
		secondComputer.price = 3529.95;
		secondComputer.isNotebook = true;
		secondComputer.hardDiskMemory = 1000;// in GB
		secondComputer.freeMemory = 450.8;//in GB
		secondComputer.operationSystem = "Mac OS";
		System.out.println("Before changes");

		Computer thirdComputer = new Computer(2014,2005.95,256,128,true,"Win 8.1");//int year,double price,double hardDiskMemory, double freeMemory,boolean isNotebook, String operationSystem
		Computer forthComputer = new Computer(2009,2005.95,620,320);//int year,double price,double hardDiskMemory, double freeMemory
		Computer fifthComputer = new Computer();
		printComputerSpec(firstComputer);
		printComputerSpec(secondComputer);
		printComputerSpec(thirdComputer);
		printComputerSpec(forthComputer);
		printComputerSpec(fifthComputer);
		
		System.out.println("Comparison between prices of the third and the first computer: "+thirdComputer.comparePrice(firstComputer));
		System.out.println("Comparison between prices of the third and the forth computer: "+thirdComputer.comparePrice(forthComputer));
		System.out.println("Comparison between prices of the forth and the second computer: "+forthComputer.comparePrice(secondComputer));
		System.out.println("Comparison between prices of the fifth and the second computer: "+fifthComputer.comparePrice(secondComputer));
		
		
		
	}
	static void printComputerSpec(Computer pc){
		System.out.println("Computer Specification:");
		System.out.println("Year of production: "+ pc.year);
		System.out.println("Price: $"+pc.price);
		System.out.println(pc.isNotebook?"Laptop":"PC");
		System.out.println("HDD size: "+ pc.hardDiskMemory+"GB");
		System.out.println("Free memory remaining: "+pc.freeMemory+"GB");
		System.out.println("OS: "+pc.operationSystem);
		System.out.println("----------------------------------------------------------");
	}

}
