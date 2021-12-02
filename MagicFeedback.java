package runrate;


import java.util.Scanner;

public class MagicFeedback {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of people who watched show 1:");
		int show1=sc.nextInt();
		System.out.println("Enter the average rating of show 1:");
		float rating1=sc.nextFloat();
		System.out.println("Enter the number of people who watched show 2:");
		int show2=sc.nextInt();
		System.out.println("Enter the average rating of show 2:");
		float rating2=sc.nextFloat();
		System.out.println("Enter the number of people who watched show 3:");
		int show3=sc.nextInt();
		System.out.println("Enter the average rating of show 3:");
		float rating3=sc.nextFloat();
		float overall=(show1/100)*(rating1/10)+(show2/100)*(rating2/10)+(show3/100)*(rating3/10);
		System.out.println("The overall average rating of the show is : "+overall);
		
		

	}

}
