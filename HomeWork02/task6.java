import java.util.Scanner;

//�� �� ������� ����� �� ������(���������) � �� ��
//������ ����� �� ������ ����� ����� 1 � ���������� �����.
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
