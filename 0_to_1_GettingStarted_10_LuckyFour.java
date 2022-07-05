// Lucky Four --- Problem Code: LUCKFOUR

// We have populated the solutions for the 10 easiest problems for your support.
// Click on the SUBMIT button to make a submission to this problem.

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++)
		{
		    int N = sc.nextInt();
		    int counter = 0;
		    
		    while(N!=0)
		    {
		        int Rem = 0;
		        
		        Rem = N%10;
		        if(Rem == 4)
		            counter++;
		        N = N/10;
		    }
		    System.out.println(counter);
		}
	    
	}
}


