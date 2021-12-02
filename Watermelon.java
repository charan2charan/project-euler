package day2;

import java.util.Scanner;

public class Watermelon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the watermelon weight:");
		int melon=sc.nextInt();
		if(melon%2==0) {
			System.out.println("i get" + melon/2 + "and my sibling get" + melon/2);
		}
		else
		{
			System.out.println("sorry! the watermelon weight is odd can't split");
		}
		for(int i=1;i<melon;i++) {
			System.out.println(i+ " " +(melon-i));
		}

	}

}
