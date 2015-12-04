/*Да се състави програма, чрез която по предварително въведени 7
числа в едномерен масив се разменят местата на елементи с индекси:
- 0 и 1 чрез трета променлива;
- 2 и 3 чрез събиране;
- 4 и 5 чрез умножение.

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
