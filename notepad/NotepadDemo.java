package notepad;

import java.util.Scanner;

public class NotepadDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = 0;
		int page=0;
		int type =0;
		int numberOfPages = 0; 
		SimpleNotepad pad = null;
		
		while(type==0){
			System.out.println("What type of notepad do you want to create:");
			System.out.println("1 Simple");
			System.out.println("2 Secured");
			type = sc.nextInt();
			if(type==1||type==2){
				
				while(numberOfPages<=0){
					System.out.println("How many pages do you want");
					numberOfPages = sc.nextInt();
				}
			}
			else{
				System.out.println("try again");
				type=0;
			}
		}
		
		switch (type){
		case 1:
			pad = new SimpleNotepad(numberOfPages);
			break;
		
		case 2:
			
			
			pad = new SecuredNotepad(numberOfPages);
			break;
		}
			
		while(loop==0){
			System.out.println("0 Exit");
			System.out.println("1 Add text to page");
			System.out.println("2 Add text to page after removing the existing");
			System.out.println("3 Delete text form page");
			System.out.println("4 Print notepad content");
		
			int select = sc.nextInt();
			switch(select){
			case 0:
				loop = 1;
				break;
			case 1:
				System.out.println("Select a page");
				page = sc.nextInt();
				pad.addTextToPage(page);
				break;
			case 2:
				System.out.println("Select a page");
				page = sc.nextInt();
				pad.removeAndAddTextToPage(page);
				break;
			
			case 3:
				System.out.println("Select a page");
				page = sc.nextInt();
				pad.deleteTextFromPageN(page);
				break;
			case 4:
				pad.printAll();
				break;
			default:
				System.out.println("Please select something from the menu");
				
			}	
				
			}
			
			
			
		

	}

}
