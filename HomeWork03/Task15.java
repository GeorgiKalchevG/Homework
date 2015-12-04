import java.util.Scanner;



/*
 * Да се състави програма, която въвежда в едномерен масив реални
числа.
Като изход: програма извежда онези 3 различни числа, чиято
абсолютна стойност формира максималната обща сума.
Пример: 7.13; 0.2; 4.9; 5.1; 6.34; 1.12
Изход: 5.1; 6.34; 7.13

 */
public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rep = 0;
		int size=0;
		int count=0;
		while (size<3){
		System.out.println("Enter the size of the array(minimum 3)");
		size = sc.nextInt();
		}
		double[] arr = new double[size];
		
		for (int i = 0; i<arr.length;i++){
			System.out.println("Enter the " + (i+1) + " element");
			arr[i]=sc.nextDouble();
			if (arr[i]<0){
				arr[i]=arr[i]*(-1.0);
			}
			if(i!=arr.length-1){
				System.out.println((arr.length-i-1) + " remaining");
			}
		}
		

		for(int i = 0; i<arr.length; i++){
			for(int j = i;j<arr.length;j++){	
				if(arr[i]<arr[j]){				
					double temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
			
		}
		System.out.println("The three different absolut values that have the highest sum are");
		for(int i = 0; i<arr.length ;i++){
			if (arr[i]!=arr[i+1]){
			System.out.print(arr[i]);
			count++;
				if (count==3){
					break;
				}
			System.out.print("; ");
					
			}
			else{
				 rep++;
				 
			}
			if (rep==3){
				System.out.println("There aren't three different absolut values");
				break;
			}
		}		
	}
		

}
