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
		
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
		    int N = sc.nextInt(); // No. of movies
		    int X = sc.nextInt(); // Space Remaining
		    int maxR = 0; // max rating
		    
		    while(N-- > 0)
		    {
		        int S = sc.nextInt();
		        int R = sc.nextInt();
		        
		        
		        if(S<= X && R> maxR )
		            maxR = R;

		    }
		    
		    System.out.println(maxR);
		}
	    
	}
}
