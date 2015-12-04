
/*
 * Една редица от естествени числа ще наричаме зигзагообразна нагоре,
ако за елементите и са изпълняват условията:
N1 < N2 > N3 < N4 > N5 <..
Съставете програма, която проверява дали въведени в едномерен
масив редица от числа изпълняват горните изисквания.
Пример: 1 3 2 4 3 7
Изход: изпълнява изискванията за зигзагообразна нагоре редица

 */

import java.util.Scanner;
public class Task17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 0;
		boolean check = false;
		while (size<3){
			System.out.println("Enter the size of the array/must be atleast 3/");
			size = sc.nextInt();
			
		}
		
		int[] arr = new int[size];
		for (int i=0; i<arr.length; i++){
			
			System.out.println("Enter the " + (i+1) + " element");
			arr[i]=sc.nextInt();
			if(i!=arr.length-1){
				System.out.println((arr.length-1-i)+ " remaining");
			}
		}
		for (int i = 1; i<arr.length; i++){
			
			if (
				(arr[i-1]<arr[i]&&arr[i]>arr[i+1])
				||
			    (arr[i-1]>arr[i]&&arr[i]<arr[i+1])
			   )
				check = true;
			else 
				check = false;
				
			if (i==arr.length-2){
				break;
			}
				
			
		}
		for (int i = 0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		if (check){
			System.out.println("Zig-Zag");
		}
		else
			System.out.println("Not Zig-Zag");

	}

}
