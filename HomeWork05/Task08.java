import java.util.Scanner;

/*�� �� ������� ��������, ���� ����� �� ������� ��� �� �������
(������, ���).
���������� �� ������ �� ������ ���� ��������� ������ � ���������,
�.�. ���� ����� ������-������� � �������-������ � ���� � ���.
����: �����
�����: ��.
����: ��������
�����: ��.
 * 
 */
public class Task08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word to check if is palindrom");
		String word = sc.nextLine();
	
		boolean check = true;
		
		for (int i =0; i<word.length(); i++){
			if (word.charAt(i)!=word.charAt(word.length()-i-1)){
				check = false;
			}
			
		
		}
		System.out.println(check?"Yes":"No");

	}

}
