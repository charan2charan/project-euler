package day2;

import java.util.Scanner;

public class Offer {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int p1, p2, p3, total = 0, least = 0;
		double offer1 = 0, payoffera, payofferb;
		System.out.println("price of product1:");
		p1 = sc.nextInt();
		System.out.println("price of product2:");
		p2 = sc.nextInt();
		System.out.println("price of product3:");
		p3 = sc.nextInt();
		total = p1 + p2 + p3;
		offer1 = 0.2 * total;
		if (p1 < p2 && p1 < p3) {
			least = p1;
		} else if (p2 < p3) {

			least = p2;
		} else {
			least = p3;
		}

		payoffera = total - offer1;
		payofferb = total - least;
		if (payoffera < payofferb) {
			System.out.println("choose offer1");
			System.out.println("total price is"+total);
			System.out.println("offer1 price is:"+payoffera);
		} else {
			System.out.println("choose offer2");
			System.out.println("total price is"+total);
			System.out.println("offer2 price is:"+payofferb);
	
		}

	}

}