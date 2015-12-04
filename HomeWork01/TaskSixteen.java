//Въведено е трицифрено естествено число от вида abc.
//Трябва да се провери дали: 
//ако a = b = c - Изход: цифрите са равни; 
//ако a>b>c - Изход: цифрите са във възходящ ред; 
//ако a<b<c цифрите са в низходящ ред; и изход: цифрите са ненаредени, за неописаните случаи.
//Да се състави програма, която извежда резултата от проверката за наредба на цифрите в числото



import java.util.Scanner;

public class TaskSixteen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numb;
		int d1;
		int d2;
		int d3;
		
		
		System.out.println("Enter a three digit number[100:999]");
		numb = sc.nextInt();
		
		while(numb<100 || numb>999) {
			System.out.println("The number is out of range [100:999], try again");
			numb = sc.nextInt();
			
		}
		
		d1 = (numb/100);
		d2 = (numb - d1*100)/10;
		d3 = numb - d1*100 - d2 * 10;
		
		if (d1==d2 && d2==d3) {
			System.out.println("The digits are equal");
		}else{
			if (d1 > d2 && d2 > d3) {
				System.out.println("Digits are in decreasing order");
			}
			else {
				if (d1<d2 && d2<d3) {
					System.out.println("Digits are in increasing order");
				}
				else{
					System.out.println("Digits are not arranged");
				}
			}
		}
	}

}
