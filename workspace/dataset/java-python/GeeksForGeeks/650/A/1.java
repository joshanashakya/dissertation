

// Java program to find the minimum difference. 
  
import java.util.*; 
class GFG 
{ 
      
    // Function to return required minimum difference 
    static int minDiff(int n, int x, int A[]) 
    { 
        int mn = A[0], mx = A[0]; 
      
        // finding minimum and maximum values 
        for (int i = 0; i < n; ++i) { 
            mn = Math.min(mn, A[i]); 
            mx = Math.max(mx, A[i]); 
        } 
      
        // returning minimum possible difference 
        return Math.max(0, mx - mn - 2 * x); 
    } 
      
    // Driver program 
    public static void main(String []args) 
    { 
      
        int n = 3, x = 3; 
        int A[] = { 1, 3, 6 }; 
      
        // function to return the answer 
        System.out.println(minDiff(n, x, A)); 
      
          
    } 
  
} 
  
// This code is contributed by ihritik 

