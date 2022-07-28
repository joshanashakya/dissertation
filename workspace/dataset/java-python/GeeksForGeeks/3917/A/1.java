

// Java implementation of the approach 
import java.util.Arrays; 
  
class GFG 
{ 
  
// Function to print all the levels 
// of the given tree in sorted order 
static void printSortedLevels(int arr[], int n) 
{ 
  
    // Initialize level with 0 
    int level = 0; 
    for (int i = 0; i < n; level++)  
    { 
  
        // Number of nodes at current level 
        int cnt = (int)Math.pow(2, level); 
  
        // Indexing of array starts from 0 
        // so subtract no. of nodes by 1 
        cnt -= 1; 
  
        // Index of the last node in the current level 
        int j = Math.min(i + cnt, n - 1); 
  
        // Sort the nodes of the current level 
        Arrays.sort(arr, i, j+1); 
  
        // Print the sorted nodes 
        while (i <= j)  
        { 
            System.out.print(arr[i] + " "); 
            i++; 
        } 
        System.out.println(); 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 5, 6, 4, 9, 2, 1 }; 
    int n = arr.length; 
    printSortedLevels(arr, n); 
} 
} 
  
// This code is contributed by 29AjayKumar 

