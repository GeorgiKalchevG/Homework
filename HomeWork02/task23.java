/*
 * �� �� ������� ��������, ����� ���� ����� while ������� 

��������� �� ���������, �� ��� ����������. 

�.�. ��� � �������� 4*5 �� �� ������� 5*4.
 */
public class task23 {

	public static void main(String[] args) {
		
		int i = 1;
		int j = 1;
		
		while (i<=9){
			while(j<=9){
				System.out.print(i+"*"+j+";");
				j++;
			}
			i++;
			j=i;
			System.out.println("");
		}

	}

}
