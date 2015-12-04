//Да се прочете масив и да се отпечата дали е огледален.

public class Task04 {

	public static void main(String[] args) {
		int[] arr = {1,2,1,2,1};
		boolean mirror = true;
		
		
		for (int i = 0 ; i<(arr.length+1)/2;i++){
			if (arr[i]!=arr[(arr.length-1)-i]){
				System.out.println("The array is NOT mirrored");
				mirror=false;
				break;
			}
			
		}
		if (mirror){
			System.out.println("The array is mirrored");
		}

	}

}
