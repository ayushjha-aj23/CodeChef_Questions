// ATM --- Problem Code: HS08TEST

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt(); // Withdrawal Amount  
        float y = sc.nextFloat(); // Total Amount
       // float z = sc.nextFloat(); // Amount left
        
        if(y>=(x+0.50F) && x%5==0)
        System.out.println(String.format("%.2f", y-x-0.50F));
        
        else{
            System.out.println(String.format("%.2f",y));
        }
        
    }
}

