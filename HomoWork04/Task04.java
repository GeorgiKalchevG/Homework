import java.util.Scanner;

/*
 * Имате предварително въведени стойности на елементи в двумерен
масив - естествени числа.
Да се състави програма, чрез която се извеждат стойностите на
елементите в двумерен масив след обръщането му на +90 градуса.
Пример:
1,2,3,4
5,6,7,8
9,10,11,12
13,14,15,16
Изход
13,9,5,1
14,10,6,2
15,11,7,3
16,12,8,4

 */
public class Task04 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int c = 1;
		int r = 1;
		
		int rolls = 0;
		int cols = 0;
		System.out.println("Form a matrix array.");
		while (rolls<1 || cols<1){
			System.out.println("How many rolls?");
			rolls = sc.nextInt();
			System.out.println("How many collumns?");
			cols = sc.nextInt();
		}
		
		System.out.println("Please fill the matrix");
		
		int[][] arr = new int[rolls][cols]; 
		
		for (int i = 0 ; i<arr.length;i++){
			for (int j = 0 ;j<arr[i].length;j++){
				System.out.println("Enter the " + (j+1)+ " element of the " + (i+1) + " roll");
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("The matrix you have created is");
		
		for (int i = 0 ; i<arr.length;i++){
			for (int j = 0 ;j<arr[i].length;j++){
				System.out.print(arr[i][j] + " ");
				 
			}
			System.out.println();
		}
		int rollsR = arr[0].length;
		
		int[][] arrRot = new int[arr[0].length][arr.length];
		for (int i = 0; i<arrRot.length;i++){
			for (int j = 0 ; j<arrRot[i].length;j++){
				arrRot[i][j]=arr[rolls-r][c-1];
				r++;
			}
			c++;
			r=1;
		}
		
		System.out.println("The rotated matrix is");
		for (int i = 0; i<arrRot.length;i++){
			for (int j = 0;j<arrRot[i].length;j++){
				System.out.print(arrRot[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
