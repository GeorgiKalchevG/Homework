
public class Student {
	
	String name; //student name
	String speciality; // what the student studies
	double grade; //grades of student
	byte yearInCollege; //years in college
	int age; //student age
	boolean isDegree; //has the student finnished  his education
	double money; //money from scholarship
	
	
	
	public void setGrade(double grade){
		if (grade>0&&grade<=6){
			this.grade = grade;
			
		}
		else{
			System.err.println("The value is invalid");
		}
	}
	Student(){
		grade = 4.0;
		yearInCollege = 1;
		isDegree = false;
		money = 0;
	}
	Student(String name, String speciality, int age){
		this();
		this.name = name;
		this.speciality =speciality;
		this.age = age;
		
		
		
	}
	
	void upYear(){
		if(yearInCollege<4){
			yearInCollege++;
			System.out.println(name+" is now in his "+yearInCollege+" year in college");
		}
		else{
			System.out.println(name+" has graduated");
			isDegree=true;
			
			
		}
	}
	double receiveScolarship(double min, double amount){
		if (grade>=min&&age<30){
			System.out.println(name+" is awardewed with $"+amount + " as scolarship");
			money +=amount;
		}
		else{
			System.err.println(name+"is not eligible for scolarship");
		}
		return money;
	}
	
	

}
