package notepad;

public class Page {
	private String title;
	private String text;
	public Page(String title, String text) {
//		if(title!=null&&text!=null){
			this.title = title;
			this.text = text;
	
//		}
//		System.out.println("The page must have title and text");
	}
	public void deleteText(){
		this.text = "";
		this.title="";
	}
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	
	
	
	public void addText(String title,String text) {
		if(text!=null)
			this.title = this.title+" "+title;
			this.text = this.text+" "+text;
		
	}
	public void getContent() {
		System.out.println(title);
		System.out.println(text);
	
		
	}
	public void searchWord(String word){
		if(this.title.contains(word){
			System.out.println(word+" is in the title");
		}
		else{
			System.out.println(word+" is NOT in the title");
		}
			if(this.text.contains(word){
			System.out.println(word+" is in the text");
		}
		else{
			System.out.println(word+" is NOT in the text");
		}
	}
	public boolean containsDigits(){
		return this.title.matches(".*\\d+.*");
		
	}

}
