import java.util.Scanner;

//Да се прочете число от екрана(конзолата) и да се
//изведе сбора на всички числа между 1 и въведеното число.
public class task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int numb = sc.nextInt();
		int res=0;
		for (int i=1; i<=numb;i++ )
		{
			res=res+i;
		}
		System.out.println("The sum of the numbers form 1 to the entered number is: " + res);

	}

}
