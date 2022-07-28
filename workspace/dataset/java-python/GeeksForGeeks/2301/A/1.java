

// Java program to find sum and product of  
// composites which are divisible by k in given array.  
import java.util.Vector; 
  
public class GFG { 
  
    static int max_val(int[] arr) { 
        int i; 
  
        // Initialize maximum element  
        int max = arr[0]; 
  
        // Traverse array elements from second and  
        // compare every element with current max    
        for (i = 1; i < arr.length; i++) { 
            if (arr[i] > max) { 
                max = arr[i]; 
            } 
        } 
  
        return max; 
    } 
  
// Function to find count of composite  
    static void compositeSumProduct(int arr[], int n, int k) { 
        // Find maximum value in the array  
        int max_val = max_val(arr); 
  
        // Use sieve to find all prime numbers less than  
        // or equal to max_val  
        // Create a boolean array "prime[0..n]". A  
        // value in prime[i] will finally be false  
        // if i is Not a prime, else true.  
        Vector<Boolean> prime = new Vector<>(); 
        // Remaining part of SIEVE  
        for(int i = 0;i<max_val+1;i++){ 
            prime.add(i, Boolean.TRUE); 
        } 
        for (int p = 2; p * p <= max_val; p++) { 
  
            // If prime[p] is not changed, then  
            // it is a prime  
            if (prime.get(p) == true) { 
  
                // Update all multiples of p  
                for (int i = p * 2; i <= max_val; i += p) { 
                    prime.add(i, Boolean.FALSE); 
                } 
            } 
        } 
  
        // Sum all primes in arr[]  
        int sum = 0, product = 1; 
        for (int i = 0; i < n; i++) { 
            //if (!prime[arr[i]] && arr[i] % k == 0) 
            if (!prime.get(arr[i]) && arr[i] % k == 0) { 
                sum += arr[i]; 
                product *= arr[i]; 
            } 
        } 
        System.out.println("Sum of composite numbers "
                + "divisible by k is " + sum); 
        System.out.println("\nProduct of composite numbers"
                + " divisible by k is " + product); 
  
    } 
  
// Driver code  
    public static void main(String[] args) { 
        int arr[] = {1, 2, 3, 4, 5, 6, 7}; 
        int n = arr.length; 
        int k = 2; 
        compositeSumProduct(arr, n, k); 
    } 
  
} 

