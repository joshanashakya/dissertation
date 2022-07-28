

// Java implementation of the approach 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG { 
  
    static int[] solve(int[] arr, int n) { 
        int[] b = new int[n]; 
        int p = 0; 
        for (int i = n - 1; i >= 0; i--) { 
            b[p] = arr[i--]; 
            if (i >= 0) 
                b[n - 1 - p] = arr[i]; 
            p++; 
        } 
        return b; 
    } 
  
    public static void main(String[] args) 
    { 
        int []arr = { 1, 2, 3, 4 }; 
        int n = arr.length; 
          
        int[] b = solve(arr, n); 
          
        System.out.println(Arrays.toString(b)); 
    } 
} 
  
// This code is contributed by Pramod Hosahalli 

