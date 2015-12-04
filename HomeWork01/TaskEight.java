//Да се състави програма, която чете от конзолата 4-цифренo естествено число от интервала [1000.. 9999].
//От това число се формират 2 нови 2-цифрени числа. 
//Първото число се формира от 1-та и 4-та цифра на въведеното число. 
//Второто число се формира от 2-рa 3-та цифра на въведеното число. 
//Като резултат да се изведе дали 1-то ново число e по-малко <, равно = или по-голямо от 2-то число



import java.util.Scanner;

public class TaskEight {

	public static void main(String[] args) {
		int value;
		int d1;
		int d2;
		int d3;
		int d4;
		int new1;
		int new2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a four digit number: ");
		value = sc.nextInt();
		while(value<1000 || value>9999){
			System.out.println("Enter a four digit number: ");
			value = sc.nextInt();
		}
			
		d1 = value / 1000;
		d2 = (value - d1 * 1000) / 100;
		d3 = (value - d1 * 1000 - d2 * 100) / 10;
		d4 = value - d1 * 1000 - d2 * 100 - d3 * 10;
		
		
		new1 = d1 * 10 + d4;
		new2 = d2 * 10 + d3;

		if (new1>new2) System.out.println("Bigger " + new1 + " > " + new2);
		if (new1<new2) System.out.println("Smaller " + new1 + " < " + new2);
		if (new1==new2) System.out.println("Equal " + new1 + " = " + new2);
	}

}
