/*
 *  Да се състави програма, която извежда всички
естествени трицифрени числа, които нямат еднакви цифри т.е.
100,101, 606 и т.н. не се извеждат. 
 */
public class Task12 {

	public static void main(String[] args) {
		
		for(int num = 102; num<=987; num++){
			int d1 = num/100;
			int d2 = (num - d1*100)/10;
			int d3 = num - d1*100 - d2*10;
			
			if(d1==d2 || d1==d3|| d2==d3)
			{
				continue;
			}
			System.out.println(num + " ");
		}

	}

}
