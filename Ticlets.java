package runrate;

import java.util.Scanner;

public class Ticlets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int rate,rate1,rate2,rate3,rate4,rate5,rate6;
		rate=sc.nextInt();
		rate1=rate/100; //2
		rate=rate%100; //42
		rate2=rate/50; //0
		rate=rate%50;  //42
		rate3=rate/10; //4
		rate=rate%10;  //2
		rate4=rate/5;  //0
		rate=rate%5;   //2
 		rate5=rate/2; //1
		rate=rate%2;  //0
		rate6=rate;  //0
	    int sum=rate1+rate2+rate3+rate4+rate5+rate6;
	    System.out.println(sum);
	}

}
