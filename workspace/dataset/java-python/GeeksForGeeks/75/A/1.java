

// Java implementation of the approach 
  
import java.util.Arrays; 
  
// Java implementation of the approach 
class GFG { 
  
    final static int MAX = 10000002; 
  
    static int prime[] = new int[MAX]; 
  
// Array to store count of primes 
    static int prime_count[] = new int[MAX]; 
  
// Function to store smallest prime factor 
// of every number till MAX 
    static void sieve() { 
        Arrays.fill(prime, 0, MAX, 0); 
        prime[0] = prime[1] = 1; 
        for (int i = 2; i * i < MAX; i++) { 
            if (prime[i] == 0) { 
                for (int j = i * 2; j < MAX; j += i) { 
                    if (prime[j] == 0) { 
                        prime[j] = i; 
                    } 
                } 
            } 
        } 
        for (int i = 2; i < MAX; i++) { 
  
            // If the number is prime then it's  
            // smallest prime factor is the number  
            // itself 
            if (prime[i] == 0) { 
                prime[i] = i; 
            } 
        } 
    } 
  
// Function to return the count of the divisors for 
// the product of all the numbers from the array 
    static long numberOfDivisorsOfProduct(int[] arr, 
            int n) { 
        Arrays.fill(prime_count, 0, MAX, 0); 
  
        for (int i = 0; i < n; i++) { 
            int temp = arr[i]; 
            while (temp != 1) { 
  
                // Increase the count of prime 
                // encountered 
                prime_count[prime[temp]]++; 
                temp = temp / prime[temp]; 
            } 
        } 
  
        long ans = 1; 
  
        // Multiplying the count of primes 
        // encountered 
        for (int i = 2; i < MAX; i++) { 
            ans = ans * (prime_count[i] + 1); 
        } 
  
        return ans; 
    } 
  
// Driver code 
    public static void main(String[] args) { 
        sieve(); 
        int arr[] = {2, 4, 6}; 
        int n = arr.length; 
        System.out.println(numberOfDivisorsOfProduct(arr, n)); 
  
    } 
}  
  
// This code is contributed by 29AjayKumar 

