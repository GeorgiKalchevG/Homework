import java.util.Scanner;

/*
 * Да се състави програма, която по въведено
естествено число N от интервала [10..200] извежда в обратен
ред всички числа, които са кратни на 7 и са по-малки от N.

 */
public class Task14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		int num = 0;
	
		while (num<10 || num>200) {
			System.out.println("Enter a number between 10 and 200");
			num = sc.nextInt();
		}
		for (int i  = num ; i>0; i--)
		{
					
			if(i%7==0){
				System.out.println(i + " ");
				
			}
		}

	}

}
