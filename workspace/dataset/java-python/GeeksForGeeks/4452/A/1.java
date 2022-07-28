

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function that returns true  
// if c is a vowel 
static boolean isVowel(char c) 
{ 
    if (c == 'a' || c == 'e' ||  
        c == 'i' || c == 'o' || 
        c == 'u') 
        return true; 
    return false; 
} 
  
// Function that returns true if all the vowels in 
// the given string are only at prime indices 
static boolean isVowelPrime(String str, int n) 
{ 
      
    // Create a boolean array "prime[0..n]" and  
    // initialize all entries it as true.  
    // A value in prime[i] will finally be false 
    // if i is Not a prime, else true. 
    boolean []prime = new boolean[n]; 
    Arrays.fill(prime, true); 
  
    // 0 and 1 are not prime 
    prime[0] = false; 
    prime[1] = false; 
    for (int p = 2; p * p < n; p++)  
    { 
  
        // If prime[p] is not changed,  
        // then it is a prime 
        if (prime[p] == true)  
        { 
  
            // Update all multiples of p greater than or 
            // equal to the square of it 
            // numbers which are multiple of p and are 
            // less than p^2 are already been marked. 
            for (int i = p * p; i < n; i += p) 
                prime[i] = false; 
        } 
    } 
  
    // For every character of the given string 
    for (int i = 0; i < n; i++)  
    { 
  
        // If current character is vowel 
        // and the index is not prime 
        if (isVowel(str.charAt(i)) && !prime[i]) 
            return false; 
    } 
    return true; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String str = "geeksforgeeks"; 
    int n = str.length(); 
  
    if (isVowelPrime(str, n)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed by Princi Singh 

