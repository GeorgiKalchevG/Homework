//�������� 3 ���������� �� ������������ � ��� (���������� ���), ���� ���� (����� � ������� �������), ���� ��� ����� � ����� ���.
//��������� ��������, ����� ����� ������� �� ������ �� ���� ����� �� ������� �����:
//- ��� ��� �����, ���� �� �������  
//- ��� ���� ����, �� �� ���� ���������  
//- ��� ����� � �� ���� ����� � �� ��� ���  
//- ��� ��� �����, �� ����� �� ���� � ��������  
//- ��� ���� ��-����� �� 10 ��, �� ����� �� ����.
//���������� ������� �������� ���� ��������� � ���������.
import java.util.Scanner;

public class TaskSeven {

	public static void main(String[] args) {

		byte hour;
		double money;
		boolean health;

		Scanner sc = new Scanner(System.in);

		System.out.println("Am I healthy - true/ false");
		health = sc.nextBoolean();
		if (health) {

			System.out.println("What time is it?(0-24)");
			hour = sc.nextByte();

			while (hour > 24 || hour < 0) {

				System.out.println("Invalid, please use numbers from 0 to 24!");
				hour = sc.nextByte();

			}

			if (hour > 8 && hour < 22) {
				System.out.println("how much money do I have?");
				money = sc.nextDouble();
				if (money > 10) {
					System.out.println("I am healthy and I have enough money to go to the cinema with friends!");
				} else {
					System.out.println("I am healthy and I have enough money to go out for a coffee.");
				}
			}

			else {
				System.out.println("At these hours I should probably stay home.");
			}

		} else {
			System.out.println("I'm ill and I will not go out.");
			System.out.println("What time is it?(0-24)");
			hour = sc.nextByte();

			while (hour > 24 || hour < 0) {
				System.out.println("Invalid, please use numbers form 0 to 24!");
				hour = sc.nextByte();

			}

			if (hour > 8 && hour < 22) {
				System.out.println("How much money do i have?");
				money = sc.nextDouble();
				if (money > 0) {
					System.out.println("I have money to bfalseuy medicine.");
				} else {
					System.out.println("I will stay at home and drink tea.");
				}
			}

			else {
				System.out.println("It's to late to go out");

			}
		}

	}
}
