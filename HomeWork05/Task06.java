import java.util.Scanner;



/**
 * Да се състави програма, чрез която се въвежда изречение с отделни
думи.
Като резултат на екрана да се извежда същия текст, но всяка отделна
дума да започва с главна буква, а следващите я букви да са малки.
Пример: супер яката задача
Изход: Супер Яката Задача

 *
 */
public class Task06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a sentance");
		String sentance = sc.nextLine();
		for(int i =0 ;i<sentance.length();i++){
			
			if (i==0){
				sentance= sentance.substring(i, i+1).toUpperCase()+sentance.substring(i+1,sentance.length()).toLowerCase(); 
								
			}
			if (sentance.charAt(i)==' ' &&i+1>=sentance.length()){
				break;
			}
			if (sentance.charAt(i)==' '){
				sentance = sentance.substring(0, i)+' '+ sentance.substring(i+1, i+2).toUpperCase() + sentance.substring(i+2, sentance.length()).toLowerCase();
			}
		}
		System.out.println(sentance);

	}

}
