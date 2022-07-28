

// Java Program to decide if an 
// array represents a permutation or not 
import java.util.*; 
  
class GFG{ 
  
// Function to check if an 
// array represents a permutation or not 
static boolean permutation(int []arr, int n) 
{ 
    // Set to check the count 
    // of non-repeating elements 
    Set<Integer> hash = new HashSet<Integer>();  
  
    int maxEle = 0; 
  
    for (int i = 0; i < n; i++) { 
  
        // Insert all elements in the set 
        hash.add(arr[i]); 
  
        // Calculating the max element 
        maxEle = Math.max(maxEle, arr[i]); 
    } 
  
    if (maxEle != n) 
        return false; 
  
    // Check if set size is equal to n 
    if (hash.size() == n) 
        return true; 
  
    return false; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int arr[] = { 1, 2, 5, 3, 2 }; 
    int n = arr.length; 
  
    if (permutation(arr, n)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed by Surendra_Gangwar 

