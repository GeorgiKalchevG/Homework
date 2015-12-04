/*Въведете число от клавиатурата и определете дали е
просто. Просто число е това което се дели САМО на 1 и на себе
си.
 * 
 */
import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check if it's prime:");
		int numb = sc.nextInt();
		
		boolean check = true;
		
		for (int i = 2; i<numb; i++)
		{
			if (numb%i==0) {
				check=false;
				break;
			}
			
		}
		
		if (check){
			System.out.println(numb + " is prime");
		}
		else
		{
			System.out.println(numb + " is NOT prime");
		}

	}

}
