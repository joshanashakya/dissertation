

// Java implementation of above approach 
  
import java.util.*; 
class GfG { 
    static boolean prime[] = new boolean[1000000 + 5]; 
  
    static void findPrime() 
    { 
        Arrays.fill(prime, true); 
        prime[1] = false; 
  
        for (int p = 2; p * p <= 1000000; p++) { 
  
            // If prime[p] is not changed, then it is a prime 
            if (prime[p] == true) { 
  
                // Update all multiples of p 
                for (int i = p * 2; i <= 1000000; i += p) 
                    prime[i] = false; 
            } 
        } 
    } 
  
    // Function to find the length of longest 
    // subarray having count of primes more 
    // than count of non-primes 
    static int lenOfLongSubarr(int arr[], int n) 
    { 
        // unordered_map 'um' implemented as 
        // hash table 
        Map<Integer, Integer> um = new HashMap<Integer, Integer>(); 
        int sum = 0, maxLen = 0; 
  
        // traverse the given array 
        for (int i = 0; i < n; i++) { 
  
            // consider -1 as non primes and 1 as primes 
            sum += prime[arr[i]] == false ? -1 : 1; 
  
            // when subarray starts form index '0' 
            if (sum == 1) 
                maxLen = i + 1; 
  
            // make an entry for 'sum' if it is 
            // not present in 'um' 
            else if (!um.containsKey(sum)) 
                um.put(sum, i); 
  
            // check if 'sum-1' is present in 'um' 
            // or not 
            if (um.containsKey(sum - 1)) { 
  
                // update maxLength 
                if (maxLen < (i - um.get(sum - 1))) 
                    maxLen = i - um.get(sum - 1); 
            } 
        } 
  
        // required maximum length 
        return maxLen; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        findPrime(); 
  
        int arr[] = { 1, 9, 3, 4, 5, 6, 7, 8 }; 
        int n = arr.length; 
  
        System.out.println(lenOfLongSubarr(arr, n)); 
    } 
} 

