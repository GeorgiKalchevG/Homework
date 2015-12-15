import java.util.Scanner;

/*
 * Да се създаде метод, който приема за входни данни число N и
връща масив от числа с дължина N, който съдържа всички числа
от 1 до N.
 */
public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int size  = sc.nextInt();
		int[] arr = buildArray(size);
		printArray(arr);
		

	}
	static int[] buildArray(int size){
		int[] arr = new int[size];
		for (int i=0;i<arr.length;i++){
			
			arr[i] = i+1;
		}
		
		return arr;
		
	}
	static void printArray(int[] array){
		for(int i =0;i<array.length;i++){
			if (i==0){
				System.out.print("["+array[i]+", ");
				
			}else{
				if(i==array.length-1){
					System.out.print(array[i]+"]");
				}
				else{
					System.out.print(array[i] + ", ");
				}
			
			}
		}
		System.out.println();
	}

}
