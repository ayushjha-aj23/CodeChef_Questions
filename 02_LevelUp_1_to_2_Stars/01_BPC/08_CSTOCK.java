// Chef and Stock Prices Problem Code: CSTOCK

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		
		int test_cases = sc.nextInt();
		
		while(test_cases-- > 0)
		{
		    int S = sc.nextInt();
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    
		    float changed_price=0.0F;
		    
		    changed_price = S * (100+C);
		       
		    if( (changed_price>=A*100) && (changed_price<=B*100) )
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		}
	}
}
