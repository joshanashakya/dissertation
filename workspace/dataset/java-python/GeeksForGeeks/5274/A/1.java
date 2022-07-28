

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
    static int getCount(int[] v, int n) 
    { 
  
        // Sorting the vector 
        Arrays.sort(v); 
        int cnt = 0; 
        for (int i = 0; i < n; i++)  
        { 
  
            // Count of numbers which 
            // are greater than v[i] 
            int tmp = n - 1 - upperBound(v, n, v[i] - 1); 
            if (tmp == v[i]) 
                cnt++; 
        } 
        return cnt; 
    } 
  
    // Function to implement upper_bound() 
    static int upperBound(int[] array,   
                          int length, int value)  
    { 
        int low = 0; 
        int high = length; 
        while (low < high)  
        { 
            final int mid = (low + high) / 2; 
            if (value >= array[mid])  
            { 
                low = mid + 1; 
            }  
            else
            { 
                high = mid; 
            } 
        } 
        return low; 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        int n = 4; 
        int[] v = { 1, 2, 3, 4 }; 
        System.out.println(getCount(v, n)); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

