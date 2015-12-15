/*
 * Да се състави метод, който приема за стойност число N и връща
стойността на N! (N факториел).
 */

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to get its factorial");
		int number = sc.nextInt();
		int factorial = calculateFactRecur(number);
		System.out.println("With recursion= " + factorial);
		int factLoop = calcFactLoop(number);
		System.out.println("With loop = " + factLoop);

	}
	static int calculateFactRecur(int numb){		
	
		if (numb==1){
			return 1;
		}
				
		return numb*calculateFactRecur(numb-1);
	}
	static int calcFactLoop(int n){
		int answer = 1;
		for (int i =1; i<=n;i++){
			answer*=i;
		}
		return answer;
	}

}

