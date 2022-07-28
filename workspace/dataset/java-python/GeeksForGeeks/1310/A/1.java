

// Java program to count number of divisors 
// of N which are Fibonacci numbers 
import java.util.*; 
  
class GFG{ 
   
// Function to create hash table 
// to check Fibonacci numbers 
static void createHash( 
    HashSet<Integer> hash, int maxElement) 
{ 
    int prev = 0, curr = 1; 
    hash.add(prev); 
    hash.add(curr); 
   
    while (curr <= maxElement) { 
        int temp = curr + prev; 
        hash.add(temp); 
        prev = curr; 
        curr = temp; 
    } 
} 
   
// Function to count number of divisors 
// of N which are fibonacci numbers 
static int countFibonacciDivisors(int n) 
{ 
    HashSet<Integer> hash = new HashSet<Integer>(); 
    createHash(hash, n); 
   
    int cnt = 0; 
    for (int i = 1; i <= Math.sqrt(n); i++) { 
        if (n % i == 0) { 
   
            // If divisors are equal, 
            // check and count only one 
            if ((n / i == i) 
                && (hash.contains(n / i))) 
                cnt++; 
   
            // Otherwise check and count both 
            else { 
                if (hash.contains(n / i)) 
                    cnt++; 
                if (hash.contains(n / (n / i))) 
                    cnt++; 
            } 
        } 
    } 
    return cnt; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int n = 12; 
   
    System.out.print(countFibonacciDivisors(n));  
} 
} 
  
// This code is contributed by PrinciRaj1992 

