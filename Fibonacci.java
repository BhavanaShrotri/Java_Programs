/******************************************************************************

                          Fibonacci Series

*******************************************************************************/

import java.util.*;

public class Fibonacci
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n=sc.nextInt();
		
		int num1=0,num2=1,sum;
		
		for(int i=0;i<=n;i++)
		{
		    System.out.print(num1+" ");
		    sum=num1+num2;
		    num1=num2;
		    num2=sum;
		}
	}
}
