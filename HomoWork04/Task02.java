import java.util.Scanner;

/*
 * Имате квадратен двумерен масив от естествени числа, чийто стойности
се въвеждат от конзолата. Да се отпечатат диагоналите на масива.
 */
public class Task02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 0;
		int n = 0;
		int m = 0;
		
		while (size <1){
			System.out.println("Enter the size of the square matrix");
			size = sc.nextInt();
			
		}
		int[][] arr = new int[size][size];
		
		for(int i = 0; i< arr.length;i++){
			for (int j =0; j<arr[i].length;j++){
				System.out.println("Enter the "+(j+1)+" element of the " + (i+1) + " roll");
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		int[] arrMD = new int[arr.length];
		int[] arrSD = new int[arr.length];
		
		for (int i =0; i <arr.length;i++){
			for (int j = 0; j<arr[i].length;j++){
				if (i==j){
					arrMD[n]=arr[i][j];
					n++;
				}
				if (j==arr[j].length-i-1){
					arrSD[m] = arr[i][j];
					m++;
				}
			}
		}
		for(int i =0;i<arrMD.length;i++){
			System.out.print(arrMD[i]);
		}
		
		System.out.println();
		for(int i =0;i<arrMD.length;i++){
			System.out.print(arrSD[i]);
		}

	}

}
