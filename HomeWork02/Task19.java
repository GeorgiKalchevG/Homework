/* �� �� ������� ��������, ���� ����� �� ��������
���������� ����� �� ��������� [10..99] �� ������� ��������
�����, ��� �������� �� �������� ����������:
1) ��� ����������� ����� � ����� �� ������� 0.5*�������;
2) ��� ����������� ����� � ������� �� ������� 3*������� +1.
����������� ���������� ������ �� �� ������ �������� 1.
 * 
 */
import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numb = 0;
		
		while (numb<10 ||numb>99){
			System.out.println("Entere a number between 10 and 99 ");
			numb = sc.nextInt();
			
		}
		
		while (numb!=1){
			if (numb%2==0){
				numb = numb/2;
			}else {
				numb=numb*3 +1;
			}
			System.out.print(numb + " ");
			
		}
	}

}
