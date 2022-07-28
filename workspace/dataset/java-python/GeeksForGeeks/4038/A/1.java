

// Java program to check if given encoding 
// represents a single string. 
import java.io.*; 
  
class GFG 
{ 
    static boolean isUnique(int []a, int n, int k) 
    { 
        int sum = 0; 
        for (int i = 0; i < n; i++) 
            sum += a[i]; 
          
        sum += n - 1;  
          
        // Return true if sum becomes k 
        return (sum == k);  
    } 
      
    // Driver Code 
    static public void main (String[] args) 
    { 
        int []a = {3, 3, 3}; 
        int n = a.length; 
        int k = 12; 
        if (isUnique(a, n, k)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
  
// This code is contributed by vt_m 

