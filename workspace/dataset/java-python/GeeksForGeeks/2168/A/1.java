

// Java implementation of the approach 
class GFG 
{ 
  
// Function to find the valid permutation 
static void getPermutation(int a[], int n) 
{ 
  
    // Find the array from the cumulative sum 
    int []ans = new int[n]; 
    ans[0] = a[0]; 
    for (int i = 1; i < n; i++) 
        ans[i] = a[i] - a[i - 1]; 
  
    // To mark the occurrence of an element 
    boolean []present = new boolean[n + 1]; 
    for (int i = 0; i < ans.length; i++)  
    { 
  
        // If current element has already 
        // been seen previously 
        if (present[ans[i]]) 
        { 
            System.out.print("-1"); 
            return; 
        } 
  
        // Mark the current element's occurrence 
        else
            present[ans[i]] = true; 
    } 
  
    // Print the required permutation 
    for (int i = 0; i < n; i++) 
        System.out.print(ans[i] + " "); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int a[] = { 2, 3, 6 }; 
    int n = a.length; 
  
    getPermutation(a, n); 
} 
} 
  
// This code is contributed by Rajput-Ji 

