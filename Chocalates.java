package day2;

import java.util.Scanner;

public class Chocalates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of chocolates");
		int chocolate=sc.nextInt();
		System.out.println("enter number of childrens");
		int children=sc.nextInt();
		for(int i=1;i<=children;i++) {
			if(chocolate>=i) {
				chocolate=chocolate-i;
				a++;
			}
		}
		System.out.println("chocolate remaining:"+chocolate);
		System.out.println("childrens who got chocolate:"+a);

	}

}
