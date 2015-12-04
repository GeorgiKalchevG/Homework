import java.util.Scanner;

/*
 * Да се прочетат 2 числа от клавиатурата А и В.
Да се изведат всички числа от А до В на степен 2(разделени с
запетая).Ако някое число е кратно на 3, да се изведе съобщение че
числото се пропуска „skip 3“.Ако сумата от всички изведени числа (без
пропуснатите) стане по-голяма от 200, да се прекрати извеждането.
 */
public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int result = 0;
		
		System.out.println("Enter the first number; ");
		int first = sc.nextInt();
		System.out.println("Enter the second number");
		int second = sc.nextInt();
		
		
		if (first>second){
			int temp = first;
			first = second;
			second = temp;
		}
		for (int i = 1; result<second; i++){
			result=i*i;
			
			if (result>second) break;
			if (result<first) continue;
			{
				
				if (result%3==0)
				{
					System.out.println("Skip " + result);
				
				}
				else {
					sum = sum + result;
					System.out.println(result);
				}
				if (sum>200) {
					break;
				}
			}
		}

	}

}
