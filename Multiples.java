package com.multiples;

public class Multiples {

	public static void main(String[] args) {
	      int sum=0,i;
	      for(i=0;i<1000;i++) {
	    	  if(i%5==0||i%3==0) {
	    		  sum=sum+i;
	    	  }
	      }
	      System.out.println(sum);

	}

}
