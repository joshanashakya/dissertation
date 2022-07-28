

// Java implementation of the approach 
class GFG 
{ 
      
// Function that returns true if n is prime 
static boolean isPrime(int n) 
{ 
    // Corner cases 
    if (n <= 1) 
        return false; 
    if (n <= 3) 
        return true; 
  
    // This is checked so that we can skip 
    // middle five numbers in below loop 
    if (n % 2 == 0 || n % 3 == 0) 
        return false; 
  
    for (int i = 5; i * i <= n; i = i + 6) 
        if (n % i == 0 || n % (i + 2) == 0) 
            return false; 
  
    return true; 
} 
  
// Function that return true if the product 
// of the first n natural numbers is divisible 
// by the sum of first n natural numbers 
static boolean isDivisible(int n) 
{ 
    if (isPrime(n + 1)) 
        return false; 
    return true; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 6; 
    if (isDivisible(n)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed by Code_Mech. 

