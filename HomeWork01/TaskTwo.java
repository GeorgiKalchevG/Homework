//Въведете 2 различни целочислени числа от конзолата. 
//Запишете тяхната сума, разлика, произведение, остатък от деление и целочислено деление в отделни променливи и разпечатайте тези резултати в конзолата. 
//Опитайте същото с числа с плаваща запетая                                                                     
                                                                     
                                                                     
                                             
import java.util.Scanner;

public class TaskTwo{
 public static void main(String[] args)
 {
 	Scanner sc= new Scanner(System.in);
	System.out.println("Select the type of numbers you will be using - for integers enter '1' for real numbers press '2'");
	int selct = sc.nextInt();
	
	if (selct == 1){
	System.out.println("Enter two integers");

	System.out.println("Enter first integer");

	int integerOne = sc.nextInt();

	System.out.println("Enter the second integer");

	int integerTwo = sc.nextInt();
	
	int sum = integerOne + integerTwo;
	int sub = integerOne - integerTwo;
	int prod = integerOne * integerTwo;
	int div = integerOne / integerTwo;
	int reminder = integerOne % integerTwo;
	
	System.out.println( "sum = " + sum );		
	System.out.println( "sub = " + sub );
	System.out.println( "prod = " + prod);
	System.out.println( "div = " + div );
	System.out.println( "reminder = " + reminder);
	}
	
	
	if (selct == 2){
	System.out.println("Enter two Real numbers");

	System.out.println("Enter the first number");

	double numOne = sc.nextDouble();

	System.out.println("Enter the second number");

	double numTwo = sc.nextDouble();
	
	double sumf = numOne + numTwo;
	double subf = numOne - numTwo;
	double prodf = numOne * numTwo;
	double divf = numOne / numTwo;
	double divfInt = divf-divf%1;
	double reminderf = divf-divfInt;
	
	System.out.println( "/n sum = " + sumf );		
	System.out.println( "sub = " + subf );
	System.out.println( "prod = " + prodf);
	System.out.println( "div = " + divf );
	System.out.println( "divInt = " + divfInt );
	System.out.println( "reminder = " + reminderf);
	}
//I can't figure out how to fix the problem with double type approximations in some of the results
 }
 }