import java.util.Scanner;

/*
 * Да се състави програма, чрез която се въвежда две числа от
интервала [1..9].
Програмата да извежда таблицата за умножение.
Максималната стойност на множителите е определена от 2-те
числа.

 */
public class Task18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1=0;
		int n2=0;
		
		while (n1<1 || n1>9){
			System.out.println("Enter the first number: ");
			n1 = sc.nextInt();
		}
		while (n2<1 ||n2>9) {
			System.out.println("Enter the second number: ");
			n2 = sc.nextInt();
			
		}
		
		
		for (int i = 1; i<=n1; i++){
			for (int j = 1; j<=n2; j++){
				System.out.println(i + "*" + j + "=" + i*j + ";");
			}
		}

	}

}
