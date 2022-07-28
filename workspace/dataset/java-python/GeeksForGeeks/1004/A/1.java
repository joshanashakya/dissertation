

// java program for above implementation 
import java.io.*; 
import java.util.*; 
  
public class GFG { 
      
    // Function to count numbers to be added 
    static int countNum(int []arr, int n) 
    { 
        int count = 0; 
      
        // Sort the array 
        Arrays.sort(arr); 
      
        // Check if elements are consecutive 
        // or not. If not, update count 
        for (int i = 0; i < n - 1; i++) 
            if (arr[i] != arr[i+1] &&  
                arr[i] != arr[i + 1] - 1) 
                count += arr[i + 1] - arr[i] - 1; 
      
        return count; 
    } 
      
    // Drivers code 
    static public void main (String[] args) 
    { 
          
        int []arr = { 3, 5, 8, 6 }; 
        int n = arr.length; 
          
        System.out.println(countNum(arr, n)); 
    } 
} 
  
// This code is contributed by vt_m. 

