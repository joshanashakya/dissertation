

// Java implementation of the approach 
import java.io.*; 
  
class GFG  
{ 
  
  
// Function that returns true if 
// given Prufer sequence is valid 
static boolean isValidSeq(int []a, int n) 
{ 
    int nodes = n + 2; 
  
    // Iterate in the Prufer sequence 
    for (int i = 0; i < n; i++)  
    { 
  
        // If out of range 
        if (a[i] < 1 || a[i] > nodes) 
            return false; 
    } 
  
    return true; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int a[] = { 4, 1, 3, 4 }; 
    int n = a.length; 
    if (isValidSeq(a, n)) 
        System.out.println( "Valid"); 
    else
        System.out.print( "Invalid"); 
} 
} 
  
// This code is contributed by anuj_67.. 

