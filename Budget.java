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
		System.out.printf("%.2f",totalexpenses);
		System.out.printf("Branding expense percent : %.2f%\n", (brand/totalexpenses)*100);
		System.out.printf("Travel expense percent : %.2f%\n", (travel/totalexpenses)*100);
		System.out.printf("Food expense percent : %.2f%\n", (food/totalexpenses)*100);
		System.out.printf("Logistics expense percent : %.2f%\n", (logics/totalexpenses)*100);
		
	}

}