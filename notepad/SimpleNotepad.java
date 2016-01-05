package notepad;

import java.util.Scanner;

public class SimpleNotepad implements INotepad {
	Scanner scr = new Scanner(System.in);
	private Page[] notepad;

	public SimpleNotepad(int numberOfPages) {
		if(numberOfPages>0){
			this.notepad=new Page[numberOfPages];
			for(int i =0;i<numberOfPages;i++){
				notepad[i]=new Page("", "");
			}
			System.out.println("Simple notepad created!");
		}
		else{
			System.out.println("You can't create a notepad with pages less than 1");
			
		}
		
	}

	public void getPageContent(int i){
		if(checkPage(i))
		notepad[i-1].getContent();
	}
	private boolean checkPage(int i){
		if(i>0&&i<=notepad.length){
			return true;
		}
		else
		{
			System.out.println("This page doesn't exist");
			return false;
		}
		
	}
	@Override
	public void addTextToPage(int i) {		//,String title, String text
		
		if(checkPage(i)){
			System.out.println("Title:");
			String title = scr.nextLine();
			System.out.println("Text:");
			String text = scr.nextLine();
			notepad[i-1].addText(title, text);
			
		}
			
		
		
		
	}

	@Override
	public void removeAndAddTextToPage(int i) {
		deleteTextFromPageN(i);
		addTextToPage(i);
		
	}

	@Override
	public void deleteTextFromPageN(int i) {
		if(checkPage(i))
			notepad[i-1].deleteText();
		
	}

	@Override
	public void printAll() {
		for(int i=1; i<=notepad.length;i++){
			System.out.println("-"+i+"-");
			notepad[i-1].getContent();
		}
		
	}

}
