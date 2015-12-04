
public class Task06 {

	public static void main(String[] args) {
		int[] arr1 = {1,5,5,8,0,-2, 1};
		int[] arr2 = {1,5,5,8,0,-2, 1};
		boolean isEqual = true;
		
		if (arr1.length!=arr2.length){
			System.out.println("The arrays are of different size thus cannot be equal");
		}
		else{
			System.out.println("The arrays are of same size");
			for (int i=0;i<arr1.length;i++) {
				if (arr1[i]!=arr2[i]){
					isEqual = false;
					
				}
			}
			if(isEqual){
				System.out.println("The arrays are equal");
				
			}
			else
			{
				System.out.println("The arrays are NOT equal");
				
			}
		}
		
		

	}

}
