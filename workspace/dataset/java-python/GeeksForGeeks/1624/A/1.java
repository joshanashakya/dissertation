

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
    static boolean prime[] = new boolean[100005]; 
  
    static void SieveOfEratosthenes(int n) 
    { 
  
        Arrays.fill(prime, true); 
  
        // false here indicates 
        // that it is not prime 
        prime[1] = false; 
  
        for (int p = 2; p * p <= n; p++) 
        { 
  
            // If prime[p] is not changed, 
            // then it is a prime 
            if (prime[p]) { 
  
                // Update all multiples of p, 
                // set them to non-prime 
                for (int i = p * 2; i < n; i += p) 
                { 
                    prime[i] = false; 
                } 
            } 
        } 
    } 
  
    // Function that sorts 
    // all the prime numbers 
    // from the array in descending 
    static void sortPrimes(int arr[], int n) 
    { 
        SieveOfEratosthenes(100005); 
  
        // this vector will contain 
        // prime numbers to sort 
        Vector<Integer> v = new Vector<Integer>(); 
  
        for (int i = 0; i < n; i++) 
        { 
  
            // if the element is prime 
            if (prime[arr[i]])  
            { 
                v.add(arr[i]); 
            } 
        } 
        Comparator comparator = Collections.reverseOrder(); 
        Collections.sort(v, comparator); 
  
        int j = 0; 
  
        // update the array elements 
        for (int i = 0; i < n; i++)  
        { 
            if (prime[arr[i]])  
            { 
                arr[i] = v.get(j++); 
            } 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = {4, 3, 2, 6, 100, 17}; 
        int n = arr.length; 
  
        sortPrimes(arr, n); 
  
        // print the results. 
        for (int i = 0; i < n; i++)  
        { 
            System.out.print(arr[i] + " "); 
        } 
    } 
} 
  
// This code is contributed by 29AjayKumar 

