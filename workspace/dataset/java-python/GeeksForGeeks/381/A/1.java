

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
      
// Function to return the size of the required sub-set 
static int sizeSubSet(int a[], int k, int n) 
{ 
    // Sort the array 
    Arrays.sort(a); 
  
    // HashMap to store the contents 
    // of the required sub-set 
    HashMap< Integer, Integer> s = new HashMap< Integer, Integer>(); 
      
    // Insert the elements satisfying the conditions 
    for (int i = 0; i < n; i++) 
    { 
        if (a[i] % k != 0 || s.get(a[i] / k) == null) 
            s.put(a[i], s.get(a[i]) == null ? 1 : s.get(a[i]) + 1); 
    } 
  
    // Return the size of the set 
    return s.size(); 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
    int n = a.length; 
    int k = 2; 
    System.out.println( sizeSubSet(a, k, n)); 
} 
} 
// This code is contributed by Arnab Kundu 

