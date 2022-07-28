

// Java program to find the sum between L-R 
// range by creating the array 
// Naive Approach 
import java.io.*; 
public class GFG { 
  
    // Function to find the sum between L and R 
    static int rangesum(int n, int l, int r) 
    { 
        // array created 
        int[] arr = new int[n]; 
  
        // fill the first half of array 
        int c = 1, i = 0; 
        while (c <= n) { 
            arr[i++] = c; 
            c += 2; 
        } 
  
        // fill the second half of array 
        c = 2; 
        while (c <= n) { 
            arr[i++] = c; 
            c += 2; 
        } 
        int sum = 0; 
  
        // find the sum between range 
        for (i = l - 1; i < r; i++) { 
            sum += arr[i]; 
        } 
  
        return sum; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int n = 12; 
        int l = 1, r = 11; 
        System.out.println(rangesum(n, l, r)); 
    } 
} 

