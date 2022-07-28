

// Java implementation of the approach 
import java.util.*; 
class GFG 
{ 
static int __gcd(int a, int b)  
{  
    if (b == 0)  
        return a;  
    return __gcd(b, a % b);  
} 
  
// Utility function to check 
// whether two numbers is 
// co-prime or not 
static boolean coprime(int a, int b) 
{ 
    if (__gcd(a, b) == 1) 
        return true; 
    else
        return false; 
} 
  
// Utility function to check 
// whether a number is prime 
// or not 
static boolean isPrime(int n) 
{ 
    // Corner case 
    if (n <= 1) 
        return false; 
  
    if (n == 2 || n == 3) 
        return true; 
  
    // Check from 2 to sqrt(n) 
    for (int i = 2; i * i <= n; i++) 
        if (n % i == 0) 
            return false; 
  
    return true; 
} 
  
// finding the Prime numbers 
static void findNumbers(int a, int b, int n) 
{ 
    boolean possible = true; 
  
    // Checking whether given 
    // numbers are co-prime 
    // or not 
    if (!coprime(a, b)) 
        possible = false; 
  
    int c1 = 1; 
    int c2 = 1; 
  
    int num1, num2; 
  
    // To store the N primes 
    HashSet<Integer> st = new HashSet<Integer>(); 
    // If 'possible' is true 
    if (possible) 
    { 
  
        // Printing n numbers 
        // of prime 
        while ((int)st.size() != n) 
        { 
  
            // checking the form of a+nb 
            num1 = a + (c1 * b); 
            if (isPrime(num1)) 
            { 
                st.add(num1); 
            } 
            c1++; 
  
            // Checking the form of b+na 
            num2 = b + (c2 * a); 
            if (isPrime(num2))  
            { 
                st.add(num2); 
            } 
            c2++; 
        } 
  
        for (int i : st) 
            System.out.print(i + " "); 
    } 
  
    // If 'possible' is false 
    // return -1 
    else
        System.out.print("-1"); 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int a = 3; 
    int b = 5; 
    int n = 4; 
  
    findNumbers(a, b, n); 
} 
} 
  
// This code is contributed by Rajput-Ji 

