import java.util.Scanner;

// �� �� ������� �� ����������� 2 �����. � �� ��
//������� �� ������ ������ ����� �� ��-������� �� ��-��������.

public class Task5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int first;
		int second;
		
		System.out.println("Enter the first number: ");
		first = sc.nextInt();
		System.out.println("Enter the second number: ");
		second = sc.nextInt();
		
		if (first>second)
		{
			int temp = first;
			first=second;
			second = temp;
		}
		
		for (int i = first; i<=second; i++)
		{
			System.out.print(i + " ");
		}
	
	}
}
