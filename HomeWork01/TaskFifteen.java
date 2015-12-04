//Да се състави програма, която въвежда естествено число от интервала [0..24].
//Програмата да изведе съответстващо съобщение съобразно въведения час.
//Периодите са: [18..4] - Добър вечер; [4..9] - Добро утро; [9..18] - Добър ден

import java.util.Scanner;  
public class TaskFifteen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour;
		System.out.println("Enter a number [0:24]");
		hour = sc.nextInt();
		
		while (hour<0 || hour>24) {
			System.out.println("Out of range enter a new number [0:24]");
			hour = sc.nextInt();
		}
		
		if (hour>=18 && hour<=24 || hour >=0 && hour<=4 ) {
			System.out.println("Good evening");
			
		}
		else {
			if (hour >4 && hour<=9) {
				System.out.println("Good morning");
			}
			else{
				System.out.println("Good afternoon");
			}
		}

	}

}
