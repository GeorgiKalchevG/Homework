import java.util.Scanner;

/*
 * Да се състави програма, чрез която от клавиатурата се въвеждат
последователно две думи с дължина 10-20 знака.
Програмата да размени първите им 5 знака и да изведе дължината на
по-дългата, както и новото им съдържание.
Пример: uchilishe uchenik
Изход: 9 uchenishe

 */
public class Task02 {

	public static void main(String[] args) {
		System.out.println("Enter the first word");
		String one = readWord();
		System.out.println("Enter the second word");
		String two  = readWord();
		String changed = changeFirstFive(one,two);
		System.out.println(changed);
		System.out.println(changed.length());

	}
	static String readWord(){
		
		Scanner sc = new Scanner(System.in);
		String word = "";
		boolean isWord = false;
		while (isWord == false){
			 word = sc.nextLine();
			 if (word.length()<6){
				 System.out.println("Word to short");
				 continue;
				 
			 }
			 
			 for (int i=0; i<word.length();i++){
					if (word.charAt(i)<65||word.charAt(i)>122||(word.charAt(i)>90&word.charAt(i)<97)){
						isWord=false;
						System.out.println("The string must containg only alphabetic characters, try again");
						break;
					}
					else {
						isWord = true;
					}
			 }
		}
		return word;
	}
	static String changeFirstFive(String a,String b){
		String c = "";
		
		if (a.length()>=b.length()){
			c = b.substring(0,5) +a.substring(5);
		}
		else{
			c = a.substring(0, 5)+ b.substring(5);
		}
		return c;
	}

}
