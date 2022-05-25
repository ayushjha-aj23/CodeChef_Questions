// First and Last Digit --- Problem Code: FLOW004

// We have populated the solutions for the 10 easiest problems for your support.
// Click on the SUBMIT button to make a submission to this problem.

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc = new Scanner(System.in);
	  
	  int t = sc.nextInt();
	  
	  while(t>0)
	  {
	      int n = sc.nextInt();
	      int temp = n;
	      int count = 0;
	      
	      while(temp!=0)
	      {
	          temp = temp/10;
	          count++;
	      }
	      
	      int first_digit = n / (int) Math.pow(10, count-1);
	      int last_digit = n%10;
	      
	      //System.out.println(count);
	      //System.out.println(first_digit);
	      //System.out.println(last_digit);
	      System.out.println(first_digit+last_digit);
	      
	      t--;
	  }
	}
}


