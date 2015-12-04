
/*
 * Да се състави програма, която въвежда от клавиатурата 7 цели числа
в едномерен масив
Програмата да изведе всички числа кратни на 5, но по големи от 5.

 
 */

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		int[] arr = new int[7];
		
		for(int i =0; i<arr.length; i++){
			System.out.println("Enter the " +(i+1) +" element: " );
			arr[i]=sc.nextInt();
			if (arr.length!=i+1){
			System.out.println((arr.length-i-1) + " to go.");
			}
		}

		for (int i = 0; i<arr.length; i++){
			if (arr[i]%5==0&&arr[i]>5){
			System.out.print(arr[i] + " ");
			count++;
			}
			
		}
		System.out.println("- " + count + " numbers");
	}

}
