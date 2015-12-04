//Въведете 2 различни числа от конзолата и разменете стойността им. Разпечатайте новите стойности                                                                     
                                                                     
                                                                     
                                             
import java.util.Scanner;

public class TaskThree{
	 public static void main(String[] args)
	 
	 {
	 	
		
	 	Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		System.out.println("Enter the first number");
		double first = sc.nextDouble();
		System.out.println("Enter the second number");
		double second = sc.nextDouble();
		
		
		double tmp=first;
	

	
		
		first = second;
		second = tmp;
		
		System.out.println("The integers in reverse are: "+ first + "	"  + second);
		 
	 
	 }
}	 
 