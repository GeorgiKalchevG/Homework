/*
 * Дадено е наредено тесте карти.

Наредбата по тежест на карта е: 2,3,4,5,6,7,8,9,10, Вале, Дама, 

Поп, Асо.

Наредбата по цвят на картите е: спатия, каро, купа, пика.

Да се създаде програма, чрез която се въвежда N - число от 

интервала [1..51] и се извеждат въведения номер карта и 

останалите по-големи карти от тестето.
 */

import java.util.Scanner;

public class task21 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		int card = 0;
		
		while (card<1 || card >51){
			System.out.println("Enter a card number [1:52]");
			card = sc.nextInt();
			if (card==52) System.out.println("There isn't a card stronger than Ace of spades");
			
		}
		for (int i = card; i<=52; i++){
			
			if (i==card){
				System.out.print("The seclected card is ");
			}
			if (i<5)
			{
				System.out.print("Two");
			}
			if (i>4 && i<9) {
				System.out.print("Three");
			}
			if (i>8 && i < 13) {
				System.out.print("Four");
			}
			if (i>12 && i < 17) {
				System.out.print("Five");
			}
			if (i>16 && i < 21) {
				System.out.print("Six");
			}
			if (i>20 && i < 25) {
				System.out.print("Seven");
			}
			if (i>24 && i < 29) {
				System.out.print("Eight");
			}
			if (i>28 && i < 33) {
				System.out.print("Nine");
			}
			if (i>32 && i < 37) {
				System.out.print("Ten");
			}
			if (i>36 && i < 41) {
				System.out.print("Jack");
			}
			if (i>40 && i < 45) {
				System.out.print("Queen");
			}
			if (i>44 && i < 49) {
				System.out.print("King");
			}
			if (i>48 && i < 53) {
				System.out.print("Ace");
			}
			
			switch (i){
			case 1:
			case 5:
			case 9:
			case 13:
			case 17:
			case 21:
			case 25:
			case 29:
			case 33:
			case 37:
			case 41:
			case 45:
			case 49:
				System.out.print(" of clubs");
				break;
			case 2:
			case 6:
			case 10:
			case 14:
			case 18:
			case 22:
			case 26:
			case 30:
			case 34:
			case 38:
			case 42:
			case 46:
			case 50:
				System.out.print(" of diamonds");
				break;
			case 3:
			case 7:
			case 11:
			case 15:
			case 19:
			case 23:
			case 27:
			case 31:
			case 35:
			case 39:
			case 43:
			case 47:
			case 51:
				System.out.print(" of hearts");
				break;
			default:
				System.out.print(" of spades");
				break;
			}
			if (i==card) {
				System.out.println(",");	
				System.out.println("The rest are");
			}
			else {
				if (i!=52){
					System.out.print(", ");
				}
				else{
					System.out.print(".");
				}
			}
		}

	}

}
