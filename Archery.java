package day2;

import java.util.Scanner;

public class Archery {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
		int points=0,target=100;
		for(int i=1;i<=target;i++) {
			System.out.println("Enter the points scored in turn "+i);
			int turn=sc.nextInt();
			points+=turn;
			if(points>=target) {
				System.out.println("total points scored:"+points);
				System.out.println("No of turns :"+i);
				break;
			}
			
		}


	}

  }
