import java.util.Scanner;

/*������ 8: �� �������� ����� n, �� �� ������ �� ������ ������� ��
������� �����:
������:

�������� n:
2
11
33 

�������� n:
1
0

�������� n:
3
222
444
666

�������� n:
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
