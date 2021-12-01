package runrate;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); 
       System.out.println("enter total number of overs");
	   int overs=sc.nextInt();
	   System.out.println("enter target runs:");
	   int runs=sc.nextInt();
	   System.out.println("enter overs bowled");
	   int over=sc.nextInt();
	   System.out.println("enter runs scored:");
	   int run=sc.nextInt();
	   System.out.println("current run rate:");
	   float runrate=run/over;
	   System.out.println(runrate);
	   System.out.println("run rate required after 10 overs:");
	   float runratereq=(float)(runs-run)/(overs-over);
	   System.out.printf("%.2f\n",runratereq);
	   
	   
	}

}
