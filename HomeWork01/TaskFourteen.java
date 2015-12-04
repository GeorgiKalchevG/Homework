//Да се състави програма, която по въведени координати на 2 позиции от шахматната дъска извежда 
//отговор дали са оцветени в еднакъв или различен цвят. 
//Шахматната дъска е квадратна. Въвеждат се две двойки числа от интервала [1..8].

import java.util.Scanner;

public class TaskFourteen {

	public static void main(String[] args) {
		
		byte x1;
		byte x2;
		byte y1;
		byte y2;
		byte x;
		byte y;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the coordinate[1:8]");
		System.out.println("Enter the coordinates of the first position ");
		System.out.println("First coordinate of the first position");
		x1 = (byte) sc.nextInt();
		System.out.println("Second coordinate of the first position");
		y1 = (byte) sc.nextInt();
		System.out.println("Enter the coordinates of the second position");
		System.out.println("First coordinate of the second position");
		x2 = (byte) sc.nextInt();
		System.out.println("Second coordinate of the second position");
		y2 = (byte) sc.nextInt();
		
		while((x1<1||x1>8) || (x2<1||x2>8) || (y1<1||y1>8) || (y2<1||y2>8)) {
			System.out.println("Incorrect coordinates, enter new ones");
			System.out.println("Enter the coordinate[1:8]");
			System.out.println("Enter the coordinates of the first position ");
			System.out.println("First coordinate of the first position");
			x1 = (byte) sc.nextInt();
			System.out.println("Second coordinate of the first position");
			x2 = (byte) sc.nextInt();
			System.out.println("Enter the coordinates of the second position");
			System.out.println("First coordinate of the second position");
			y1 = (byte) sc.nextInt();
			System.out.println("Second coordinate of the second position");
			y2 = (byte) sc.nextInt();
		}
		
		if ((x1==x2 && y1==y2) || (x1%2==0 && x2%2==0) || (x1%2 !=0 && x2%2 != 0)) {
			x=1;
		}else {
			x=2;
		}
		if ((y1==y2 && y1==y2) || (y1%2==0 && y2%2==0) || (y1%2 !=0 && y2%2 != 0)) {
			y=1;
		}else {
			y=2;
		}
		if (x==y){
			System.out.println("The positions are with matching colours");
		}
		else {
			System.out.println("The positions are with different colours");
		}
	}
	

}
