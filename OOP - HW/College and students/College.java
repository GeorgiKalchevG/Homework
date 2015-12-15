
public class College {

	public static void main(String[] args) {
		final double MIN = 4.5;
		Student a111301 = new Student("Iron Man","Engineering",19);
		Student a111302 = new Student("Bruce Banner","Engineering",31);
		Student a111303 = new Student("Jarvis","Engineering",20);
		Student a111304 = new Student("Helen Cho","Engineering",19);
		Student a111305 = new Student("Justin Hammer","Engineering",20);
		
		Student a111306 = new Student("Natasha Romanoff","Politics",19);
		Student a111307 = new Student("Nick Fury","Politics",21);
		Student a111308 = new Student("Pepper Potts","Politics",20);
		Student a111309 = new Student("Steve Rogers","Politics",19);
		Student a111310 = new Student("Ultron","Politics",20);
		
		Student a111311 = new Student("Peter Quill","Guardians of the Galaxy",19);
		Student a111312 = new Student("Gamora","Guardians of the Galaxy",21);
		Student a111313 = new Student("Drax","Guardians of the Galaxy",20);
		Student a111314 = new Student("Groot","Guardians of the Galaxy",19);
		Student a111315 = new Student("Rocket","Guardians of the Galaxy",20);
		
		StudentGroup politics = new StudentGroup("Politics");
		StudentGroup guardians = new StudentGroup("Guardians of the Galaxy");
		StudentGroup avengers = new StudentGroup("Engineering");
		
		
		politics.addStudent(a111301);	
		guardians.addStudent(a111311);
		guardians.addStudent(a111315);
		guardians.addStudent(a111314);
		guardians.addStudent(a111313);
		guardians.addStudent(a111312);
		
		avengers.addStudent(a111301);
		avengers.printStudentsInGroup();
		politics.addStudent(a111306);
		politics.addStudent(a111307);
		politics.addStudent(a111308);
		politics.addStudent(a111309);
		politics.addStudent(a111309);
		politics.addStudent(a111310);
		politics.printStudentsInGroup();
		
		
		avengers.addStudent(a111301);
		avengers.addStudent(a111302);
		avengers.addStudent(a111303);
		avengers.addStudent(a111304);
		avengers.addStudent(a111305);
		
		a111311.setGrade(5.5);
		a111312.setGrade(2.5);
		a111313.setGrade(1.5);
		a111314.setGrade(2.5);
		a111315.setGrade(3.5);
		a111301.upYear();
		a111301.receiveScolarship(MIN, 25.5);
		a111302.receiveScolarship(MIN, 50.25);
		a111311.receiveScolarship(MIN, 500);
		a111301.upYear();
		a111301.upYear();
		a111301.upYear();
		a111301.upYear();
		avengers.printStudentsInGroup();
		
		
		System.out.println(guardians.beststudent()+" is the best student in "+guardians.groupSubject);
		guardians.printStudentsInGroup();
		guardians.emptyGroup();
		guardians.printStudentsInGroup();

		

	}

}
