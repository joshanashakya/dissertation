

// Java program to find the sum  
// and product of k smallest and  
// k largest prime numbers in an array  
import java.util.*; 
  
class GFG  
{ 
    public static void main(String[] args)  
    { 
        int arr[] = { 4, 2, 12, 13, 5, 19 }; 
        int n = arr.length; 
        int k = 3; 
        primeSumAndProduct(arr, n, k); 
    } 
  
    static boolean[] SieveOfEratosthenes(int max_val)  
    { 
        // Create a boolean vector "prime[0..n]". A 
        // value in prime[i] will finally be false 
        // if i is Not a prime, else true. 
        boolean[] prime = new boolean[max_val + 1]; 
        for(int i = 0;i <= max_val ; i++) 
        prime[i] = true; 
        for (int p = 2; p * p <= max_val; p++) 
        { 
  
            // If prime[p] is not changed, then 
            // it is a prime 
            if (prime[p] == true)  
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
    // largest prime numbers in an array 
    static void primeSumAndProduct(int arr[], int n, int k)  
    { 
        // Find maximum value in the array 
        int max_val = 0; 
        for (int i = 0; i < n; i++) 
            max_val = Math.max(max_val, arr[i]); 
  
        // Use sieve to find all prime numbers 
        // less than or equal to max_val 
        boolean[] prime = SieveOfEratosthenes(max_val); 
  
        // Set 0 and 1 as non-primes as 
        // they don't need to be 
        // counted as prime numbers 
        prime[0] = false; 
        prime[1] = false; 
  
        // Max Heap to store all the prime numbers 
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder()); 
  
        // Min Heap to store all the prime numbers 
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(); 
  
        // Push all the prime numbers 
        // from the array to the heaps 
        for (int i = 0; i < n; i++) 
            if (prime[arr[i]]) { 
                minHeap.add(arr[i]); 
                maxHeap.add(arr[i]); 
            } 
  
        long minProduct = 1, maxProduct = 1, minSum = 0, maxSum = 0; 
        while (k > 0) 
        { 
            k--; 
              
            // Calculate the products 
            minProduct *= minHeap.peek(); 
            maxProduct *= maxHeap.peek(); 
  
            // Calculate the sum 
            minSum += minHeap.peek(); 
            maxSum += maxHeap.peek(); 
  
            // Pop the current minimum element 
            minHeap.remove(); 
  
            // Pop the current maximum element 
            maxHeap.remove(); 
        } 
  
        System.out.println("Sum of k-minimum prime numbers is " + minSum); 
        System.out.println("Sum of k-maximum prime numbers is " + maxSum); 
        System.out.println("Product of k-minimum prime numbers is " + minProduct); 
        System.out.println("Product of k-maximum prime numbers is " + maxProduct); 
    } 
  
} 
  
// This code is contributed by ankush_953 

