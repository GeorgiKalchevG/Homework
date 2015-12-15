/*
 * Имате двумерен масив от числа, чийто стойности са въведени
предварително. Да се отпечатат сумата на елементите на масива,
както и средноаритметичното на тези числа.
 */
public class Task03 {

	public static void main(String[] args) {
		int[][] arr = 
			{
					{1,42,5,7,6,33,47},
					{1,4,5,70,60,33,4},
					{21,4,5,7,61,33,4},
					{1,4,15,71,6,33,84},
					{1,43,5,17,46,33,34},
					
					
			};
		int sum = 0;
		
		
		for(int i = 0; i<arr.length;i++){
			for (int j = 0; j<arr[i].length;j++){
				sum = sum + arr[i][j];
			}
		}
		System.out.println("The sum of all of the elements of the matrix is " + sum +
				", the average value is " + ((double)sum/(arr.length*arr[0].length)));

	}

}
