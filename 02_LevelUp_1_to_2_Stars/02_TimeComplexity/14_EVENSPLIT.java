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
		Scanner sc=new Scanner(System.in);
		
		int t= sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    String s=sc.next();
		   
		    if(n>2)
		    {
    		    int zero=0;
    		    StringBuilder ans=new StringBuilder();
    		    int one=0;
		        for(int i=0;i<n;i++)
		        {
		            if(s.charAt(i)=='0')
		                zero++;
		            else
		                one++;
		        }
		         
    		    while(zero>0)
    		    {
    		        ans.append("0");
    		        zero--;
    		    }
		    
    		    while(one>0)
    		    {
    		        ans.append("1");
    		        one--;
    		    }
    		    
    		    System.out.println(ans);
    		        
    		    }
    		else
		        System.out.println(s);
		   
		}
	}
}
