
/*
 * Да се състави програма, която да изчисли сумата на
всички числа от 1 до въведено число N.
Пример: 5
Изход: 15
Използвайте цикъл do-while.
 */
import java.util.Scanner;


public class task15 {

	public static void main(String[] args) {
		int i=0;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int numb = sc.nextInt();
		
		do{
		
			i++;
			sum = sum +i;
		}while (i<numb);
		
		System.out.println("The sum is " + sum);

	}

}
