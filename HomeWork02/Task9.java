import java.util.Scanner;

/*
 * �� �� �������� 2 ����� �� ������������ � � �.
�� �� ������� ������ ����� �� � �� � �� ������ 2(��������� �
�������).��� ����� ����� � ������ �� 3, �� �� ������ ��������� ��
������� �� �������� �skip 3�.��� ������ �� ������ �������� ����� (���
������������) ����� ��-������ �� 200, �� �� �������� �����������.
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
