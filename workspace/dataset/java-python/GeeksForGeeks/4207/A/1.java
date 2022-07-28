

// Java implementation of the approach 
import java.io.*; 
  
class GFG 
{ 
  
// Function to return count of required pairs 
static int count_pairs(int a[], int b[], int n, int m) 
{ 
  
    // Count of odd and even numbers 
    // from both the arrays 
    int odd1 = 0, even1 = 0; 
    int odd2 = 0, even2 = 0; 
  
    // Find the count of odd and 
    // even elements in a[] 
    for (int i = 0; i < n; i++)  
    { 
        if (a[i] % 2 == 1) 
            odd1++; 
        else
            even1++; 
    } 
  
    // Find the count of odd and 
    // even elements in b[] 
    for (int i = 0; i < m; i++) 
    { 
        if (b[i] % 2 == 1) 
            odd2++; 
        else
            even2++; 
    } 
  
    // Count the number of pairs 
    int pairs = Math.min(odd1, odd2) + Math.min(even1, even2); 
  
    // Return the number of pairs 
    return pairs; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
      
    int a[] = { 9, 14, 6, 2, 11 }; 
    int b[] = { 8, 4, 7, 20 }; 
    int n = a.length; 
    int m = b.length; 
    System.out.println (count_pairs(a, b, n, m)); 
  
} 
} 
  
// This code is contributes by ajit  

