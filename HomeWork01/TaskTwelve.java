//¬исокосни години са всички години кратни на 4 с изключени€ столети€та, но без столети€ кратни на 400, т.е. 1900 не е високосна, но 1600 и 2000 са високосни.
//—ъставете програма, ко€то по дадени ден, месец, година отпечатва следващата дата.
//¬ходни данни: три числа за ден, месец, година


import java.util.Scanner;

public class TaskTwelve {

	public static void main(String[] args) {
		int day;
		int month;
		int year;
		boolean validation = true;
		Scanner sc = new Scanner(System.in);

		do {
			validation = true;
			System.out.println("Enter a date ");
			System.out.println("Year: ");
			year = sc.nextInt();

			System.out.println("Enter month: ");
			month = sc.nextInt();

			System.out.println("Enter day: ");
			day = sc.nextInt();
			if (day < 1) {
				validation = false;
			}

			day++;
			if (day > 32) {
				validation = false;
			}

			if ((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
				
				if (month == 12 && day == 32) {
					day = 1;
					month = 1;
					year++;
				}

				if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)
						&& (day == 32)) {

					day = 1;
					month++;
				} else {
					if (day > 31) {
						validation = false;
					}

					if (((month == 4 || month == 6 || month == 9 || month == 11)) && (day == 31)) {

						day = 1;
						month++;

					} else {
						if (day > 30) {
							validation = false;
						}
						if ((month == 2) && (day == 30)) {

							day = 1;
							month++;
						} 
					}
				}
			} else {
				
				if (month == 12 && day == 32) {
					day = 1;
					month = 1;
					year++;
				}
				if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && day == 32) {

					day = 1;
					month++;
				} else {
					if (day > 31) {
						validation = false;
					}

					if (((month == 4 || month == 6 || month == 9 || month == 11)) && (day == 31)) {

						day = 1;
						month++;

					} else {
						if (day > 29) {
							validation = false;
						}

						if ((month == 2) && (day == 29)) {

							day = 1;
							month++;
						} 
					}
				}
			}
			if (month <1 || month >12) {
				validation=false;
			}
			if(!validation) System.out.println("The date is invalid!");

		} while (!validation);

		System.out.println(day + "/" + month + "/" + year);

	}
}
