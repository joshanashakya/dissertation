

// Java program to find maximum number of 
// fixed points using atmost 1 swap 
import java.io.*; 
  
class GFG { 
   
  
// Function to find maximum number of 
// fixed points using atmost 1 swap 
static int maximumFixedPoints(int a[], int n) 
{ 
    int i, count = 0, swapped = 0; 
    int pos[] = new int[n]; 
  
    // Store position of each element in 
    // input array 
    for (i = 0; i < n; i++) 
        pos[a[i]] = i; 
  
    for (i = 0; i < n; i++) { 
  
        // If fixed point, incremenmt count 
        if (a[i] == i) 
            count++; 
  
        // Else check if swapping increments 
        // count by 2 
        else if (swapped == 0 && pos[i] == a[i]) { 
            count += 2; 
            swapped = 1; 
        } 
    } 
  
    // If not swapped yet and elements remaining 
    if (swapped == 0 && count < n - 1) 
        count++; 
  
    return count; 
} 
  
// Driver Code 
  
    public static void main (String[] args) { 
            int []a= { 0, 1, 3, 4, 2 }; 
  
    int n = a.length; 
  
    System.out.println(maximumFixedPoints(a, n)); 
    } 
} 
  
  
// This code is contributed 
// by shs 

