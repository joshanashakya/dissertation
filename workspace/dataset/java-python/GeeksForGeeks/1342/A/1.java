

// Java Program to computer sum of prime number 
// in a given range 
public class GFG { 
  
    // Suppose the constraint is N<=1000 
    static int N = 1000; 
  
    // Declare an array for dynamic approach 
    static long dp[] = new long[N + 1]; 
  
    // Method to compute the array 
    static void sieve() 
    { 
        // Declare an extra array as arr 
        int arr[] = new int[N + 1]; 
        arr[0] = 1; 
        arr[1] = 1; 
  
        // Iterate the loop till sqrt(n) 
        // Time Complexity is O(log(n) X sqrt(n)) 
        for (int i = 2; i <= Math.sqrt(N); i++) 
  
            // if ith element of arr is 0 i.e. marked as prime 
            if (arr[i] == 0) 
  
                // mark all of it's multiples till N as non-prime 
                // by setting the locations to 1 
                for (int j = i * i; j <= N; j += i) 
                    arr[j] = 1; 
  
        long runningPrimeSum = 0; 
  
        // Update the array 'dp' with the running sum 
        // of prime numbers within the range [1, N] 
        // Time Complexity is O(n) 
        for (int i = 1; i <= N; i++) { 
            if (arr[i] == 0) 
                runningPrimeSum += i; 
  
            //Here, dp[i] is the sum of all the prime numbers 
            //within the range [1, i] 
            dp[i] = runningPrimeSum; 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int l = 4, r = 13; 
  
        // Compute dp 
        sieve(); 
        System.out.println(dp[r] - dp[l - 1]); 
    } 
} 

