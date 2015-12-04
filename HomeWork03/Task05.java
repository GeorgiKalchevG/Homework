/*
 * Напишете програма, която създава масив с 10 елемента и
инициализира всеки от елементите със стойност, равна на индекса на
елемента, умножен по 3.
Да се изведат елементите на екрана.
 */
public class Task05 {

	public static void main(String[] args) {
		int[] array = new int[10];
		
		for(int i=0; i<array.length;i++){
			array[i]=i*3;
			
		}
		System.out.print("[");
		for (int i =0; i<array.length;i++){
			if (i!=array.length-1)
			System.out.print(array[i] + ", ");
			else 
			{
				System.out.print(array[i] + "]");
			}
		}

	}

}
