import java.util.Scanner;

/*
 * �� �� ������� ��������, ���� ����� �� ������� ����� � �� ���������
���� ����� � ������� ������ �������.
����������, ���� �����, �� ��������� �������������� ������ �����
�� ���������� ���������� ����� � 2-���� ������ �������.
������: 99
�����: 1100011

 */
public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int numb = sc.nextInt();
		int count=0;
		int result;
		result = numb;
		while(result!=0){
			result=result/2;
			count++;
		}
		int[] arrBin = new int[count];
		for (int i =0; i<arrBin.length;i++){
			result=numb%2;
			numb/=2;
			if(result==0){
				arrBin[arrBin.length-i-1]=0;
			}
			else{
				arrBin[arrBin.length-i-1] = 1;
			}
		}
		System.out.print("In binary: ");
		for(int i=0; i<arrBin.length;i++){
		
			System.out.print(arrBin[i]);
			
			
		}
	}

}
