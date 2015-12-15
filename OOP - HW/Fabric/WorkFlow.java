
public class WorkFlow {

	public static void main(String[] args) {
		Employee richard = new Employee("Hammond");
		Employee jeramy = new Employee("Clarkson");
		Employee james = new Employee("May");
		
		Task shootFastLap = new Task("McLaren Fast Lap",12);
		Task review = new Task("Review for LaFerrari", 20);
		Task news = new Task("Do the news report", 7);
		Task interview = new Task("Star in a reasonably priced car",4);
		
		
		richard.currentTask = shootFastLap;
		jeramy.currentTask = review;
		james.currentTask = news;
		jeramy.currentTask = interview;
		richard.showReport();
		System.out.println();
		jeramy.showReport();
		System.out.println();
		james.showReport();
		System.out.println();
		richard.work();
		jeramy.work();
		james.work();
		richard.showReport();
		System.out.println();
		jeramy.showReport();
		System.out.println();
		james.showReport();
		System.out.println();
		richard.work();
		jeramy.work();
		james.work();
		richard.showReport();
		System.out.println();
		jeramy.showReport();
		System.out.println();
		james.showReport();
		System.out.println();
		richard.work();
		jeramy.work();
		james.work();
		richard.showReport();
		System.out.println();
		jeramy.showReport();
		System.out.println();
		james.showReport();
		System.out.println();

	}

}
