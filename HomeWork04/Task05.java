import java.util.Scanner;

/*
 * Да се състави програма, при която предварително са въведени
естествени числа в двумерен масив 4*4 елемента.
Програмата да извежда резултат от проверката какво е съотношението
на най-голямата сума по редове спрямо най-голямата сума по колони.
 */
public class Task05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sumR = 0;
		int sumC = 0;
		int temp = 0;
		int[][] arr = new int[4][4];
//		filling the array
		System.out.println("Pease fill the 4x4 matrix");
		for(int i = 0; i<arr.length;i++){
			for (int j = 0;j<arr[i].length;j++){
				System.out.println("Enter the " + (j+1)+ " element of the " + (i+1) + "roll" );
				arr[i][j] = sc.nextInt();
				
			}
		}
//		find the biggest roll sum
		for (int i = 0 ; i<arr.length;i++){
			for (int j = 0; j<arr[i].length;j++){
				if (i==0){
					sumR=arr[i][j]+sumR;
				}
				temp = arr[i][j]+temp;
				
				if (temp>=sumR){
					sumR=temp;
				}
			}
			temp=0;
		}
		
//		find the biggest col sum 
		for (int i = 0 ; i<arr[0].length;i++){
			for (int j = 0; j<arr.length;j++){
				if (i==0){
					sumC=arr[j][i]+sumC;
				}
				temp = arr[j][i]+temp;
				
				if (temp>=sumC){
					sumC=temp;
				}
			}
			temp=0;
		}
		
		
//		compare the sums and send a message
		System.out.println("The biggest sum for the columns is " + sumC);
		System.out.println("The biggest sum for the rolls is " + sumR);

		if (sumC>sumR){
			System.out.println("The biggest sum for the columns is bigger than the biggest sum for the rolls");
			
		}else
			if(sumR>sumC){
				System.out.println("The biggest sum for the rolls is bigger than the biggest sum for the columns");
	
			}
			else{
				System.out.println("The biggest sum for the columns is equal to the biggest sum for the rolls");

			}

	}

}
