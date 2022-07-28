

// Java program to find XOR of Prime 
// Frequencies of Characters in a String 
import java.util.*; 
  
class GFG 
{ 
  
// Function to create Sieve to check primes 
static void SieveOfEratosthenes(boolean prime[], int p_size) 
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
            for (int i = p * 2; i <= p_size; i += p) 
                prime[i] = false; 
        } 
    } 
} 
  
// Function to find XOR of prime frequencies 
static int xorOfPrime(char[] s) 
{ 
    boolean []prime = new boolean[100005]; 
    for(int i = 0; i < 100005; i++) 
        prime[i] = true; 
  
    SieveOfEratosthenes(prime, 10005); 
  
    int i, j; 
  
    // map is used to store character 
    // frequencies 
    Map<Character,Integer> m = new HashMap<>(); 
    for (i = 0; i < s.length; i++) 
    { 
        if(m.containsKey(s[i])) 
        { 
            m.put(s[i], m.get(s[i])+1); 
        } 
        else
        { 
            m.put(s[i], 1); 
        } 
    } 
  
    int result = 0; 
    int flag = 0; 
  
    // Traverse the map 
    for (Map.Entry<Character,Integer> entry : m.entrySet()) 
    { 
        // Calculate XOR of all prime 
        // frequencies 
        if (prime[entry.getValue()])  
        { 
            result ^= entry.getValue(); 
            flag = 1; 
        } 
    } 
  
    if (flag != 1) 
        return -1; 
  
    return result; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    char[] s = "gggggeeekkkks".toCharArray(); 
  
    System.out.println(xorOfPrime(s)); 
} 
} 
  
// This code has been contributed by 29AjayKumar 

