

// Java program to count number of 
// divisors of n^2 which are not 
// divisible by divisor of n 
import java.util.*; 
  
class GFG  
{ 
  
// Function to count divisors of n^2 
// having no factors of 'n' 
static int factors(int n) 
{ 
    HashMap<Integer, 
            Integer>prime = new HashMap<Integer, 
                                        Integer>(); 
    for (int i = 2; i <= Math.sqrt(n); ++i)  
    { 
        while (n % i == 0)  
        { 
  
            // Increment count of i-th prime divisor 
            if (prime.containsKey(i))  
            { 
                prime.put(i, prime.get(i) + 1); 
            }  
              
            else 
            { 
                prime.put(i, 1); 
            } 
  
            // Find next prime divisor 
            n = n / i; 
        } 
    } 
  
    // Increment count if divisor still remains 
    if (n > 2) 
    { 
        if(prime.containsKey(n)) 
        { 
            prime.put(n, prime.get(n) + 1); 
        } 
        else
        { 
            prime.put(n, 1); 
        } 
    } 
  
    // Initialize variable for counting the factors 
    // of n^2 and n as ans1 and ans2 respectively 
    int ans1 = 1, ans2 = 1; 
  
    // Range based for-loop 
    for (Map.Entry<Integer, 
                   Integer> it : prime.entrySet())  
    { 
  
        // Use formula as discussed in above 
        ans1 *= 2 * it.getValue() + 1; 
        ans2 *= it.getValue() + 1; 
    } 
  
    // return the difference of answers 
    return ans1 - ans2; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int n = 5; 
    System.out.println(factors(n)); 
    n = 8; 
    System.out.println(factors(n)); 
} 
} 
  
// This code is contributed by PrinciRaj1992  

