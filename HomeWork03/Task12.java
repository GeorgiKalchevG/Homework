/*�� �� ������� ��������, ���� ����� �� ������������� �������� 7
����� � ��������� ����� �� �������� ������� �� �������� � �������:
- 0 � 1 ���� ����� ����������;
- 2 � 3 ���� ��������;
- 4 � 5 ���� ���������.

 * 
 */
public class Task12 {

	public static void main(String[] args) {
		int[] arr = {1,5,7,6,8,3,11};
		for (int i=0; i<arr.length;i++){
			System.out.print (arr[i] );
			if (i!=arr.length-1){
				System.out.print(", ");
			}
		}
System.out.println();
		for(int i = 0;i<arr.length;i++){
			
			if (i==0){
				int temp = arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			if (i==2){
				arr[i]=arr[i]+arr[i+1];
				arr[i+1]=arr[i]-arr[i+1];
				arr[i]=arr[i]-arr[i+1];
			}
			if (i==4){
				arr[i] = arr[i]*arr[i+1];
				arr[i+1] = arr[i]/arr[i+1];
				arr[i] = arr[i]/arr[i+1];
			}
		}
		for (int i=0; i<arr.length;i++){
			System.out.print (arr[i]);
			
			if (i!=arr.length-1){
				System.out.print(", ");
			}
		}

	}

}
