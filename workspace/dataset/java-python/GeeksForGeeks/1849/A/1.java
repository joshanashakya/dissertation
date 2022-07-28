

// Java program to invert  
// actual bits of a number.  
import java.util.*; 
  
class GFG 
{ 
// Function to invert  
// bits of a number  
static int invertBits(int n)  
{  
    // Calculate number of bits of N-1;  
    int x = (int)(Math.log(n) /  
                  Math.log(2)) ;  
  
    int m = 1 << x;  
  
    m = m | m - 1;  
  
    n = n ^ m;  
  
    return n;  
}  
  
// Driver code  
public static void main(String[] args)  
{  
    int n = 20;  
  
    System.out.print(invertBits(n));  
} 
}  
  
// This code is contributed by Smitha 

