

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
// Function to sort the array such that 
// negative values do not get affected 
static void sortArray(int a[], int n) 
{ 
  
    // Store all non-negative values 
    Vector<Integer> ans = new Vector<>(); 
    for (int i = 0; i < n; i++) 
    { 
        if (a[i] >= 0) 
            ans.add(a[i]); 
    } 
  
    // Sort non-negative values 
    Collections.sort(ans); 
  
    int j = 0; 
    for (int i = 0; i < n; i++) 
    { 
  
        // If current element is non-negative then 
        // update it such that all the 
        // non-negative values are sorted 
        if (a[i] >= 0)  
        { 
            a[i] = ans.get(j); 
            j++; 
        } 
    } 
  
    // Print the sorted array 
    for (int i = 0; i < n; i++) 
        System.out.print(a[i] + " "); 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int arr[] = { 2, -6, -3, 8, 4, 1 }; 
  
    int n = arr.length; 
  
    sortArray(arr, n); 
} 
} 
  
// This code is contributed by 29AjayKumar 

