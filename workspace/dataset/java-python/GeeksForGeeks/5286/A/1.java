

// Java program to find sum of 
// n terms of the given series 
import java.util.*;  
  
class GFG  
{  
static int calculateSum(int n)  
{  
    // returning the final sum  
    return (n * ((int)Math.pow(n, 2) + 3 *  
                               n + 5)) / 3;  
}  
  
// Driver Code  
public static void main(String arr[])  
{  
    // number of terms to  
    // find the sum 
    int n = 25;  
    System.out.println(calculateSum(n));  
}  
}  
  
// This code is contributed  
// by Surendra_Gangwar 

