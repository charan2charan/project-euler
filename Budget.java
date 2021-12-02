package runrate;

import java.util.Scanner;

public class Budget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter branding expenses");
		double brand=sc.nextDouble();
		System.out.println("enter travel expenses");
		double travel=sc.nextDouble();
		System.out.println("enter food expenses");
		double food=sc.nextDouble();
		System.out.println("enter logistics expenses");
		double logics=sc.nextDouble();
		System.out.println("totalexpenses:");
		double totalexpenses=brand+travel+food+logics;
		System.out.println(String.format("Total Expenses : Rs. %.2f", totalexpenses));
		System.out.println(String.format("Branding expense percent : %.2f%%", (brand/totalexpenses)*100));
		System.out.println(String.format("Travel expense percent : %.2f%%", (travel/totalexpenses)*100));
		System.out.println(String.format("Food expense percent : %.2f%%", (food/totalexpenses)*100));
		System.out.println(String.format("Logistics expense percent : %.2f%%", (logics/totalexpenses)*100));

		
	}

}