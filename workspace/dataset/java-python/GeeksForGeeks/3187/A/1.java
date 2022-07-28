

// Java code for Minimum Cost Required to 
// connect weighted nodes 
  
import java.io.*; 
  
class GFG { 
      
    static int minimum_cost(int a[], int n) 
    { 
          
        int mn = Integer.MAX_VALUE; 
        int sum = 0; 
          
        for (int i = 0; i < n; i++) { 
  
            // To find the minimum element 
            mn = Math.min(a[i], mn); 
  
            // sum of all the elements 
            sum += a[i]; 
        } 
  
        return mn * (sum - mn); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int a[] = { 4, 3, 2, 5 }; 
        int n = a.length; 
          
        System.out.println(minimum_cost(a, n)); 
    } 
} 
  
// This code is contributed by vt_m. 

