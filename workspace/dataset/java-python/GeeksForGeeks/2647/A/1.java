

// Java implementation of the approach 
class GFG  
{ 
  
// Function to return the nth Fibonacci number 
static int fib(int n) 
{ 
    double phi = (1 + Math.sqrt(5)) / 2; 
    return (int) Math.round(Math.pow(phi, n) / Math.sqrt(5)); 
} 
  
// Function to return the required sum 
static int calculateSum(int l, int r) 
{ 
  
    // Using our deduced result 
    int sum = fib(r + 2) - fib(l + 1); 
    return sum; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int l = 4, r = 8; 
    System.out.println(calculateSum(l, r)); 
  
} 
} 
  
// This code is contributed by 29AjayKumar 

