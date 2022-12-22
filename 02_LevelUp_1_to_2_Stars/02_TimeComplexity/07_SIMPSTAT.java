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
		    int N = sc.nextInt();
		    int K = sc.nextInt();
		    
		    int []a = new int[N];
		    int sum = 0;
		    
		    for(int i=0;i<N;i++)
		    {
		        a[i] = sc.nextInt();
		        sum += a[i];
		    }
		    
		    if(K==0)
		        System.out.println((1.0*sum)/N);
		    else
		    {
		        Arrays.sort(a);
		        
		        for(int i=0;i<K;i++)
		        {
		            sum -= a[i];
		            sum -= a[N-i-1];
		        }

		        System.out.println((1.0*sum)/(N-2*K));

		    }
		    
		}
	}
}
