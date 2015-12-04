import java.util.Scanner;

/*Задача 8: По зададено число n, да се изведе на екрана таблица по
следния начин:
Пример:

Въведете n:
2
11
33 

Въведете n:
1
0

Въведете n:
3
222
444
666

Въведете n:
4
3333
5555
7777
9999
*/
public class task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number n:");
		int n = sc.nextInt();
		int res = n-1;
		for (int i = 1 ; i<=n ; i++)
		{
			for (int j = 1; j<=n; j++)
			{
				System.out.print(res + " ");
			}
			res=res+2;
			System.out.println("");
		}

	}

}
