

// Java program for above approach 
import java.util.*; 
  
class GFG  
{ 
static int MAX = 100005; 
  
// Find all prime numbers 
static Vector<Integer> addPrimes() 
{ 
    int n = MAX; 
  
    boolean []prime = new boolean[n + 1]; 
    Arrays.fill(prime, true); 
  
    for (int p = 2; p * p <= n; p++)  
    { 
        if (prime[p] == true)  
        { 
            for (int i = p * p; i <= n; i += p) 
                prime[i] = false; 
        } 
    } 
    Vector<Integer> ans = new Vector<Integer>(); 
      
    // Store all prime numbers 
    for (int p = 2; p <= n; p++) 
        if (prime[p]) 
            ans.add(p); 
  
    return ans; 
} 
  
// Function to check if a digit 
// is odd prime or not 
static boolean is_prime(int n)  
{ 
    return (n == 3 || n == 5 || n == 7); 
} 
  
// Function to find sum 
static int find_Sum(int n)  
{ 
    // To store required answer 
    int sum = 0; 
      
    // Get all prime numbers 
    Vector<Integer> v = addPrimes(); 
      
    // Traverse through all the prime numbers 
    for (int i = 0; i < v.size() && n > 0; i++)  
    { 
        // Flag stores 1 if a number does  
        // not contain any odd primes 
        int flag = 1; 
        int a = v.get(i); 
          
        // Find all digits of a number 
        while (a != 0) 
        { 
            int d = a % 10; 
            a = a / 10; 
            if (is_prime(d)) 
            { 
                flag = 0; 
                break; 
            } 
        } 
          
        // If number does not contain 
        // any odd primes 
        if (flag == 1)  
        { 
            n--; 
            sum = sum + v.get(i); 
        } 
    } 
  
    // Return the required answer 
    return sum; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int n = 7; 
      
    // Function call 
    System.out.println(find_Sum(n));  
} 
} 
  
// This code is contributed by 29AjayKumar 

