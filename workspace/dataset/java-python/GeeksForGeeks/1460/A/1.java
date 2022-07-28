

// Java program to find longest alternating 
// subarray starting from every index. 
import java.util.*; 
  
class Longest{ 
      
    public static void longestAlternating(int arr[],  
                                             int n) 
    { 
        int[] count = new int[n]; 
  
        // Fill count[] from end.  
        count[n - 1] = 1; 
        for (int i = n - 2; i >= 0; i--) { 
            if (arr[i] * arr[i + 1] < 0) 
                count[i] = count[i + 1] + 1; 
            else
                count[i] = 1; 
        } 
  
        // Print result 
        for (int i = 0; i < n; i++) 
            System.out.print(count[i] + " "); 
    } 
      
    // driver program 
    public static void main(String[] args) 
    { 
        int a[] = { -5, -1, -1, 2, -2, -3 }; 
        int n = 6; 
        longestAlternating(a, n); 
    } 
} 
  
// This code is contributed by rishabh_jain 

