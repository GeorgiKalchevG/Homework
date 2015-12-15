import java.util.Scanner;

/*
 * Да се състави програма, чрез която по въведени трите имена на двама
човека разделени със запетая, се извежда чие име има по-голям сбор
от ASCII кодовете на съставящите името букви.
Пример: Anna Dosewa Asenowa, Iwo Peew Peew
Изход: Anna Dosewa Asenowa
 */
public class Task04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two names separated by comma ");
		String names = sc.nextLine();
		
		int count = 0;
		int sizeOne = 0;
		int sizeTwo = 0;
		boolean comma = false;
		for (int i = 0; i<names.length();i++){
			if (names.charAt(i)==','){
				comma = true;
				count = i+1;
				continue;
			}
			if (comma == false){
				sizeOne  = sizeOne + (int)names.charAt(i);
			}
			else{
				if(names.charAt(i-1)==','&&names.charAt(i)==' ') {
					continue;
				}
				
				sizeTwo = sizeTwo +(int)names.charAt(i);
			}
		}
		
		
		if (sizeOne>sizeTwo){	
			for (int i = 0;i<count-1;i++){
				System.out.print(names.charAt(i));
			}
		}
		if (sizeOne<sizeTwo){
			if (names.charAt(count)==' '){
				count +=1;
			}
				for (int i = count;i<names.length();i++){
					System.out.print(names.charAt(i));
				}
			}
		if(sizeOne==sizeTwo){
				System.out.println(names + " have equal sum of characters");
			}
		
		
		
		
		
	}

}
