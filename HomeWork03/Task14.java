/*
 * ����� ������������� ������� ��������� �����, �������� ������
�����.
�� �� ������� ��������, ���� ����� �� ������� ���� �������� ��
������ ��� ��������� �� ��������� [-2.99..2.99] � �� ���������� � ���
�����. ������ ����� �� �� ������� �� ������.
������: 7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2
�����: 0.2; 0.99; 1.4; 1.2
 */
public class Task14 {

	public static void main(String[] args) {
		int size=0;
		double[] arr = {7.2 , -1.22, 5.1, 0.2,1.1, -0.5, -0.21 ,-2.1, 1,-1, 55, -2.98 , -2.99, 2.99};
		for (int i =0; i<arr.length;i++){
			
			if(arr[i]>=-2.99&&arr[i]<=2.99){
				size++;
			}
			
		}
		double[] arrNew = new double[size];
		size=0;
		for (int i = 0; i<arr.length;i++){
			if(arr[i]>=-2.99&&arr[i]<=2.99){
				arrNew[size]=arr[i];
				size++;
			}
		}
		
		for (int i = 0; i<arrNew.length;i++){
			System.out.print(arrNew[i]);
			if (i!=arrNew.length-1){
				System.out.print("; ");
			}
		}
	}

}
