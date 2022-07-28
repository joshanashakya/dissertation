

// Java implementation of the approach 
class GFG 
{ 
      
static int SIZE = 26; 
  
// Function to create Sieve to check primes 
static void SieveOfEratosthenes(boolean []prime,  
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
                prime[i] = false; 
        } 
    } 
} 
  
// Function to print the prime frequency characters 
// in the order of their occurrence 
static void printChar(String str, int n) 
{ 
    boolean []prime = new boolean[n + 1]; 
    for(int i = 0; i < n + 1; i++) 
        prime[i] = true; 
  
    // Function to create Sieve to check primes 
    SieveOfEratosthenes(prime, str.length() + 1); 
  
    // To store the frequency of each of 
    // the character of the string 
    int []freq = new int[SIZE]; 
  
    // Initialize all elements of freq[] to 0 
    for(int i =0; i< SIZE; i++) 
        freq[i]=0; 
  
    // Update the frequency of each character 
    for (int i = 0; i < n; i++) 
        freq[str.charAt(i) - 'a']++; 
  
    // Traverse str character by character 
    for (int i = 0; i < n; i++)  
    { 
  
        // If frequency of current character is prime 
        if (prime[freq[str.charAt(i) - 'a']])  
        { 
            System.out.print(str.charAt(i)); 
        } 
    } 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    String str = "geeksforgeeks"; 
    int n = str.length(); 
  
    printChar(str, n); 
} 
}  
  
// This code is contributed by PrinciRaj1992 

