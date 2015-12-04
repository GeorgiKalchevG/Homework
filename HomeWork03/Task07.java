/*
 * Напишете програма, която първо чете масив и после създава нов
масив със същия размер по следния начин: стойността на всеки
елемент от втория масив да е равна на сбора от предходния и
следващият елемент на съответния елемент от първия масив. Първият
и последният елемент на втория масив трябва да си останат равни на
първият и последният от елемент от първия масив.
Да се изведе получения масив.
 */
public class Task07 {

	public static void main(String[] args) {
		int[] arr1 = {1,5,-1,-5,1,413,-473,-234,-312};
		
		int[] arrNew = new int[arr1.length];
		
		for(int i=0; i<arrNew.length; i++) {
			if(i==0||i==(arrNew.length-1)){
				arrNew[i]=arr1[i];
				
			}
			else{
				arrNew[i]=arr1[i-1]+arr1[i+1];
			}
						
		}
		System.out.print("[");
		for (int i =0 ; i<arrNew.length;i++){
			if (i!=arrNew.length-1)
				System.out.print(arrNew[i] + ", ");
				else 
				{
					System.out.print(arrNew[i] + "]");
				}
		}

	}

}
