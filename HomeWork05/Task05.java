import java.util.Scanner;

/*������ 5:
�� �� ������� ��������, ���� ����� �� �������� 2 ������ �� �����
(����).
��� � ����� ������ ������� ���� � ���� ����, �� �� ������ �� ������
������� ������ ������������, � ������� ����������, ���� �� �� ��
�������� � ����� �� ����.
��� �������� ����� ��� ���� �� �� ������ ���� ������������
���������.
������ :
�
�
�����
�
�
�
*/
public class Task05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two words");
		System.out.println("First word:");
		String first = sc.nextLine();
		System.out.println("Enter the second word:");
		String second = sc.nextLine();
		

		int placeX = -1;
		int placeY = -1;
		for(int i = 0;i<first.length();i++ ){
			for (int j =0 ; j<second.length();j++){
				if (first.charAt(i)==second.charAt(j)){
					placeX = j;
					placeY = i;
					break;
					
				}
				if(placeX!=-1)break;
			}
		}
		if(placeX!=-1){
			for (int i = 0; i < first.length();i++){
				if (i==placeY){
					System.out.println(second);
					continue;
				}
				for(int j = 0; j<=placeX;j++){
					if (j==placeX){
						System.out.print(first.charAt(i));
					}
					else{
						System.out.print(" ");
					}
				}
				System.out.println();
				
				
			}
			
		}
		else{
			System.out.println("The two words don't have common letters");
		}
		
		

	}

}
