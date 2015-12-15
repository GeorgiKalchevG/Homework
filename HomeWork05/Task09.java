import java.util.Arrays;
import java.util.Scanner;

/*
 * Да се състави програма, чрез която по въведен низ съдържащ букви,
цифри, знак минус '-' се извежда сборът на въведените числа като се
отчита знакът '-' пред съответното число.
Вход: asd-12sdf45-56asdf100
Изход:
-12
45
-56
100
Сума = 77
 */
public class Task09 {

	public static void main(String[] args) {
		int sum = 0;
		int sign = 1;
		int numb = 0;
		int tens =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string of letters and numbers");
		String str = sc.nextLine();
		str = str.replaceAll("[^-0-9]+", " ");
		str = str.replace("-", " -");
		str = " "+str;
		System.out.println(str);
		for(int i = (str.length()-1);i>=0;i--){
			

			if(str.charAt(i)=='-'){
	    		sign = -1;
	    		continue;
			}
			
			if((int)str.charAt(i)>=48&&(int)str.charAt(i)<=57){
				
		    	numb = numb+(str.charAt(i)-48)*tens;
		    	
		    	tens = tens*10;
		    }
		    else {
		    		sum = sum+sign*numb;
		    		numb = 0;
		    		tens =1;
		    		sign = 1;
		    }
		    
		}
		System.out.println("sum= "+sum);

	}
	

}
