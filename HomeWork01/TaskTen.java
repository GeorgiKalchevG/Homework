//������ �� �� ������� �������� � ����. ����� 2 ���� � ���������� 2 �
//3 ����� � �� �������� ������������.
//�� �� ������� ��������, ����� �� ����� ���� ������� ��� �� ��������
//��������� � ���� ����, �.�. ��-����� ���� �� �� ����� ����� ��
//������. ������ �� ����� �� �� ������� � �������� ���������� ����.
//������ �����: ���������� ����� �� ��������� [10..9999].


import java.util.Scanner;

public class TaskTen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vol;
		int bucket1 = 2;
		int bucket2 = 3;
		int fillBkt;
		int fillBkt1 ;
		int fillBkt2 ;
		int rest;
		
		System.out.println("Enter tank volume(between 10 and 9999): ");
		vol = sc.nextInt();
		while(vol < 10 || vol > 9999) {
			System.out.println("Enter tank volume(between 10 and 9999): ");
			vol = sc.nextInt();	
		}
		if (vol%10 != 1){
			
		fillBkt = ((vol/10)*10)/(bucket1 + bucket2);
		rest = vol - fillBkt*5;
	
		}
		else {
			vol = vol - 2;
			fillBkt = ((vol/10)*10)/(bucket1 + bucket2);
			rest = vol - fillBkt * 5 + 2;
			System.out.println(rest);
		}
		
		fillBkt1 = fillBkt;
		fillBkt2 = fillBkt;
		
		if (rest%2==0)
		{
			fillBkt=fillBkt + rest/2;

		}
		if (rest%2!=0){
			
			while (rest>3 ){
				rest=rest-2;
				fillBkt1++;
				
			}	
			fillBkt2++;
		}
		System.out.println("Two litter bucket " + fillBkt1 + " times;" + " three liter buket " + fillBkt2 + " times");
	}

}
