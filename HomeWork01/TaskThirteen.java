//�� �� ������� ��������, ����� �� ������� ����� � �������/����� �� ���������� ����������� t � ������ ������.
//�������������� ��������� ��: 
//��� -20 ������ �������; 
//����� 0 � -20 - �������; ����� 15 � 0 -  ������; 
//����� 25 � 15 - �����; 
//��� 25 � ������.
//������ �����: ���� ����� �� ��������� [-100..100].
import java.util.Scanner;

public class TaskThirteen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int temp;
		
		System.out.println("What is the temperature in Celsius?[-100C 100C]");
		temp = sc.nextInt();
		
		while (temp<-100 || temp>100){
			System.out.println("Enter a temperature in the requested interval");
			temp = sc.nextInt();
		}
		if (temp>=-100 && temp<=-20) System.out.println("Ice cold");
		if (temp>-20 && temp<=0) System.out.println("Cold");
		if (temp>0 && temp <=15) System.out.println("Cool");
		if (temp>15 && temp<=25) System.out.println("Warm");
		if (temp>25 && temp<101) System.out.println("Hot");

	}

}
