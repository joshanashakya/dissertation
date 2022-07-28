

// Java program to count all sub-arrays whose 
// product doesn't contain a repeating prime 
// factor 
import java.io.*; 
import java.util.*; 
  
class GFG  
{ 
    public static int MAXN = 1000001; 
    public static int[] spf = new int[MAXN]; 
      
    // Calculating SPF (Smallest Prime Factor) for 
    // every number till MAXN. 
    // Time Complexity : O(n log log n) 
    static void sieve() 
    { 
        // marking smallest prime factor for every 
        // number to be itself. 
        for (int i=1; i<MAXN; i++) 
            spf[i] = i; 
   
        // separately marking spf for every even 
        // number as 2 
        for (int i=4; i<MAXN; i+=2) 
            spf[i] = 2; 
   
        for (int i=3; i*i<MAXN; i++) 
        { 
            // checking if i is prime 
            if (spf[i] == i) 
            { 
                // marking SPF for all numbers divisible 
                // by i 
                for (int j=i*i; j<MAXN; j+=i) 
   
                    // marking spf[j] if it is not 
                    // previously marked 
                    if (spf[j]==j) 
                        spf[j] = i; 
            } 
        } 
    } 
      
    // Function to count all sub-arrays whose 
    // product doesn't contain a repeating prime 
    // factor 
    static int countSubArray(int arr[], int n) 
    { 
        // ind[i] is going to store 1 + last index of 
        // of an array element which has i as prime 
        // factor. 
        int[] ind = new int[MAXN]; 
        Arrays.fill(ind, -1); 
   
        int count = 0; // Initiaize result 
        int last_ind = 0; // It stores index 
        for (int i=0; i < n; ++i) 
        { 
            while (arr[i] > 1) 
            { 
                int div = spf[arr[i]]; 
   
                // Fetch the last index of prime 
                // divisor of element 
                last_ind = Math.max(last_ind, ind[div]); 
   
                // Update the current divisor index 
                ind[div] = i + 1; 
   
                arr[i] /= div; 
            } 
   
            // Update result, we basically include 
            // all required subarrays ending with 
            // index arr[i]. 
            count += i - last_ind + 1; 
        } 
        return count; 
    } 
      
    // driver program 
    public static void main (String[] args)  
    { 
        sieve(); 
        int arr[] = {2, 3, 9}; 
        int n = arr.length; 
        System.out.println(countSubArray(arr, n)); 
          
        int arr1[] = {2, 3, 5, 15, 7, 2}; 
        int n1 = arr1.length; 
        System.out.println(countSubArray(arr1, n1)); 
    } 
} 
  
// Contributed by Pramod Kumar 

