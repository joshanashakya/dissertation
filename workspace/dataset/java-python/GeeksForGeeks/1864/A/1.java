

// A Simple Java program to compute 
// sum of bitwise AND of all pairs 
import java.io.*; 
  
class GFG { 
      
    // Returns value of "arr[0] & arr[1] + 
    // arr[0] & arr[2] + ... arr[i] & arr[j] +  
    // ..... arr[n-2] & arr[n-1]" 
    static int pairAndSum(int arr[], int n) 
    { 
        int ans = 0; // Initialize result 
      
        // Consider all pairs (arr[i], arr[j) 
        // such that i < j 
        for (int i = 0; i < n; i++) 
            for (int j = i+1; j < n; j++) 
            ans += arr[i] & arr[j]; 
      
        return ans; 
    } 
      
    // Driver program to test above function 
    public static void main(String args[]) 
    { 
        int arr[] = {5, 10, 15}; 
        int n = arr.length; 
        System.out.println(pairAndSum(arr, n) ); 
    } 
} 
  
/*This code is contributed by Nikita Tiwari.*/

