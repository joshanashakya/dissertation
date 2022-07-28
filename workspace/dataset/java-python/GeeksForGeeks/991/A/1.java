

// Java program to implement the  
// above approach 
import java.util.HashMap; 
import java.util.Vector; 
  
class GFG  
{ 
  
    // Fucntion to pre-store primes 
    public static void SieveOfEratosthenes(int MAX,  
                            Vector<Integer> primes)  
    { 
        boolean[] prime = new boolean[MAX + 1]; 
        for (int i = 0; i < MAX + 1; i++) 
            prime[i] = true; 
  
        // Sieve method to check if prime or not 
        for (int p = 2; p * p <= MAX; p++)  
        { 
            if (prime[p] == true) 
            { 
                // Multiples 
                for (int i = p * p; i <= MAX; i += p) 
                    prime[i] = false; 
            } 
        } 
  
        // Pre-store all the primes 
        for (int i = 2; i <= MAX; i++) 
        { 
            if (prime[i]) 
                primes.add(i); 
        } 
    } 
  
    // Function to find the intest subsequence 
    public static int findLongest(int[] A, int n) 
    { 
  
        // Hash map 
        HashMap<Integer, Integer> mpp = new HashMap<>(); 
        Vector<Integer> primes = new Vector<>(); 
  
        // Call the function to pre-store the primes 
        SieveOfEratosthenes(A[n - 1], primes); 
  
        int[] dp = new int[n]; 
  
        // Initialize last element with 1 
        // as that is the intest possible 
        dp[n - 1] = 1; 
        mpp.put(A[n - 1], n - 1); 
  
        // Iterate from the back and find the intest 
        for (int i = n - 2; i >= 0; i--) 
        { 
  
            // Get the number 
            int num = A[i]; 
  
            // Initialize dp[i] as 1 
            // as the element will only me in 
            // the subsequence . 
            dp[i] = 1; 
            int maxi = 0; 
  
            // Iterate in all the primes and 
            // multiply to get the next element 
            for (int it : primes)  
            { 
  
                // Next element if multiplied with it 
                int xx = num * it; 
  
                // If exceeds the last element 
                // then break 
                if (xx > A[n - 1]) 
                    break; 
  
                // If the number is there in the array 
                else if (mpp.get(xx) != null && mpp.get(xx) != 0)  
                { 
  
                        // Get the maximum most element 
                        dp[i] = Math.max(dp[i], 1 + dp[mpp.get(xx)]); 
                } 
            } 
  
            // Hash the element 
            mpp.put(A[i], i); 
        } 
        int ans = 1; 
  
        // Find the intest 
        for (int i = 0; i < n; i++) 
            ans = Math.max(ans, dp[i]); 
  
        return ans; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int[] a = { 1, 2, 5, 6, 12, 35, 60, 385 }; 
        int n = a.length; 
        System.out.println(findLongest(a, n)); 
  
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

