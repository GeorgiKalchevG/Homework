/*
 * Да се състави програма, която извежда първите 10 най-малки

числа, които се делят на 2, 3 или на 5 и които са по-големи от 

въведено естествено число.

Числата се извеждат, заедно с техния пореден номер.

Входни данни: число от интервала [1..999]
 */

import java.util.Scanner;

public class task22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numb = 0;
		int i = 0;
		while (numb<1 || numb>999)
		{
			System.out.println("Enter a number");
			numb = sc.nextInt();
			
		}
		while(i<10){
			numb++;
			if (numb%2==0 || numb%3==0 || numb%5==0){
				i++;
				System.out.print(i + ":" + numb);
				if (i==10) continue;
				System.out.print(", ");
				
			}
			
		}
		

	}

}
