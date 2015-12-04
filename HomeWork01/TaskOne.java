//Да се изведат съобщения към потребителя и да се прочетат 2 числа от клавиатурата A и B (може да са с плаваща запетая – double). 
//После да се прочете 3-то число C и да се провери дали то е м/у A и B. 
//Да се изведе подходящо съобщение за това дали C е между A и B.

import java.util.Scanner;

public class TaskOne {

	public static void main(String[] args) {
		
		double first;
		double second;
		double third;
		
		System.out.println("Enter three numbers and check if the third is between the first two");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fist number");
		first=sc.nextDouble();
		
		System.out.println("Enter the second number");
		second=sc.nextDouble();
		
		System.out.println("Enter the third number");
		third=sc.nextDouble();
		
		if ((first == second) || (first == third) || (second == third) )		System.out.println("Two or three of the nubmers are equal");
		
		else
		{
		if (first>second){
			if ((first>third) && (third>second)){
				System.out.println("Number " + third + " is between " + second + " and " + first);
				
			}
		}
		if ((second>first)&&(second>third && third>first)){
			System.out.println("Number " + third + " is between " + first + " and " + second);
			
		}
		
		else {
			System.out.println(third + " is not between " + first + " and " + second);
		}
		}

		
	}

}
