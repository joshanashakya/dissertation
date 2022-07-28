

// Java program to count triplets  
// with sum that lies in given  
// range [a, b]. 
import java.util.*; 
  
class GFG 
{ 
      
// Function to count triplets 
public static int countTriplets(int []arr, int n, 
                                int a, int b) 
{ 
    // Initialize result 
    int ans = 0; 
  
    // Fix the first  
    // element as A[i] 
    for (int i = 0; i < n - 2; i++) 
    { 
  
        // Fix the second  
        // element as A[j] 
        for (int j = i + 1; j < n - 1; j++)  
        { 
  
            // Now look for the 
            // third number 
            for (int k = j + 1; k < n; k++) 
            { 
                if (arr[i] + arr[j] + arr[k] >= a && 
                    arr[i] + arr[j] + arr[k] <= b) 
                    {ans++;} 
            } 
        } 
    } 
  
    return ans; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int[] arr = { 2, 7, 5, 3, 8, 4, 1, 9 }; 
    int n = arr.length; 
    int a = 8, b = 16; 
    System.out.println("" + countTriplets(arr, n,  
                                        a, b)); 
} 
} 
  
// This code is contributed  
// by Harshit Saini  

