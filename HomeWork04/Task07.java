/*
 * ����� ������������� �������� ��������� �� ���������� �����,
�������� � ��������� ������� � ������� 6 ���� � 6 ������.
�� �� ������� �������� , ���� ����� �� ������ ������ �� ������
��������, ����� ���� �� ������� �� ��� � ������ � ����� �����.
���������� �� ������� ����������� ���� �� ����� ������� ��� ��
����������� �������, ����� � ������ ���� �� ���� ��������.
�� �� �������� ���� ���� �����.


11 12 13 14 15 16 
21 22 23 24 25 26 
31 32 33 34 35 36
41 42 43 44 45 46
51 52 53 54 55 56
61 62 63 64 65 66



������:
11,12,13,14,15,16,
21,22,23,24,25,26,
31,32,33,34,35,36,
41,42,43,44,45,46,
51,52,53,54,55,56,
61,62,63,64,65,66
�����:
11, ,13, ,15, , ���� �� ���������� �� ����: 39
22, ,24, ,26, ���� �� ���������� �� ����: 72
31, ,33, ,35, , ���� �� ���������� �� ����: 99
42, ,44, ,46, ���� �� ���������� �� ����: 132
51, ,53, ,55, , ���� �� ���������� �� ����: 159
62, ,64, ,66 ���� �� ���������� �� ����: 192
���� �� ����������: 693
 */



import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
	/*	int[][] arr =
			{
					{11,12,13,14,15,16},
					{21,22,23,24,25,26},
					{31,32,33,34,35,36},
					{41,42,43,44,45,46},
					{51,52,53,54,55,56},
					{61,62,63,64,65,66}
			};
	*/	
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[6][6];
		
		System.out.println("Please fill the matrix");
		
		for (int i = 0; i<arr.length;i++){
			for(int j = 0 ; j<arr[i].length;j++){
				System.out.println("Enter the "+ (j+1) + " element of the " + (i+1) +" roll");
				arr[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		int sumTotal = 0;
		for (int i = 0 ; i <arr.length; i++){
			sum=0;
			for (int j = 0; j<arr[i].length;j++){
				if ((i+j)%2==0){
					System.out.print(arr[i][j] + ", ");
					sum = arr[i][j] + sum;
				}
				
				
			}
		
			System.out.println(" the sum of the elements of the roll is: " +sum);
			sumTotal = sum + sumTotal;
		}
		System.out.println("The total sum of the elements is: " + sumTotal);

	}

}
