import java.util.Scanner;

/*
 * �� �� ������� ��������, ����� ���� ����� �� ���� ��������� �
��������.
���� �������� �� �� �������� ���� �� ���������� ����, ����� � ����
����� � ���-������� ����.
������: asd fg hjkl
�����: 3 ����, ���-������� � � 4 �������.
 */
public class Task07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=0;
		int wordCount = 1;
		int temp = 0;
		System.out.println("Enter a string of words with spaces");
		String read = sc.nextLine();
		

		
		for (int i = 1; i <read.length();i++){
			if(read.charAt(i-1)==' '){
				if (read.charAt(i)==' '&&i<read.length()){
					temp = 0;
					continue;
				}
				wordCount++;
				temp=0;
			}
			if (read.charAt(i)!=' '){
				temp++;
				if (temp>=size){
					size = temp;
			}
			
			}
			
			
		}
		if(read.charAt(0) == ' '){
			wordCount -=1; 
		}
		System.out.println("There are " + wordCount + " words, the longest is with " + size+" letters");
	}

}
