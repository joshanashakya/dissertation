

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
  
    // Function that calculates the sum 
    // and product of k smallest and k 
    // largest composite numbers in an array 
    static void kMinXOR(Integer[] arr, int n, int k)  
    { 
  
        // Find maximum value in the array 
        int max_val = Collections.max(Arrays.asList(arr)); 
  
        // Use sieve to find all prime numbers 
        // less than or equal to max_val 
        boolean[] prime = SieveOfEratosThenes(max_val); 
  
        // Max Heap to store all the prime and composite numbers 
        PriorityQueue<Integer> maxHeapPrime =  
                           new PriorityQueue<Integer>((x, y) -> y - x); 
        PriorityQueue<Integer> maxHeapNonPrime =  
                           new PriorityQueue<Integer>((x, y) -> y - x); 
  
        for (int i = 0; i < n; i++)  
        { 
  
            // If current element is prime 
            if (prime[arr[i]])  
            { 
  
                // Max heap will only store k elements 
                if (maxHeapPrime.size() < k) 
                    maxHeapPrime.add(arr[i]); 
  
                // If the size of max heap is K and the 
                // top element is greater than the current 
                // element than it needs to be replaced 
                // by the current element as only 
                // minimum k elements are required 
                else if (maxHeapPrime.peek() > arr[i])  
                { 
                    maxHeapPrime.poll(); 
                    maxHeapPrime.add(arr[i]); 
                } 
            } 
  
            // If current element is composite 
            else if (arr[i] != -1)  
            { 
  
                // Heap will only store k elements 
                if (maxHeapNonPrime.size() < k) 
                    maxHeapNonPrime.add(arr[i]); 
  
                // If the size of max heap is K and the 
                // top element is greater than the current 
                // element than it needs to be replaced 
                // by the current element as only 
                // minimum k elements are required 
                else if (maxHeapNonPrime.peek() > arr[i]) 
                { 
                    maxHeapNonPrime.poll(); 
                    maxHeapNonPrime.add(arr[i]); 
                } 
            } 
        } 
  
        long primeXOR = 0, nonPrimeXor = 0; 
  
        while (k-- > 0)  
        { 
  
            // Calculate the xor 
            if (maxHeapPrime.size() > 0)  
            { 
                primeXOR ^= maxHeapPrime.peek(); 
                maxHeapPrime.poll(); 
            } 
  
            if (maxHeapNonPrime.size() > 0)  
            { 
                nonPrimeXor ^= maxHeapNonPrime.peek(); 
                maxHeapNonPrime.poll(); 
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

