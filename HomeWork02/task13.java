import java.util.Scanner;

/*
 *  Да се състави програма, която извежда всички
естествени трицифрени числа, които имат сбор на цифрите равен
на дадено число.

 */
public class task13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numb = 0;
		while (numb>27||numb<1){
			System.out.println("Enter a number between 1 and 27");
			numb = sc.nextInt();
		}
		
		for (int i = 100; i<=999; i++){
			
			int d1 = i/100;
			int d2 = (i-d1*100)/10;
			int d3 = i-d1*100-d2*10;
			if (d1+d2+d3==numb){
				System.out.println(i);
				
				
				
			}
			
		}

	}

}
