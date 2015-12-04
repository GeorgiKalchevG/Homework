/*Да се състави програма, чрез която се въвеждат 2 естествени
числа N, M от интервала [10..5555].
Програмата, чрез цикъл for, да извежда всички числа от
интервала, които са кратни на 50 в низходящ ред.*
 * 
 */

import java.util.Scanner;

public class Task16 {
	public static void main(String[] args) {
		
		
		int n1=0;
		int n2=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers between 10 and 5555");
		while(n1<10 || n1>5555 ) {
			System.out.println("Enter the first number");
			n1 = sc.nextInt();
		}
		while(n2<10 || n2>5555){
			System.out.println("Enter the second number");
			n2 = sc.nextInt();
		}
		if (n1>n2){
			int temp=n1;
			n1=n2;
			n2=temp;
		}
		for (int i = n2; i>=n1; i--){
			if (i%50==0) {
				System.out.println(i + " ");
			}
		}
	}

}
