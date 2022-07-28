

// Java implementation for pattern 
// searching in an array using Z-Algorithm 
  
import java.io.*; 
import java.util.*; 
  
class GfG { 
  
    // Function to calculate Z-Array 
    private static int[] zArray(int arr[]) 
    { 
        int z[]; 
        int n = arr.length; 
        z = new int[n]; 
        int r = 0, l = 0; 
  
        // Loop to calculate Z-Array 
        for (int k = 1; k < n; k++) { 
  
            // Outside the Z-box 
            if (k > r) { 
                r = l = k; 
                while (r < n 
                       && arr[r] == arr[r - l]) 
                    r++; 
                z[k] = r - l; 
                r--; 
            } 
  
            // Inside Z-box 
            else { 
                int k1 = k - l; 
  
                if (z[k1] < r - k + 1) 
                    z[k] = z[k1]; 
  
                else { 
                    l = k; 
                    while (r < n 
                           && arr[r] == arr[r - l]) 
                        r++; 
                    z[k] = r - l; 
                    r--; 
                } 
            } 
        } 
        return z; 
    } 
  
    // Helper function to merge two 
    // arrays and create a single array 
    private static int[] mergeArray(int A[], 
                                    int B[]) 
    { 
        int n = A.length; 
        int m = B.length; 
        int z[]; 
  
        // Array to store merged array 
        int c[] = new int[n + m + 1]; 
  
        // Copying array B 
        for (int i = 0; i < m; i++) 
            c[i] = B[i]; 
  
        // Adding a seperator 
        c[m] = Integer.MAX_VALUE; 
  
        // Copying array A 
        for (int i = 0; i < n; i++) 
            c[m + i + 1] = A[i]; 
  
        // Calling Z-function 
        z = zArray(c); 
        return z; 
    } 
  
    // Function to help compute the Z array 
    private static void findZArray(int A[], int B[], int n) 
    { 
        int flag = 0; 
        int z[]; 
        z = mergeArray(A, B); 
  
        // Printing indexes where array B occur 
        for (int i = 0; i < z.length; i++) { 
            if (z[i] == n) { 
  
                System.out.print((i - n - 1) 
                                 + " "); 
                flag = 1; 
            } 
        } 
        if (flag == 0) { 
            System.out.println("Not Found"); 
        } 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
        int A[] = { 1, 2, 3, 2, 3, 2 }; 
        int B[] = { 2, 3 }; 
        int n = B.length; 
  
        findZArray(A, B, n); 
    } 
} 

