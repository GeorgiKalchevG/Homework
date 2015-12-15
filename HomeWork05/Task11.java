import java.util.Scanner;

/*
 * Да се създаде метод, който отпечатва масив в конзолата.

 */
public class Task11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = 0;
		while(size<1){
			System.out.println("Enter the size of the array");
			size = sc.nextInt();
		}
		int[] arr = new int[size];
	
		System.out.println("Fill the array");
		for(int i = 0; i <arr.length;i++){
			System.out.println("Enter the "+(i+1)+" element");
			arr[i]=sc.nextInt();
			System.out.println((arr.length-i-1)+" remain");
		}
		int[] arr1 = {5,8,6,5,5,3,6,1,4,5,5,8,3};
		printArray(arr);
		printArray(arr1);

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
