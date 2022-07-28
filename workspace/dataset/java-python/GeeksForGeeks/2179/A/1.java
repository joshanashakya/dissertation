

// Java implementation of the approach  
import java.util.*; 
  
class GFG  
{ 
  
    // Function for Sieve of Eratosthenes 
    static boolean[] SieveOfEratosThenes(int max_val) 
    { 
  
        // Create a boolean vector "prime[0..n]". A 
        // value in prime[i] will finally be false 
        // if i is Not a prime, else true. 
        boolean[] prime = new boolean[max_val + 1]; 
        Arrays.fill(prime, true); 
  
        // Set 0 and 1 as non-primes as 
        // they don't need to be 
        // counted as prime numbers 
        prime[0] = false; 
        prime[1] = false; 
  
        for (int p = 2; p * p <= max_val; p++) 
        { 
  
            // If prime[p] is not changed, then 
            // it is a prime 
            if (prime[p])  
            { 
  
                // Update all multiples of p 
                for (int i = p * 2; i <= max_val; i += p) 
                    prime[i] = false; 
            } 
        } 
        return prime; 
    } 
  
    // Function that calculates the xor 
    // of k smallest and k 
    // largest prime numbers in an array 
    static void kMinXOR(Integer[] arr, int n, int k)  
    { 
  
        // Find maximum value in the array 
        int max_val = Collections.max(Arrays.asList(arr)); 
  
        // Use sieve to find all prime numbers 
        // less than or equal to max_val 
        boolean[] prime = SieveOfEratosThenes(max_val); 
  
        // Min Heaps to store the max K prime 
        // and composite numbers 
        PriorityQueue<Integer> minHeapPrime = new PriorityQueue<>(); 
        PriorityQueue<Integer> minHeapNonPrime = new PriorityQueue<>(); 
  
        for (int i = 0; i < n; i++) 
        { 
  
            // If current element is prime 
            if (prime[arr[i]])  
            { 
  
                // Min heap will only store k elements 
                if (minHeapPrime.size() < k) 
                    minHeapPrime.add(arr[i]); 
  
                // If the size of min heap is K and the 
                // top element is smaller than the current 
                // element than it needs to be replaced 
                // by the current element as only 
                // max k elements are required 
                else if (minHeapPrime.peek() < arr[i]) 
                { 
                    minHeapPrime.poll(); 
                    minHeapPrime.add(arr[i]); 
                } 
            } 
  
            // If current element is composite 
            else if (arr[i] != -1) 
            { 
  
                // Heap will only store k elements 
                if (minHeapNonPrime.size() < k) 
                    minHeapNonPrime.add(arr[i]); 
  
                // If the size of min heap is K and the 
                // top element is smaller than the current 
                // element than it needs to be replaced 
                // by the current element as only 
                // max k elements are required 
                else if (minHeapNonPrime.peek() < arr[i])  
                { 
                    minHeapNonPrime.poll(); 
                    minHeapNonPrime.add(arr[i]); 
                } 
            } 
        } 
  
        long primeXOR = 0, nonPrimeXor = 0; 
  
        while (k-- > 0)  
        { 
  
            // Calculate the xor 
            if (minHeapPrime.size() > 0) 
            { 
                primeXOR ^= minHeapPrime.peek(); 
                minHeapPrime.poll(); 
            } 
  
            if (minHeapNonPrime.size() > 0)  
            { 
                nonPrimeXor ^= minHeapNonPrime.peek(); 
                minHeapNonPrime.poll(); 
            } 
        } 
  
        System.out.println("Prime XOR = " + primeXOR); 
        System.out.println("Composite XOR = " + nonPrimeXor); 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        Integer[] arr = { 4, 2, 12, 13, 5, 19 }; 
        int n = arr.length; 
        int k = 3; 
  
        kMinXOR(arr, n, k); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

