import java.util.Scanner;

/*
 * Да се състави програма, чрез която се въвеждат два низа съдържащи
до 40 главни и малки букви.
Като резултат на екрана да се извеждат низовете само с главни и само
с малки букви.
Пример: Abcd Efgh
Изход: ABCD abcd EFGH efgh
 */
public class Task01 {

	public static void main(String[] args) {
		
		//read the string from the console
		System.out.println("Enter two strings of up to 40 alphabetic characters");
		System.out.println("Enter the first string ");
		String one = readString();
		System.out.println("Enter the second string ");
		String two = readString();
		
		
		//print the new upper and lower case strings 
		System.out.println(one.toUpperCase()+ " " + one.toLowerCase() + " " + two.toUpperCase() +" " +two.toLowerCase());

	}
	static String readString(){
		
		Scanner sc = new Scanner(System.in);
		String word =""; 
		boolean isChar = true;		
		do{ 
			word = sc.nextLine();
			
			if (word.length()<1||word.length()>40){
				isChar = false;
				System.out.println(word.length() == 0 ? "You haven't entered a string":"String is too long, try again");
				continue;
			}
			else {
				isChar = true;
			}
		
			
			for (int i=0; i<word.length();i++){
				if (word.charAt(i)<65||word.charAt(i)>122||(word.charAt(i)>90&word.charAt(i)<97)){
					isChar=false;
					System.out.println("The string must containg only alphabetic characters, try again");
					break;
				}
				else {
					isChar = true;
				}
						
			}
			
			
		}while (isChar ==false );
		return word;
		
	}

}
