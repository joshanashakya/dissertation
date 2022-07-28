

// Java implementation of the approach 
import java.util.*; 
  
class solution 
{ 
  
// Function to return the count of required sub-arrays 
static int countSubArrays(int arr[], int n, int K) 
{ 
    int count = 0; 
    for (int i = 0; i < n; i++) { 
        for (int j = i; j < n; j++) { 
  
            int bitwise_or = 0; 
  
            // Traverse sub-array [i..j] 
            for (int k = i; k <= j; k++) { 
                bitwise_or = bitwise_or | arr[k]; 
            } 
            if (bitwise_or >= K) 
                count++; 
        } 
    } 
    return count; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int arr[] = { 3, 4, 5 }; 
    int n = arr.length; 
    int k = 6; 
    System.out.println(countSubArrays(arr, n, k)); 
    
} 
} 
// This code is contributed by 
// Surendra_Gangwar 

