

// Java program to check Euclid Number 
import java.util.*; 
  
class GFG  
{ 
static int MAX = 10000; 
  
static HashSet<Integer> s = new HashSet<Integer>(); 
  
// Function to generate the Prime numbers 
// and store their products 
static void SieveOfEratosthenes() 
{ 
    // Create a boolean array "prime[0..n]" and  
    // initialize all entries it as true.  
    // A value in prime[i] will finally be false  
    // if i is Not a prime, else true. 
    boolean []prime = new boolean[MAX]; 
    Arrays.fill(prime, true); 
    prime[0] = false; 
    prime[1] = false; 
    for (int p = 2; p * p < MAX; p++) 
    { 
        // If prime[p] is not changed,  
        // then it is a prime 
        if (prime[p] == true)  
        { 
  
            // Update all multiples of p 
            for (int i = p * 2; i < MAX; i += p) 
                prime[i] = false; 
        } 
    } 
  
    // store prefix product of prime numbers 
    // to unordered_set 's' 
    int product = 1; 
  
    for (int p = 2; p < MAX; p++)  
    { 
        if (prime[p]) 
        { 
  
            // update product by multipying 
            // next prime 
            product = product * p; 
  
            // insert 'produc+1' to set 
            s.add(product + 1); 
        } 
    } 
} 
  
// Function to check the number for Euclid Number 
static boolean isEuclid(int n) 
{ 
  
    // Check if number exist in 
    // unordered set or not 
    // If exist, return true 
    if (s.contains(n)) 
        return true; 
    else
        return false; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    // Get the prime numbers 
    SieveOfEratosthenes(); 
  
    // Get n 
    int n = 31; 
  
    // Check if n is Euclid Number 
    if (isEuclid(n)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
  
    // Get n 
    n = 42; 
  
    // Check if n is Euclid Number 
    if (isEuclid(n)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
}  
  
// This code is contributed by PrinciRaj1992 

