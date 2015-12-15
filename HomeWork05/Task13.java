/*
 * Да се създаде метод, който приема два масива от числа и връща
масив, съдържащ всички елементи на подадените масиви, като в
първата част на масива са елементите на първия подаден масив,
а във втората част – тези на втория подаден масив.
 */
public class Task13 {

	public static void main(String[] args) {
		int[] firstArray = {2,4,5,78,5,1,7,2,5,5};
		int[] secondArray = {0,1,5,5,7,74,4,0,0,0};
		int[] newArray = combineArrays(firstArray,secondArray);
		printArray(newArray);

	}
	static int[] combineArrays(int[] arr1,int[] arr2){
		int[] newArr = new int[arr1.length+arr2.length];
		
		for (int i =0; i<newArr.length;i++){
			if (i<arr1.length){
			newArr[i] = arr1[i];
		}else
			newArr[i] = arr2[i-arr1.length];
		}
		
		return newArr;
	}
	static void printArray(int[] array){
		for(int i =0; i<array.length;i++){
			if(i==0){
				System.out.print("[" + array[i]+", ");
			}
			else{
				if (i==array.length-1){
					System.out.print(array[i]+"]");
				}
				else{
					System.out.print(array[i] + ", ");
				}
			}
		}
			
		
	}

}
