

// Java program to find Xor of all 
// Prime numbers in array  
import java.util.Arrays; 
  
  
class GFG  
{ 
    static boolean prime[] = new boolean[100005]; 
  
    static void SieveOfEratosthenes(int n)  
    { 
        Arrays.fill(prime, true); 
  
        // false here indicates 
        // that it is not prime 
        prime[1] = false; 
  
        for (int p = 2; p * p < n; p++) 
        { 
  
            // If prime[p] is not changed, 
            // then it is a prime 
            if (prime[p]) 
            { 
                // Update all multiples of p, 
                // set them to non-prime 
                for (int i = p * 2; i < n; i += p) 
                { 
                    prime[i] = false; 
                } 
            } 
        } 
    } 
  
    // Function to compute xor of all 
    // prime elements 
    static int xorPrimes(int arr[], int n)  
    { 
        SieveOfEratosthenes(100005); 
        int xorVal = 0; 
        for (int i = 0; i < n; i++)  
        { 
            // if the element is prime 
            if (prime[arr[i]])  
            { 
                xorVal = xorVal ^ arr[i]; 
            } 
        } 
        return xorVal; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int arr[] = {4, 3, 2, 6, 100, 17}; 
        int n = arr.length; 
        System.out.println(xorPrimes(arr, n)); 
    } 
} 
  
// This code is contributed by  
// Rajput-Ji 

