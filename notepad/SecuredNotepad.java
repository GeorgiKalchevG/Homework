package notepad;

public class SecuredNotepad extends SimpleNotepad implements ISecuredNotepad{
	String password;

	
	public SecuredNotepad(int numberOfPages) {
	
		super(numberOfPages);
		generatePass();
		
		
			
	}
	private void generatePass() {
		System.out.println("create password\n");
		String pass=scr.nextLine();
		while(pass.isEmpty()){
			System.out.println("You can't create a secure notepad without a password");
			System.out.println("create password\n");
			pass=scr.nextLine();
		
		}
			this.password=pass;
			System.out.println("Secured notepad created!");
		
	}
	public boolean checkPass(){
		System.out.println("Enter password");
		String pass=scr.nextLine();
		if(!pass.equals(this.password))
			System.out.println("Wrong password");
		return pass.equals(this.password);
	}
	/* (non-Javadoc)
	 * @see notepad.SimpleNotepad#getPageContent(int)
	 */
	@Override
	public void getPageContent(int i) {
		
		if(checkPass())
		super.getPageContent(i);
	}
	/* (non-Javadoc)
	 * @see notepad.SimpleNotepad#addTextToPage(int)
	 */
	@Override
	public void addTextToPage(int i) {
		
		if(checkPass())
		super.addTextToPage(i);
	}
	/* (non-Javadoc)
	 * @see notepad.SimpleNotepad#removeAndAddTextToPage(int)
	 */
	@Override
	public void removeAndAddTextToPage(int i) {
		
		if(checkPass())
		super.removeAndAddTextToPage(i);
	}
	/* (non-Javadoc)
	 * @see notepad.SimpleNotepad#deleteTextFromPageN(int)
	 */
	@Override
	public void deleteTextFromPageN(int i) {
		
		if(checkPass())
		super.deleteTextFromPageN(i);
	}
	/* (non-Javadoc)
	 * @see notepad.SimpleNotepad#printAll()
	 */
	@Override
	public void printAll() {
		if(checkPass())
		
		super.printAll();
	}

}
