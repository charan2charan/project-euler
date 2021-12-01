package customers;

import java.util.Scanner;

public class Customer
{
public static void main(String[] args) {                          
@SuppressWarnings("resource")
Scanner sc = new Scanner(System.in);                              
System.out.println("date:");
int date = sc.nextInt();       
System.out.println("billno:");
int billno = sc.nextInt();
int temp=billno%10;
int temp1=billno%100;
if(date<=9 )
{
   if(date==temp && billno%date==0)
   {
       System.out.println("lucky customers");
   }
   else{
   System.out.println("unlucky customers");
   }
}
else if((date>9 || date<=31))
{
   if(date == temp1 && billno%date==0)
   {
       System.out.println("lucky customers");
   }
   else{
   System.out.println("unlucky customers");
   }
}

else{
   System.out.println("unlucky customers");
}
}
}

