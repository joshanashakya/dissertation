

// java program to get total xor 
// of all subarray xors 
import java.io.*; 
  
public class GFG { 
      
    // Returns XOR of all subarray 
    // xors 
    static int getTotalXorOfSubarrayXors( 
                          int arr[], int N) 
    { 
          
        // initialize result by 0  
        // as (a XOR 0 = a) 
        int res = 0; 
      
        // loop over all elements once 
        for (int i = 0; i < N; i++) 
        { 
            // get the frequency of 
            // current element 
            int freq = (i + 1) * (N - i); 
      
            // Uncomment below line to print  
            // the frequency of arr[i] 
              
            // if frequency is odd, then  
            // include it in the result 
            if (freq % 2 == 1) 
                res = res ^ arr[i]; 
        } 
      
        // return the result 
        return res; 
    } 
      
    public static void main(String[] args) 
    { 
  
        int arr[] = {3, 5, 2, 4, 6}; 
        int N = arr.length; 
        System.out.println( 
            getTotalXorOfSubarrayXors(arr, N)); 
    } 
} 
  
// This code is contributed by Sam007. 

