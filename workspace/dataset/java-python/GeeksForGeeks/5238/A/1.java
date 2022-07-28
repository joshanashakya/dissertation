

// Java program to find the number of 
// boxes to be removed 
import java.io.*; 
  
class GFG { 
  
// Function to find the number of 
// boxes to be removed 
static int totalBoxesRemoved(int arr[], int n) 
{ 
    int count = 0; 
  
    // Store height of previous pile 
    int prev = arr[0]; 
  
    // Start traversing the array 
    for (int i = 1; i < n; i++) { 
        // if height of current pile is greater 
        // than previous pile 
        if (arr[i] > prev) { 
            // Increment count by difference 
            // of two heights 
            count += (arr[i] - prev); 
  
            // Update current height 
            arr[i] = prev; 
  
            // Update prev for next iteration 
            prev = arr[i]; 
        } 
        else { 
            // Update prev for next iteration 
            prev = arr[i]; 
        } 
    } 
  
    return count; 
} 
  
    // Driver code 
    public static void main (String[] args) { 
            int arr[] = { 5, 4, 7, 3, 2, 1 }; 
  
    int n = arr.length; 
  
    System.out.println(totalBoxesRemoved(arr, n)); 
    } 
} 
  
// This code is contributed  
// by inder_verma.. 

