

// Java program to check if difference 
// of areas of two sqaures is prime or  
// not when side length is large 
class GFG 
{ 
      
// Function to check if number  
// is prime 
static boolean isPrime(long n) 
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
  
    for (long i = 5; i * i <= n; i = i + 6) 
        if (n % i == 0 || n % (i + 2) == 0) 
            return false; 
  
    return true; 
} 
  
// Function to check if difference  
// of areas of square is prime 
static boolean isDiffPrime(long a, long b) 
{ 
    // when a+b is prime and a-b is 1 
    if (isPrime(a + b) && a - b == 1) 
        return true; 
    else
        return false; 
} 
  
// Driver code 
public static void main(String []args) 
{ 
    long a = 6, b = 5; 
  
    if (isDiffPrime(a, b)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed by ihritik 

