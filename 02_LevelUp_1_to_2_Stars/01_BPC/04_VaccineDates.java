// Vaccine Dates Problem Code: VDATES

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
		    int D = sc.nextInt();
		    int L = sc.nextInt();
		    int R = sc.nextInt();
		    
		    if(D<L)
		        System.out.println("Too Early");
		    else if (D>R)
		        System.out.println("Too Late");
		    else
		        System.out.println("Take second dose now");
		}
	}
}
