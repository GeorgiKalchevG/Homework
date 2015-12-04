/*
 * Едно число X е палиндром, aко се чете еднакво отпред назад и
отзад напред.
Да се състави програма, която проверява дали въведено число е
палиндром.
Входни данни: N - естествено число от интервала [10 .. 30000].

 */

import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isPalindrom = false;
		int d1=0;
		int d2=0;
		int numb = 1;
		int count=0;
		int check = 0;
		while(numb<10||numb>30000){
			System.out.println("Enter a number to check if it's palindrom");
			numb = sc.nextInt();
			check = numb;
		}
		do{
			check = check/10;
			count++;
		}while (check!=0);
		switch (count)
		{
			case 2:
				d1 = numb/10;
				d2 = numb%10;
				break;
			case 3:
				d1 = numb/100;
				d2 = numb%10;
				break;
			case 4 :
				d1 = numb/100;
				d2 = ((numb%100)%10)*10 + ((numb%100)/10);
				break;
			case 5:
				d1 = numb/1000;
				d2 = (numb%100)/10 + ((numb%100)%10)*10;
				break;
		}
		if (d1==d2) 
		{
			System.out.println(numb + " is palindrom");
			
		}
		else{
			System.out.println(numb + " is NOT palindrom");
		}

	}

}
