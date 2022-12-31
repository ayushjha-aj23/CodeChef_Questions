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
		
		while(t-->0){
		    int M = sc.nextInt();
		    int N = sc.nextInt();
		    int[] arr = new int[M];
		    int[] neg = new int[M];
		    int sum = 0;
		    
		    for(int i=0;i<M;i++)
		    {
		        arr[i] = sc.nextInt();
		        if(arr[i]<0)
		            neg[i] = arr[i];
		        else
		            sum+=arr[i];
		    }
		    
		    Arrays.sort(neg);
		    
		    for(int i=0;i<N;i++)
		        sum+=(-1)*neg[i];
		        
		    System.out.println(sum);
		}
	}
}
