

//Да се състави програма, която чете от конзолата 2 естествени двуцифрени числа a,b. 
//Програмата да изведе в конзолата дали последната цифра от произведението на двете числа е четна, както и самата цифра. 
//Входни данни: a,b - естествени числа от интервала [10..99]


import java.util.Scanner;

public class TaskNine {

	public static void main(String[] args) {
		
		int a;
		int b;
		int prod;
		int ld;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two double digit numberes: ");
		System.out.println("Number a:");
		a =sc.nextInt();
		
		while(a <10 || a > 99){
			System.out.println("Number a:");
			a =sc.nextInt();
		}
		System.out.println("Number b:");
		b =sc.nextInt();
		
		while (b < 10 || b > 99) {
			System.out.println("Number b:");
			b =sc.nextInt();
		}
		
		prod = a * b;
		ld = prod - (prod/10)*10;
		if (prod%2 == 0) {
			System.out.println(prod + ", " + ld + " is even");
		}
		else {
			System.out.println(prod + ", " + ld + " is odd");
		}
	}

}
