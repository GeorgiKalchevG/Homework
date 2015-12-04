import java.util.Scanner;

/*
 * «адача 1:
ƒа се прочете масив и да се намери най-малкото число кратно на
3 от масива.

 */
public class Task01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size=0;
		int answer;
		
		while (size < 1){
			System.out.println("Select the size of the array(must be a positive number)");
			size = sc.nextInt();
			
		}
		int[] arr = new int[size];
		
		System.out.println("Fill the array");
		for (int i = 0; i<size; i++){
			System.out.println((i+1) + " element");
			arr[i] = sc.nextInt();
		}
		
		answer = arr[arr.length-1];
		for (int i = 0; i<arr.length; i++){
			if (arr[i]<=answer && arr[i]%3==0){
				answer=arr[i];
			}
		}
	
		if (answer%3==0){	
		System.out.println("The smalles divisible by 3 number is " + answer);
		}
		else {
			System.out.println("There isn't a number divisible by 3");
		}
		

	}

}
