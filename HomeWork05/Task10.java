import java.util.Scanner;

/*
 * Да се състави програма, която по даден низ връща друг,
символите, на който са получени като към всеки код на символ
от ASCII таблицата е добавеното числото 5 и е записан
новополучения символ.
Пример :
Вход: Hello
Изход: Mjqqt
 */
public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		StringBuilder builder = new StringBuilder();
		for (int i =0; i<str.length();i++){
			builder.insert(i, (char)((int)str.charAt(i)+5))  ;
		}
		System.out.println(builder);

	}

}
