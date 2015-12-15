import java.util.Scanner;

/*
  * Имате предварително въведени стойности от естествени числа.
Числата са въведени в квадратна таблица с размери 6 реда и 6
колони.
Да се състави програма, чрез която се намира сумата на всички
елементи от редовете с четни номера: 2,4 и 6.
Програмата да извежда и сумата на всеки отделен ред.
11 12 13 14 15 16 
21 22 23 24 25 26 
31 32 33 34 35 36
41 42 43 44 45 46
51 52 53 54 55 56
61 62 63 64 65 66

  */
public class Task06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[6][6];
		int[][] arrNew = new int[arr.length/2][arr[0].length+1];
		System.out.println("Please fill the matrix");
		
		for (int i = 0; i<arr.length;i++){
			for(int j = 0 ; j<arr[i].length;j++){
				System.out.println("Enter the "+ (j+1) + "element of the " + (i+1) +" roll");
				arr[i][j]=sc.nextInt();
			}
		}
		int k = 0;
		for (int i=0; i<arr.length;i++){
			if (i%2==0) {
				
				continue;
			}
			
			for(int j=0;j<arr[i].length;j++){
				
					arrNew[(k)][j] = arr[i][j];
					arrNew[(k)][arr[0].length]=arrNew[k][arr[0].length]+arrNew[k][j];
			
				
			}
			k++;
		}
		for(int i=0;i<arrNew.length;i++){
			for(int j = 0 ;j<arrNew[i].length;j++){
				if(j<arrNew[i].length-2){
					System.out.print(arrNew[i][j] + ", ");
					
				}
				else{
					if (j==arrNew[i].length-2){
						System.out.print(arrNew[i][j]);
					
					}
					else{ 
						System.out.print( " sum " + arrNew[i][arrNew[i].length-1]);
					}
				}
			}
			System.out.println();
		}
		
		System.out.println("Total sum of these elements is " + (arrNew[0][arrNew[0].length-1]+arrNew[1][arrNew[0].length-1]+arrNew[2][arrNew[0].length-1]));

	}

}
