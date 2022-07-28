

// Java program for 
// above approach 
import java.io.*; 
  
class GFG 
{ 
static void Divide(int a, int b) 
{ 
    long dividend = (long)a; 
    long divisor = (long)b; 
  
    // Calculate sign of divisor i.e., 
    // sign will be negative only if 
    // either one of them is negative 
    // otherwise it will be positive 
  
    long sign = (dividend < 0) ^  
                (divisor < 0) ? -1 : 1; 
  
    // Remove signs of  
    // dividend and divisor 
    dividend = Math.abs(dividend); 
    divisor = Math.abs(divisor); 
  
    // Zero division Exception. 
    if (divisor == 0) 
    { 
        System.out.println("Cannot Divide by 0"); 
        return; 
    } 
  
    if (dividend == 0)  
    { 
        System.out.println(a + " / " + b +  
                            " is equal to : " + 0); 
        return; 
    } 
  
    if (divisor == 1)  
    { 
        System.out.println(a + " / " + b +  
                           " is equal to : " +  
                             sign * dividend); 
        return; 
    } 
  
    // Using Formula 
    // derived above. 
    System.out.println(a + " / " + b + " is equal to : " +  
                                         Math.floor(sign *  
                            (Math.exp(Math.log(dividend) -  
                             Math.log(divisor))))); 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
int a = 10, b = 5; 
  
Divide(a, b); 
  
a = 49; b = -7; 
Divide(a, b); 
} 
} 
  
// This code is contributed 
// by shiv_bhakt. 

