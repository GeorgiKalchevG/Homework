import java.util.Scanner;

/*
 * ���� �� ������� ����� �� �� ���������� ���, ���� ���������� ��
�������� �� ����� ���� �� �����������, � ������� �� �� ����
��������, �� � ������� ���. ��������, �� �� ������ ����� �����
�� ������.
 */
public class Task02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 0;
		
		while (size<1){
			System.out.println("Enter the size of the array");
			size = sc.nextInt();
		}
		int[] arr = new int[size];
		
		for (int i = 0; i<arr.length; i++ ){
			System.out.println((i+1) + " element");
			arr[i] = sc.nextInt();
			
		}
		
		
		int[] arrNew = new int[arr.length];
		
		for (int i = 0; i<(arrNew.length+1)/2; i++){
			
			arrNew[i]=arr[i];
			arrNew[arrNew.length-i-1]=arr[i];
			
		}
		
		for (int i = 0; i<arrNew.length;i++){
			System.out.println(arrNew[i]);
		}

	}

}
