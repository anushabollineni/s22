import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
Scanner sc=new Scanner(System.in);
		int Num1, Num2, i, GCD = 0;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the First Integer Value : ");
		Num1 = sc.nextInt();	
		
		System.out.print(" Please Enter the Second Integer Value : ");
		Num2 = sc.nextInt();
		
		for(i = 1; i <= Num1 && i <= Num2; i++)
	    {
	        if(Num1 % i == 0 && Num2 % i == 0)
	        {
	            GCD = i;
	        }
	    }	
		System.out.println("\n GCD of " + Num1 + " and " + Num2 + "  =  " + GCD);
	}
}
	
