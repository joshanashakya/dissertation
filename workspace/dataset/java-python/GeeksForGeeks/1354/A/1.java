

// Java implementation of the approach 
class GFG 
{ 
      
// Function to return the maximum difference 
static int findMaximumDiff(int []a, int n) 
{ 
    int ind1 = 0; 
  
    // Iteratively check from back 
    for (int i = n - 1; i > 0; i--)  
    { 
  
        // Different numbers 
        if (a[0] != a[i])  
        { 
            ind1 = i; 
            break; 
        } 
    } 
  
    int ind2 = 0; 
  
    // Iteratively check from 
    // the beginning 
    for (int i = 0; i < n - 1; i++) 
    { 
  
        // Different numbers 
        if (a[n - 1] != a[i])  
        { 
            ind2 = (n - 1 - i); 
            break; 
        } 
    } 
  
    return Math.max(ind1, ind2); 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int []a = { 1, 2, 3, 2, 3 }; 
    int n = a.length; 
    System.out.println(findMaximumDiff(a, n)); 
} 
} 
  
// This code is contributed by Akanksha_Rai 

