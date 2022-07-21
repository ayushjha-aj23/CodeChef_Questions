// Programming Languages Problem Code: PROGLANG

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
		
		while(test_cases-- >0)
		{
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int A1 = sc.nextInt();
		    int B1 = sc.nextInt();
		    int A2 = sc.nextInt();
		    int B2 = sc.nextInt();
		    
		    if( (A1==A || A1==B) && (B1==A || B1==B) )
		        System.out.println("1");
		    else if( (A2==A || A2==B) && (B2==A || B2==B) )
		        System.out.println("2");
		    else
		        System.out.println("0");
		}
	}
}
