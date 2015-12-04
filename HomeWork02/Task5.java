import java.util.Scanner;

// Да се въведат от потребителя 2 числа. И да се
//изведат на екрана всички числа от по-малкото до по-голямото.

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
