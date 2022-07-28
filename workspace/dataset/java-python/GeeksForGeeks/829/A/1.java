

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
      
// Function that returns true if the 
// array contains a crest in 
// the index range [L, R] 
static boolean hasCrest(int arr[], int n,  
                        int L, int R) 
{ 
    // To keep track of elements 
    // which satisfy the Property 
    int []present = new int[n]; 
    for(int i = 0; i < n; i++) 
    { 
        present[i] = 0; 
    } 
  
    for (int i = 1; i <= n - 2; i++)  
    { 
  
        // Property is satisfied for 
        // the current element 
        if ((arr[i] <= arr[i + 1]) &&  
            (arr[i] <= arr[i - 1]))  
        { 
            present[i] = 1; 
        } 
    } 
  
    // Cumulative Sum 
    for (int i = 1; i < n; i++)  
    { 
        present[i] += present[i - 1]; 
    } 
  
    // If a crest is present in 
    // the given index range 
    if (present[L] == present[R - 1]) 
        return true; 
  
    return false; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int arr[] = { 2, 1, 3, 5, 12, 11, 7, 9 }; 
    int N = arr.length; 
    int L = 2; 
    int R = 6; 
  
    if (hasCrest(arr, N, L, R)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
  
} 
} 
  
// This code is contributed by Surendra_Gangwar 

