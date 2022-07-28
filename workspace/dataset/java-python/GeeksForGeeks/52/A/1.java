

// Java program for the above approach 
import java.util.*; 
  
class GFG{ 
   
// Function that returns the all the 
// distinct prime factors in a vector 
static Vector<Integer> primeFactors(int n) 
{ 
    int i, j; 
    Vector<Integer> Prime = new Vector<Integer>(); 
   
    // If n is divisible by 2 
    if (n % 2 == 0) { 
        Prime.add(2); 
    } 
   
    // Divide n till all factors of 2 
    while (n % 2 == 0) { 
        n = n / 2; 
    } 
   
    // Check for the prime numbers other 
    // than 2 
    for (i = 3; i <= Math.sqrt(n); i = i + 2) { 
   
        // Store i in Prime[] i is a 
        // factor of n 
        if (n % i == 0) { 
            Prime.add(i); 
        } 
   
        // Divide n till all factors of i 
        while (n % i == 0) { 
            n = n / i; 
        } 
    } 
   
    // If n is greter than 2, then n is 
    // prime number after n divided by 
    // all factors 
    if (n > 2) { 
        Prime.add(n); 
    } 
   
    // Returns the vector Prime 
    return Prime; 
} 
   
// Function that check whether N is the 
// product of distinct prime factors 
// or not 
static void checkDistinctPrime(int n) 
{ 
    // Returns the vector to store 
    // all the distinct prime factors 
    Vector<Integer> Prime = primeFactors(n); 
   
    // To find the product of all 
    // distinct prime factors 
    int product = 1; 
   
    // Find the product 
    for (int i : Prime) { 
        product *= i; 
    } 
   
    // If product is equals to N, 
    // print YES, else print NO 
    if (product == n) 
        System.out.print("YES"); 
    else
        System.out.print("NO"); 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    int N = 30; 
    checkDistinctPrime(N); 
} 
} 
  
// This code is contributed by sapnasingh4991 

