import java.util.Scanner;

/*
 * Въведете число N чрез конзолата и изкарайте като
резултат следния триъгълник с височина N:
 */
public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rolls = 0;
		int sel = 0;
		while (rolls<1){
			System.out.println("Enter the rolls of the triangle(must be a positive number): "); 
			rolls = sc.nextInt();
			
		}	
	
		while (sel<1 || sel>2 )
		{
			System.out.println("For filled triandle enter 1, for empty enter 2");
			sel = sc.nextInt();
		}
		for(int i = 1; i<=rolls; i++)
		{
			for (int s=1; s<=rolls-i;s++)
			{
				System.out.print(" ");			
			}
			for (int j=1 ; j<=2*i-1; j++)
			{
				if (sel==1){
				System.out.print("*");
				}
				else {
					if(j==1 || j==2*i-1 || i==rolls){
						System.out.print("*");
					}
					else
					System.out.print(" ");
				}
			}
				
			System.out.println("");
		}

	}

}
