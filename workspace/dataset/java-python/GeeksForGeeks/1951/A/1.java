

// java find maximum difference of 
// subset sum 
import java. io.*; 
import java .util.*; 
  
public class GFG { 
  
    // function for maximum subset diff 
    static int maxDiff(int []arr, int n) 
    { 
        int result = 0; 
      
        // sort the array 
        Arrays.sort(arr); 
      
        // calculate the result 
        for (int i = 0; i < n - 1; i++) 
        { 
            if (arr[i] != arr[i + 1]) 
                result += Math.abs(arr[i]); 
            else
                i++; 
        } 
      
        // check for last element 
        if (arr[n - 2] != arr[n - 1]) 
            result += Math.abs(arr[n - 1]); 
      
        // return result 
        return result; 
    } 
      
    // driver program 
    static public void main (String[] args) 
    { 
        int[] arr = { 4, 2, -3, 3, -2, -2, 8 }; 
        int n = arr.length; 
          
        System.out.println("Maximum Difference = "
                                + maxDiff(arr, n)); 
    } 
} 
  
// This code is contributed by vt_m. 

