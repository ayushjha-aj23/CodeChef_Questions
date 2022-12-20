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
		int t, n, arr[];
		
		t = sc.nextInt();
		while (t-->0)
		{
		    int position=0,max_position=0;
		    n = sc.nextInt();
		    arr = new int[n];
		    
		    for (int i=0;i<n;i++)
		        arr[i] = sc.nextInt();
		    
		    for (int i=1;i<=7;i++ )
		    {
		        for(int j=position;j<n;j++)
		        {
		            if(i == arr[j]){
		                position = j;
		                //System.out.println(position);
		            }
		        }
		        if (max_position<position)
		        max_position = position;
		    }
		    System.out.println(max_position+1);
		} 
	}
}
