//Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ ред.

import java.util.Scanner; 

public class TaskFive {

	public static void main(String[] args) {
		
		double first;
		double second;
		double third;
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter three different numbers to be sorted in declining order");
		System.out.println("First number: ");
		first = sc.nextDouble();
		System.out.println("Second number: ");
		second = sc.nextDouble();
		System.out.println("Third number: ");
		third = sc.nextDouble();
		
		while ((first==second)||(first == third)||(second==third)) {
				System.out.println("Two or three of the numbers are equal! Enter new numbers");
				System.out.println("First number: ");
				first = sc.nextDouble();
				System.out.println("Second number: ");
				second = sc.nextDouble();
				System.out.println("Third number: ");
				third = sc.nextDouble();
		}
		
		if ((first>second) && (second>third)){
			System.out.println("In declining order the numbers are: " + first + ", " + second + ", " + third );
			
		}
		
		if ((third>second) && (second>first)) {
			
			System.out.println("In declining order the numbers are: " + third + ", " + second + ", " + first );
			
		}
		if ((third > second) && (first > third)) {
			System.out.println("In declining order the numbers are: " + first + ", " + third + ", " + second);
		}
		if ((first > second) && (third > first)){
			System.out.println("In declining order the numbers are: " + third + ", " + first + ", " + second);
			
		}
		if ((second > first) && (first > third)){
			System.out.println("In declining order the numbers are: " + second + ", " + first + ", " + third);
			
		}
		if ((second > third) && (third > first)) {
			System.out.println("In declining order the numbers are: " + second + ", " + third + ", " + first);
			
		}
		

	}

}
