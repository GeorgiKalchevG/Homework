/*
 * �� �� ������ �����, ���� ����� �� �� ������� ����� � 10
�������� �� ������� �����:
������� 2 �������� �� ������ �� ���������� �����.
����� ������� ������� �� ������ � ����� �� ����� ��
���������� 2 �������� � ������.
 */


import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int numb = sc.nextInt();
		
		int[] array = new int[10];
		array[0]=numb;
		array[1]=numb;
		
		for (int i = 2; i<array.length;i++){
			
			array[i]=array[i-1]+array[i-2];
		}
		for (int i = 0; i<array.length;i++){
			System.out.println(array[i]);
		}

	}

}
