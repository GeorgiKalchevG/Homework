import java.util.Scanner;

/*
 * �� �� ������� ��������, ���� ����� ������������� �������� 10
������ ����� �� ���������(�����������, �� ����� ������ �� ���������) �� ���������� �� ������� �����:
1. ������� �������������� �����.
2. ������ �������� ��� �������� ��-����� �� -0.231 �� ������� ��� 
������ �� �������� �� �������� �� ����� + ������� 41.25, � ������
�������� �������� �� ������� � �������������� ����� ����� �������
� �������� ������� �����. ��������� ����� �� ������� ������� � 1.
3. �� �� ������� ���������� �� �������� � ��������������� �����.
������: -1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4
�����: 42.25, 45.25, 9.3, 16.8, 0, 38.4, 90.25, 68.8, 81.9,141.25

 */
public class Task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[10];
		for (int i = 0 ; i<arr.length;i++){
			
			System.out.println("Enter the " + (i+1) + " element");
			arr[i]=sc.nextDouble();
			if(i!=arr.length-1){
				System.out.println((arr.length-i-1) + " remaining");
			}
		}
		
		for (int i = 0; i <arr.length; i++){
			System.out.print(arr[i]);
			if (i!=arr.length-1){
			System.out.print(", ");
			}
		}
		System.out.println();
		for (int i = 0;i<arr.length;i++){
			if (arr[i]<-0.231){
				arr[i]=(i+1)*(i+1) + 41.25;
			}
			else{
				arr[i]=arr[i]*(i+1);
			}
			System.out.print(arr[i]);
			if (i!=arr.length-1){
				System.out.print(", ");
			}
		
		}
		
		

	}

}
