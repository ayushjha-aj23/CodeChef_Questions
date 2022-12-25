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
		int test = sc.nextInt();
		
		while(test-- > 0)
		{
		    int n = sc.nextInt();
		    long a[] = new long[n];
		    long c = 0;
		    
		    for(int i = 0; i < n; i++)
		        a[i] = sc.nextLong();
		        
		    Arrays.sort(a);
		    
		    for(int i = 1; i < n-1; i++)
		        c = Math.max(c,(a[n-1] - a[0])*a[i]);
		    
		    System.out.println(c);
		}
	}
}
