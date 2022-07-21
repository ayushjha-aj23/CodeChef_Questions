// Weight Balance Problem Code: WEIGHTBL

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
		    int w1 = sc.nextInt();
		    int w2 = sc.nextInt();
		    int x1 = sc.nextInt();
		    int x2 = sc.nextInt();
		    int M = sc.nextInt();
		    
		    int increase_weight = w2-w1;
		    
		    if( (increase_weight>=(x1*M)) && (increase_weight<=(x2*M)) )
		        System.out.println("1");
		    else
		        System.out.println("0");
		}
	}
}
