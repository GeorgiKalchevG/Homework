/*Да се направи програма, която по дадено число N, да изчислява
N!, т.е. 1*2*3*4...*N.
 * 
 */
import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int numb = sc.nextInt();
		int count=1;
		long result=1;
		do {
			count++;
			result=result*count;
			
		}while(count!= numb);
		System.out.println(numb+"!="+result);
	}

}
