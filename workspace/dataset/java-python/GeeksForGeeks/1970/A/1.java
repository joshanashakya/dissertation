

// A Simple Java program to compute 
// sum of bitwise OR of all pairs 
import java.io.*; 
  
class GFG { 
      
              
    // Returns sum of bitwise OR 
    // of all pairs 
    static int pairORSum(int arr[], int n) 
    { 
        // Initialize result 
        int ans = 0;  
      
        // Consider all pairs (arr[i], arr[j)  
        // such that i < j 
        for (int i = 0; i < n; i++) 
            for (int j = i + 1; j < n; j++) 
                ans += arr[i] ^ arr[j]; 
      
        return ans; 
    } 
  
    // Driver program to test above function 
    public static void main (String[] args) { 
     
        int arr[] = { 5, 9, 7, 6 }; 
        int n = arr.length; 
          
        System.out.println(pairORSum(arr, 
                                arr.length)); 
    } 
} 
  
  
// This code is contributed by vt_m 

