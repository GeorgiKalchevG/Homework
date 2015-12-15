
public class StudentGroup {
	String groupSubject;
	int freeplaces;
	Student[] students = new Student[freeplaces];
	Student blank = new Student();
	StudentGroup(){
		freeplaces = 5;
		this.students = new Student[freeplaces];
		for(int i = 0;i<students.length;i++){
			
			students[i] = blank;
		}
	}
	StudentGroup(String subject){
		this();
		this.groupSubject = subject;
	}
	void addStudent(Student student){
		for(int i = 0;i<students.length;i++){
			if (student.name.equals(students[i].name)){
				System.err.println(student.name + " is already in the group");
				System.out.println("-------------------------------------------------------------------------------------------------------------");

				return;
			}
		}
		if(groupSubject.compareToIgnoreCase(student.speciality)!=0){
			System.err.println("The speciality of "+student.name +" doesn't corespond to group's subject");
			System.out.println("-------------------------------------------------------------------------------------------------------------");

			return;
		}
		if(freeplaces<0){					//&&){  //check for free place in group and if the speciality of the student is the same as the group
			System.err.println("There aren't vacant places in this group");
			System.out.println("-------------------------------------------------------------------------------------------------------------");

			return;
		}
		
		students[students.length-freeplaces]=student;				     //add student to group
		
		System.out.println("Student "+students[students.length-freeplaces].name+" added");
		System.out.println("-------------------------------------------------------------------------------------------------------------");

		freeplaces--;
		
	}
	void emptyGroup(){
		for (int i =0; i <students.length;i++){
			students[i] = blank;
		}
		freeplaces=5;
		
	}
	String beststudent(){
		int index = 0;
		for(int i =0;i<students.length;i++){
			if (students[index].grade<students[i].grade){
				index = i;
			}
		}
		return students[index].name;
	}
	void printStudentsInGroup(){
		for (int i =0; i<students.length;i++){
			if (students[i]==null)return;
			
			System.out.println((i+1)+" student info:");
			System.out.println("Name: " + students[i].name);
			System.out.println("Age: " + students[i].age);
			System.out.println("Speciality: " + students[i].speciality);
			System.out.println("Year in college: " + students[i].yearInCollege);
			System.out.println("Grade: " + students[i].grade);
			System.out.println("Money form scholarship: $"+students[i].money);
			System.out.println(students[i].isDegree?"The student has finished his education":"The student is still studying ");
			System.out.println("-------------------------------------------------------------------------------------------------------------");
		}
	}

}
