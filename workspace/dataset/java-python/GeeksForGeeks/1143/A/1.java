

// Java program to Count of numbers 
// between 0 to M which have GCD 
// with M equals to K. 
import java.util.*; 
  
class GFG{ 
   
// Function to calculate GCD 
// using euler totient function 
static int EulerTotientFunction(int limit) 
{ 
    int copy = limit; 
   
    // Finding the prime factors of 
    // limit to calculate it's 
    // euler totient function 
    Vector<Integer> primes = new Vector<Integer>(); 
   
    for (int i = 2; i * i <= limit; i++) { 
        if (limit % i == 0) { 
            while (limit % i == 0) { 
                limit /= i; 
            } 
            primes.add(i); 
        } 
    } 
    if (limit >= 2) { 
        primes.add(limit); 
    } 
   
    // Calculating the euler totien 
    // function of (m/k) 
    int ans = copy; 
    for (int it : primes) { 
        ans = (ans / it) * (it - 1); 
    } 
    return ans; 
} 
   
// Function print the count of 
// numbers whose GCD with M 
// equals to K 
static void CountGCD(int m, int k) 
{ 
   
    if (m % k != 0) { 
        // GCD of m with any integer 
        // cannot  be equal to k 
        System.out.print(0 +"\n"); 
        return; 
    } 
   
    if (m == k) { 
        // 0 and m itself will be 
        // the only valid integers 
        System.out.print(2 +"\n"); 
        return; 
    } 
   
    // Finding the number upto which 
    // coefficient of k can come 
    int limit = m / k; 
   
    int ans = EulerTotientFunction(limit); 
   
    System.out.print(ans +"\n"); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
   
    int M = 9; 
    int K = 1; 
    CountGCD(M, K); 
   
} 
} 
  
// This code is contributed by sapnasingh4991 

