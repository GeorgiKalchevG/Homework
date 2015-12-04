//�� �� ������� ��������, ����� ���� �� ��������� 4-������o ���������� ����� �� ��������� [1000.. 9999].
//�� ���� ����� �� �������� 2 ���� 2-������� �����. 
//������� ����� �� ������� �� 1-�� � 4-�� ����� �� ���������� �����. 
//������� ����� �� ������� �� 2-�a 3-�� ����� �� ���������� �����. 
//���� �������� �� �� ������ ���� 1-�� ���� ����� e ��-����� <, ����� = ��� ��-������ �� 2-�� �����



import java.util.Scanner;

public class TaskEight {

	public static void main(String[] args) {
		int value;
		int d1;
		int d2;
		int d3;
		int d4;
		int new1;
		int new2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a four digit number: ");
		value = sc.nextInt();
		while(value<1000 || value>9999){
			System.out.println("Enter a four digit number: ");
			value = sc.nextInt();
		}
			
		d1 = value / 1000;
		d2 = (value - d1 * 1000) / 100;
		d3 = (value - d1 * 1000 - d2 * 100) / 10;
		d4 = value - d1 * 1000 - d2 * 100 - d3 * 10;
		
		
		new1 = d1 * 10 + d4;
		new2 = d2 * 10 + d3;

		if (new1>new2) System.out.println("Bigger " + new1 + " > " + new2);
		if (new1<new2) System.out.println("Smaller " + new1 + " < " + new2);
		if (new1==new2) System.out.println("Equal " + new1 + " = " + new2);
	}

}
