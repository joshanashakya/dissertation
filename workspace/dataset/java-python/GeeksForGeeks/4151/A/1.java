

// Java program to find Sum and product of Prime 
// Frequencies of Characters in a String 
import java.util.*; 
  
class GFG  
{ 
  
    // Function to create Sieve to check primes 
    static void SieveOfEratosthenes(boolean prime[],  
                                        int p_size)  
    { 
        // false here indicates 
        // that it is not prime 
        prime[0] = false; 
        prime[1] = false; 
  
        for (int p = 2; p * p <= p_size; p++) 
        { 
  
            // If prime[p] is not changed, 
            // then it is a prime 
            if (prime[p])  
            { 
  
                // Update all multiples of p, 
                // set them to non-prime 
                for (int i = p * 2; i < p_size; i += p)  
                { 
                    prime[i] = false; 
                } 
            } 
        } 
    } 
  
    // Function to find the sum of prime frequencies 
    // of the characters of the given string 
    static void sumProdOfPrimeFreq(char[] s) 
    { 
        boolean[] prime = new boolean[s.length + 1]; 
        Arrays.fill(prime, true); 
  
        SieveOfEratosthenes(prime, s.length + 1); 
  
        int i, j; 
  
        // map is used to store 
        // character frequencies 
        Map<Character, Integer> mp = new HashMap<>(); 
        for (i = 0; i < s.length; i++)  
        { 
            mp.put(s[i], mp.get(s[i]) == null ? 1 : mp.get(s[i]) + 1); 
        } 
  
        int sum = 0, product = 1; 
  
        // Traverse the map 
        for (Map.Entry<Character, Integer> it : mp.entrySet())  
        { 
  
            // If the frequency is prime 
            if (prime[it.getValue()]) 
            { 
                sum += it.getValue(); 
                product *= it.getValue(); 
            } 
        } 
  
        System.out.print("Sum = " + sum); 
        System.out.println("\nProduct = " + product); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String s = "geeksforgeeks"; 
  
        sumProdOfPrimeFreq(s.toCharArray()); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

