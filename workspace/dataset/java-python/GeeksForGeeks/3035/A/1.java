

// Java program to find power of 
// a prime number 'r' in n! 
  
class GFG { 
      
// Function to return power of a 
// no. 'r' in factorial of n 
static int power(int n, int r) { 
      
    // Keep dividing n by powers of 
    // 'r' and update count 
    int count = 0; 
    for (int i = r; (n / i) >= 1; i = i * r) 
    count += n / i; 
    return count; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int n = 6, r = 3; 
    System.out.print(power(n, r)); 
} 
} 
  
// This code is contributed by Anant Agarwal. 

