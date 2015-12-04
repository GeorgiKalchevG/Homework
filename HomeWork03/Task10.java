import java.util.Scanner;

/*
 * Да се състави програма, чрез която се въвеждат 7 цели числа в
едномерен масив.
Програмата да изведе числото, което е най-близко до средната
стойност на въведените числа.
Пример: 1,2,3,4,5,6,7
Изход: средна стойност 4, най-близка стойност 4

 */
public class Task10 {

	public static void main(String[] args) {
		double sum=0;
		double average=0;
		double smallest;
		int value = 0;
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[7];
		for (int i = 0 ; i<arr.length;i++){
			System.out.println("Enter the " + (i+1) + " element");
			arr[i]= sc.nextInt();
			
		}
		
		for (int i =0; i<arr.length;i++){
			sum=arr[i]+sum;
		}
		average = sum/arr.length;
		System.out.println("The average is " + average);
		
		double[] arr1 = new double[arr.length];
		
		for (int i = 0; i<arr1.length;i++){
			if(average<=arr[i]){
				arr1[i]=arr[i]-average;
			}
			else{
				arr1[i]=average-arr[i];
			}
			
		}
		smallest = arr1[arr1.length-1];
		
		for (int i = 0; i<arr1.length;i++){
			if (smallest>=arr1[i]){
				smallest=arr1[i];
				value=i;
			}
		}
		
		System.out.println("The closest value is "+ (arr[value]));
		

	}

}