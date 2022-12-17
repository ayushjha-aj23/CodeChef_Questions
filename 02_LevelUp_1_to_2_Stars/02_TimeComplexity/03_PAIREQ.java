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
		int T = sc.nextInt();
		while(T-->0)
		{
		   int N = sc.nextInt();
		    
		   int a[]=new int[N];
		    
		   for(int i=0;i<N;i++)
		        a[i]=sc.nextInt();
		        
		   int c=0;
		   
		   for(int j=0;j<N-1;j++)
		   {
    		   int t=0;
    		   
    		  for(int k=j+1;k<N;k++)
    		  {
    		    if(j==0)
    		    {
    		        if(a[j]==a[k])
    		            c += 1;
    		    }
                else
                {
                    if(a[j]==a[k])
    		            t += 1;  
                }
		      }
    		  if(t>=c)
    		  c=t;
		    }
		  System.out.println(N-(c+1));
		}
	}
}
