

// A Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
// Function to return num % divisor 
// without using % (modulo) operator 
static int getRemainder(int num, int divisor) 
{ 
  
    // While divisor is smaller 
    // than n, keep subtracting 
    // it from num 
    while (num >= divisor) 
        num -= divisor; 
  
    return num; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int num = 100, divisor = 7; 
    System.out.println(getRemainder(num, divisor)); 
} 
} 
  
// This code is contributed by Princi Singh 

