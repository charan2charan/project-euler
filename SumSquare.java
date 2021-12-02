
public class SumSquare {
	public static void main(String[] args) {
		int sum=0,sumOfSquare=0,difference=0,squareOfSum=0;
		for(int i=1;i<=100;i++)
		{
		sum=sum+i;   //1+2+3+...+100
		sumOfSquare += (i * i);   //(1*1)+(2*2)+(3*3)+....(100*100)
		}
		squareOfSum =sum*sum;  //square of sum
		difference=squareOfSum - sumOfSquare;
		System.out.println(difference);

		}
}
