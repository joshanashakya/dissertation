

// Java implementation for above approach 
import java.util.*; 
      
class GFG 
{ 
  
// Returns factorial of n 
static long fact(int n) 
{ 
    long res = 1; 
    for (int i = 2; i <= n; i++) 
        res = res * i; 
    return res; 
} 
  
// Returns nCr for the 
// given values of r and n 
static long nCr(int n, int r) 
{ 
    return fact(n) / (1 * fact(r) * 
                          fact(n - r)); 
} 
  
static long number_of_subsequences(int arr[],  
                                   int k, int n) 
{ 
    long s = 0; 
  
    // Map to store the frequencies 
    // of each elements 
    HashMap<Integer,  
            Integer> mp = new HashMap<Integer,  
                                      Integer>(); 
  
    // Loop to store the 
    // frequencies of elements 
    // in the map 
    for (int i = 0; i < n; i++) 
    { 
        if(mp.containsKey(arr[i])) 
        { 
            mp.put(arr[i], mp.get(arr[i]) + 1); 
        } 
        else
        { 
            mp.put(arr[i], 1); 
        } 
    } 
  
    for (Map.Entry<Integer,  
                   Integer> j : mp.entrySet()) 
    { 
  
        // Using nCR formula to 
        // calculate the number 
        // of subsequences of a 
        // given length 
        s = s + 1 * nCr(j.getValue(), k); 
    } 
  
    return s; 
} 
  
// Driver Code 
static public void main ( String []arg) 
{ 
    int arr[] = { 1, 1, 1, 1, 2, 2, 2 }; 
    int k = 2; 
    int n = arr.length; 
  
    // Function calling 
    System.out.println(number_of_subsequences(arr, k, n)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

