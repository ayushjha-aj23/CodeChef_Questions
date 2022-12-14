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
		while(T-- > 0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int d = sc.nextInt();
		    int K = sc.nextInt();
		    int count = Math.abs(a-c) + Math.abs(b-d);;
		    if(K >= count){
		        if((K - count) % 2 == 0){
		            System.out.println("YES");
		        }
		        else{
		            System.out.println("NO");
		        }
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
