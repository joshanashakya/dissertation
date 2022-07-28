

// Java program to Sum of all second largest 
// divisors after splitting a number into one or more parts 
import java.io.*; 
   
class GFG { 
   
   
   
// Function to find a number is prime or not 
static boolean prime(int n) 
{ 
    if (n == 1) 
        return false; 
   
    // If there is any divisor 
    for (int i = 2; i * i <= n; ++i) 
        if (n % i == 0) 
            return false; 
   
    return true; 
} 
   
// Function to find the sum of all second largest divisor 
// after splitting a number into one or more parts 
static int Min_Sum(int n) 
{ 
    // If number is prime 
    if (prime(n)) 
        return 1; 
   
    // If n is even 
    if (n % 2 == 0) 
        return 2; 
   
    // If the number is odd 
    else { 
   
        // If N-2 is prime 
        if (prime(n - 2)) 
            return 2; 
   
        // There exists 3 primes x1, x2, x3 
        // such that x1 + x2 + x3 = n 
        else
            return 3; 
    } 
} 
   
// Driver code 
   
   
    public static void main (String[] args) { 
    int n = 27; 
   
    // Function call 
    System.out.println( Min_Sum(n)); 
    } 
} 
  
// This code is contributed by anuj_6 

