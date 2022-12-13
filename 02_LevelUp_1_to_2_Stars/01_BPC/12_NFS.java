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
		    int U = sc.nextInt();
		    int V = sc.nextInt();
		    int A = sc.nextInt();
		    int S = sc.nextInt();
		    
		    boolean a = (V*V) >= (U*U)-2*A*S;
		    
		    if(a)
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		}
	}
}
