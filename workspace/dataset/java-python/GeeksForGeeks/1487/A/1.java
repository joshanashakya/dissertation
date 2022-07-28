

// Java implementation of the approach 
import java.io.*; 
  
class GFG 
{ 
      
// Function to return the kth element 
// in the modified array 
static int getNumber(int n, int k) 
{ 
    int pos; 
  
    // Finding the index from where the 
    // even numbers will be stored 
    if ((n % 2) == 0)  
    { 
        pos = n / 2; 
    } 
    else 
    { 
        pos = (n / 2) + 1; 
    } 
  
    // Return the kth element 
    if (k <= pos) 
    { 
        return (k * 2 - 1); 
    } 
    else
        return ((k - pos) * 2); 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
    int n = 8, k = 5; 
    System.out.println (getNumber(n, k)); 
} 
} 
  
// This code is contributed by @tushil.  

