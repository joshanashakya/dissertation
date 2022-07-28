

// Java program to count pairs (i, j) 
// such that arr[i] * arr[j] > arr[i] + arr[j] 
import java.util.*; 
  
class solution 
{ 
  
// Function to return the count of pairs 
// such that arr[i] * arr[j] > arr[i] + arr[j] 
static long countPairs(int arr[], int n) 
{ 
    long count = 0; 
    for (int i = 0; i < n - 1; i++) { 
        for (int j = i + 1; j < n; j++) { 
  
            // If condition is satisfied 
            if (arr[i] * arr[j] > arr[i] + arr[j]) 
                count++; 
        } 
    } 
    return count; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int arr[] = { 5, 0, 3, 1, 2 }; 
    int n = arr.length; 
    System.out.println(countPairs(arr, n)); 
      
} 
} 
  
// This code is contributed by 
// Surendra_Gangwar 

