

// Java Implementation to find Nth digit 
// from right in base B 
import java.util.*; 
  
class GFG 
{ 
  
// Function to compute Nth digit 
// from right in base B 
static int nthDigit(int a, int n, int b) 
{ 
  
    // Skip N-1 Digits in Base B 
    for (int i = 1; i < n; i++) 
        a = a / b; 
  
    // Nth Digit from right in Base B 
    return a % b; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int a = 100; 
    int n = 3; 
    int b = 4; 
    System.out.print(nthDigit(a, n, b)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

