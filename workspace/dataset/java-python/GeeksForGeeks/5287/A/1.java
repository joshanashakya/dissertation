

// Java program to find sum of  
// first n terms of the given series 
import java.util.*; 
  
class GFG 
{ 
static int calculateSum(int n) 
{ 
    // when n is odd 
    if (n % 2 == 1) 
        return (n + 1) / 2; 
  
    // when n is not odd 
    return -n / 2; 
} 
  
// Driver code 
public static void main(String ar[]) 
{ 
  
// no. of terms to find the sum 
int n = 8; 
System.out.println(calculateSum(n)); 
} 
} 

