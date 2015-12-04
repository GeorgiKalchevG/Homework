
/*
 * Напишете програма, в която потребителя въвежда масив, след което
елементите на масива се обръщат в обратен ред (Целта не е масива да
се отпечата в обратен ред, ами първо да се обърне, след което да се
отпечата в нормален ред). Пробвайте да решите задачата първо с един
допълнителен масив и после без да използвате друг масив.
 */

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = 0;
		while (size<1){
			System.out.println("Enter the size of the array;");
			size = sc.nextInt();
			
		}
		int[] arrForwards = new int[size];
		for (int i = 0; i<arrForwards.length;i++){
			System.out.println("Enter " +(1+i)+ " element:");
			arrForwards[i] = sc.nextInt();
		}
		
		
//		with 2 arrays
		int[] arrBackwards = new int[arrForwards.length];
		for (int i = 0; i<arrBackwards.length; i++){
			arrBackwards[i]=arrForwards[arrForwards.length - i - 1];
		}
		
		System.out.println("With two arrays");
		for (int i = 0; i<arrBackwards.length;i++){
			System.out.print(arrBackwards[i] + " ");
		}
//		with one array
		for (int i = 0; i<(arrForwards.length)/2;i++){
			int temp=0;
			
			temp=arrForwards[i];
			arrForwards[i]=arrForwards[arrForwards.length-i-1];
			arrForwards[arrForwards.length-i-1]=temp;
		}
		System.out.println();
		System.out.println("With One Array");
		
		for (int i = 0; i<arrForwards.length;i++){
			System.out.print(arrForwards[i] + " ");
		}
		

	}

}
