//Въведете 2 различни числа от конзолата и ги разпечатайте в нарастващ ред

import java.util.Scanner;

public class TaskFour {

	public static void main(String[] args) {
		
		double first;
		double second;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two different numbers to be sorted in increasing order.");
		System.out.println("The first number is: ");
		first = sc.nextDouble();
		System.out.println("The second number is:  ");
		second = sc.nextDouble();
		
		while (first == second)					
		{
			System.out.println("The numbers are the same, try again.");
			System.out.println("The first number is: ");
			first = sc.nextDouble();
			System.out.println("The second number is:  ");
			second = sc.nextDouble();
		}
		
		if (first<second){
			System.out.println("Sorted; " + first + " " + second);
		}
		if (first>second){
			System.out.println("Sorted: " + second + " " + first);
		}
		
		
	}

}
