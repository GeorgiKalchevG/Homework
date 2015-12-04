/* Да се състави програма, чрез която по въведено
естествено число от интервала [10..99] се извежда поредица
числа, при спазване на следните изисквания:
1) ако предходното число е четно се извежда 0.5*числото;
2) ако предходното число е нечетно се извежда 3*числото +1.
Извеждането продължава докато не се получи стойност 1.
 * 
 */
import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numb = 0;
		
		while (numb<10 ||numb>99){
			System.out.println("Entere a number between 10 and 99 ");
			numb = sc.nextInt();
			
		}
		
		while (numb!=1){
			if (numb%2==0){
				numb = numb/2;
			}else {
				numb=numb*3 +1;
			}
			System.out.print(numb + " ");
			
		}
	}

}
