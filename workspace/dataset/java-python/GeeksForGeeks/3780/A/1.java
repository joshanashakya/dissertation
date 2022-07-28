

// A sorting based solution to find the  
// minimum number of subsets of a set  
// such that every subset contains distinct 
// elements. 
import java.util.*; 
import java.lang.*; 
  
public class GfG{ 
      
    // Function to count subsets such that all 
    // subsets have distinct elements. 
    public static int subset(int ar[], int n) 
    { 
        // Take input and initialize res = 0 
        int res = 0; 
  
        // Sort the array 
        Arrays.sort(ar); 
  
        // Traverse the input array and 
        // find maximum frequency 
        for (int i = 0; i < n; i++) { 
            int count = 1; 
  
            // For each number find its repetition / frequency 
            for (; i < n - 1; i++) { 
                if (ar[i] == ar[i + 1]) 
                    count++; 
                else
                    break; 
            } 
  
            // Update res 
            res = Math.max(res, count); 
        } 
  
        return res; 
    } 
      
    // Driver function 
    public static void main(String argc[]) 
    { 
        int arr[] = { 5, 6, 9, 3, 4, 3, 4 }; 
        int n = 7; 
        System.out.println(subset(arr, n)); 
    } 
      
} 
  
/* This code is contributed by Sagar Shukla */

