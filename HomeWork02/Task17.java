import java.util.Scanner;

/*
 * Да се състави програма, която извежда квадрат, чийто страни са
оформени със знака *, а вътрешността е запълнена със въведен
знак.
Входни данни b - дължина на страната число от интервала
[3..20], c - желан знак.
Програмата да използва цикъл for. 
 */
public class Task17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=0;
		
		while (size<3||size>20) {
			System.out.println("Enter the size of the square[3:20]");
			size = sc.nextInt();
		}
		System.out.println("Enter a symbol");
		char fill = sc.next().charAt(0);
		
		for (int i = 1; i<=size; i++){
			
			for (int j=1; j<=size; j++){
				if (i==1||i==size){
					System.out.print("* ");
				}
				else{
					if (j==1 || j==size){
						System.out.print("* ");
					}else {
						System.out.print(fill +" ");
					}
					
				}
				
			}
			System.out.println("");
		}
		

	}

}
