package runrate;

import java.util.Scanner;

public class Days {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total salary paid");
		int salary=sc.nextInt();
		int weekend=(salary-800)/130;
		int weekdays=weekend+10;
		System.out.println("number of weekday hours is"+weekdays);
		System.out.println("number of weekend hours is"+weekend);
	}

}
