/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef

	{
		// your code goes here
		    static int printDistinct(int arr[], int n)
    {
        int count =0;
        Arrays.sort(arr);
     
        for (int i = 0; i < n; i++)
        {
            while (i < n - 1 && arr[i] == arr[i + 1]){
                i++;
            }
            count++;
        }
        System.out.println();
        return count;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
		while(t-- != 0){
		    int n,x;
		    n=sc.nextInt();
		    x=sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		int k = printDistinct(arr, n);
		int ans =  ( k < n-x ) ? k : n-x ;
		System.out.print(ans);
		    
		}
	}
}
