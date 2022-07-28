

import java.util.Arrays; 
  
// Java implementation of the above approach 
// Function to find the maximum sum 
class GFG { 
  
    static void maxSum(int[] a, int n) { 
  
        // Maximum AND is maximum element 
        int maxAnd = Arrays.stream(a).max().getAsInt(); 
  
        // Maximum OR is bitwise OR of all. 
        int maxOR = 0; 
        for (int i = 0; i < n; i++) { 
            maxOR |= a[i]; 
        } 
        System.out.println((maxAnd + maxOR)); 
  
// Driver code 
    } 
  
    public static void main(String[] args) { 
  
        int n = 4; 
        int[] a = {3, 5, 6, 1}; 
        maxSum(a, n); 
    } 
} 
  
//This code contributed by 29AjayKumar 

