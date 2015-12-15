import java.util.Scanner;

/*
 * Да се състави програма, чрез която се въвеждат последователно две
редици от символи без интервали.
Програмата да извежда съобщение за резултата от сравнението им по
позиции.
Пример: хипопотам, хипопотук
Изход:
Двата низа са с равна дължина.
Разлика по позиции:
8 а-у
9 м-к
 */
public class Task03 {

	public static void main(String[] args) {
		System.out.println("Enter the first string");
		String one  = getString();
		System.out.println("Enter the second string");
		String two  = getString();
		compareStrings(one,two);
		System.out.println(one + " " + two);

	}
	static String getString(){
		Scanner sc = new Scanner(System.in);
		String str = "";
		boolean noSpace=false;
		while (noSpace == false){
			str = sc.nextLine();
			for (int i = 0; i <str.length();i++){
				if (str.charAt(i) == ' '){
					System.out.println("The string contains empty space");
					System.out.println("Enter new string");
					noSpace = false;
					break;
				}
				else{
					noSpace = true;
				}
			}
		}
				
		
		return str;
	}
	static void compareStrings(String a, String b){
		int length = 0;
		boolean hasDifference = false; 
		if (a.length()==b.length()){
			
			
			System.out.println("Difference in positions");
			for(int i = 0; i <a.length();i++){
				
			
				if(a.charAt(i)!=b.charAt(i)){
					System.out.println((i+1) + " " +a.charAt(i) +" - " + b.charAt(i));
					hasDifference = true;
				}
			}
		}
		else{
			System.out.println("Difference in positions until the end of the shorter string");
			if (a.length()>b.length()){
				length = b.length();
			}else length = a.length();
			for (int i = 0; i<length;i++){
				if(a.charAt(i)!=b.charAt(i)){
					System.out.println((i+1) + " " +  a.charAt(i) +" - " + b.charAt(i));
					hasDifference = true;
				}
			}
			
		}
		if (!hasDifference){
			System.out.println("No difference");
		}
	}
}
