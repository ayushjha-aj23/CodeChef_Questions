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
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    
		    int sum = A + B;
		    //int count_digit = countDig(sum);
		    //System.out.println(sum+" "+count_digit);
		    
		    //int result = num_of_matches();
		    
		    HashMap<Integer,Integer>map  = new HashMap<>();
		
    		map.put(0,6);
    		map.put(1,2);
    		map.put(2,5);
    		map.put(3,5);
    		map.put(4,4);
    		map.put(5,5);
    		map.put(6,6);
    		map.put(7,3);
    		map.put(8,7);
    		map.put(9,6);
    		
    		int result = 0;
    		
    		while(sum > 0){
    		    result = result + map.get(sum % 10);
    		    sum  = sum / 10;
    		}
    		
    		System.out.println(result);
		}

	
	/*// method to find the number of digits present in the number n  
    public static int countDig(int n)  
    {  
        // handling base case  
        if(n / 10 == 0)  
            return 1;  
        // recrusively finding the length of the integer n  
        return 1 + countDig(n / 10);  
    } 
    
    public static int num_of_matches()
    {
        String num = Integer.toString(sum);
        
        
    }
    
    switch(digit)
    {
        int sum = 0;
        
        case 0:
            sum += 6;
            break;
        case 1:
            sum += 2;
            break;
        case 2:
            sum += 5;
            break;
        case 3:
            sum += 5;
            break;
        case 4:
            sum += 4;
            break;
        case 5:
            sum += 5;
            break;
        case 6:
            sum += 6;
            break;
        case 7:
            sum += 3;
            break;
        case 8:
            sum += 7;
            break;
        case 9:
            sum += 6;
            break;
        default:
            sum = 0;*/
    }
}
