/*
 * Да се състави програма, чрез която се извежда квадрат от 

цифри. Сумите от елементите на произволен ред или стълб са 

равни на 45.
 */
public class task20 {

	public static void main(String[] args) {
		int x;
		for (int i= 1; i<=10; i++){
			x = i;
			for(int j=1;j<=10;j++){
				
				if (x>=10){
					x=x-10;
				}
				
				System.out.print(x + " ");
				x++;
				
			}
			System.out.println(" ");
			
		}
		

	}

}
