// Problem Category Problem Code: PROBCAT

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
	        int x = sc.nextInt();
	        
	        if(x>=1 && x<100)
	            System.out.println("Easy");
	        else if(x>=100 && x<200)
	            System.out.println("Medium");
	        else if(x>=200 && x<=300)
	            System.out.println("Hard");
	            
	        test_cases--;
	    }
	}
}
