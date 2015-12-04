//Съставете програма, която по дадено трицифренo число проверява дали числото се дели на всяка своя цифра. 
//Във въведеното число да няма цифра 0



import java.util.Scanner;

public class TaskEleven {

	public static void main(String[] args) {
		
		
		int number;
		int d1;
		int d2;
		int d3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("This program will check if the three digit number you have entered can be devided by each of its digits. (Non of the digits can be 0!)");
		System.out.println("Enter the number.");
		
		number = sc.nextInt();
		
		while (111>number || number>999) {
			
			System.out.println("The number you have entere does not match the criteria, enter another number!");
			number = sc.nextInt();
			
		}
		
		d1 = number/100;
		d2 = (number - d1*100)/10;
		d3 = number - d1*100 - d2*10;
		
		while (d1==0 || d2==0 || d3==0 || 111>number || number>999) {
			System.out.println("One or more of the digits is equal to zero or is not a three digit number, enter another number");
			number = sc.nextInt();
			

			d1 = number/100;
			d2 = (number - d1)/10;
			d3 = number - d1*100 - d2*10;
		}
		
		if (((number % d1) == 0) && ((number % d2) == 0) && ((number % d3) == 0)) {
			System.out.println("the number you have entered can be devided by each of its digits");
			
		}
		else {
			System.out.println("the number you have entered cannot be devided by each of its digits");
		}
	}

}
