//�������� 3 ����� �� ������������ �1, �2 � �3. 
//��������� ����������� �� ����, �� �1 �� ��� ���������� �� �2, �2 �� ��� ���������� �� �3, � �3 �� ��� ������� �������� �� �1



import java.util.Scanner;

public class TaskSix {

	public static void main(String[] args) {
		double a1;
		double a2;
		double a3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers");
		System.out.println("a1 = ");
		a1 = sc.nextDouble();
		System.out.println("a2 = ");
		a2 = sc.nextDouble();
		System.out.println("a3 = ");
		a3 = sc.nextDouble();
		
		double temp = a1;
		
		
		a1 = a2;
		a2 = a3;
		a3 = temp;
		
		System.out.println("a1= " + a1 + "  a2 " + a2 + "   a3= " + a3 );

	}

}
