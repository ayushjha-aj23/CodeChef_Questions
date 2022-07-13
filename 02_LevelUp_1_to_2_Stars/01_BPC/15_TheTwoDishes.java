//The Two Dishes Problem Code: MAX_DIFF

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
		
		while(test_cases>0)
		{
		    int N = sc.nextInt();
		    int S = sc.nextInt();
		    
		   if(S<=N)
		   // Take(0, S)
		    System.out.println(S);
		   else
		   // e.g. N = 7, S = 10
		   // Extreme Pair {S-N, N} ---> {10-7, 7} ---> {3, 7}
		   // Absolute Value will be N-(S-N) ---> 7 - (10-7) ---> 4
		   // 2*N-S
		    System.out.println(2*N-S); 
		    
		    test_cases--;
		}
	}
}
