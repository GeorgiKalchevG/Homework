/*
 * Дадени са два едномерни масива с естествени числа.
Да се състави програма, която сравнява всички числа с еднакви
индекси от двата масива и записва в трети масив, по-голямото от
двете числа.
Да се изведе съдържанието и на трите масива
Пример:
18,19,32,1,3, 4, 5, 6, 7, 8
1, 2, 3,4,5,16,17,18,27,11
Изход:
18,19,32 ,4,5,16,17,18,27,11

 */

public class Task18 {
		public static void main(String[] args) {
			
			
			int[] arrA = {15,145,6,3,14,78,6,25,7};
			int[] arrB = {6,45,7,88,21,5,56,8,97};
			int[] arrC = new int[arrA.length];
			
			for (int i=0 ; i<arrA.length;i++){
				if(arrA[i]>=arrB[i])
				{
					arrC[i]=arrA[i];
				}else 
				{
					arrC[i]=arrB[i];
				}
				
				
			}
			for( int i = 1; i<=3;i++){
				for (int j = 0; j<arrA.length;j++){
					switch (i){
					case 1:
					{
						System.out.print(arrA[j]);
						if (j!=(arrA.length-1)){
							System.out.print(", ");
						}
						break;
						
					}
					case 2:
					{
						System.out.print(arrB[j]);
						if (j!=(arrA.length-1)){
							System.out.print(", ");
						}
						break;
					}
					case 3:
					{
						System.out.print(arrC[j]);
						if (j!=(arrA.length-1)){
							System.out.print(", ");
						}
						break;
					}
						
					
						
					}
				}
				System.out.println();
			}
	
		}
}
