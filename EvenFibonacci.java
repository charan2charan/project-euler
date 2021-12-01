package com.fibonacci;

public class EvenFibonacci {

	public static void main(String[] args) {
		int num1=0,num2=1,temp=0,sum=0;
		do {
			temp=num1+num2;
			num1=num2;
			num2=temp;
			if(num2%2==0) {
				sum=sum+num2;
			}
					
		}while(num2 < 4000000);
		System.out.println(sum);

	}

}
