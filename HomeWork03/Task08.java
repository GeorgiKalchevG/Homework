/*Напишете програма, която намира и извежда най-дългата редица от
 *еднакви поредни елементи в даден масив.
 */


public class Task08 {

	public static void main(String[] args) {
		int[] array = {45,45,44,44,1,1,1,1,1,1,1,0,444,0,0,0,0,0,0,444,4,7,7,7,7,7,7};
		int equals = 1;
		int number=0;
		int check=0;
		
		for (int i=1;i<array.length;i++){
			
		
			if(array[i-1]==array[i]){
				equals++;
				if (check<=equals){
					check=equals;									
					number = array[i-1];
				}
			}
						
			else {
					equals=1;
					continue;
			}
		}
		for (int i=0;i<check;i++){
		System.out.print( number + " " );
		}
	}

}
