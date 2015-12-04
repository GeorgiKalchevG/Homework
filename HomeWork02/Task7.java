import java.util.Scanner;



//Започвайки от 3, да се изведат на екрана първите n
//числа които се делят на 3. Числата да са разделени със запетая.

public class Task7 {
	public static void main(String[] args) {
		int three=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many of the numbers devisible by 3 starting from 3 do you want to see?");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++)
		{
			
			
			System.out.print(three = three + 3);
			if (i==n){
				break;
			}
			System.out.print(", ");
		}
		
	
	}
}
