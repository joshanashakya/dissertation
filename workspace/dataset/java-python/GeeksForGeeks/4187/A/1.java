

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
// Function to return the count of K's 
// such that the array can be divided 
// into two sets containing equal number 
// of elements when all the elements less 
// than K are in one set and the rest 
// of the elements are in the other set 
static int two_sets(int a[], int n) 
{ 
    // Sort the given array 
    Arrays.sort(a); 
  
    // Return number of such Ks 
    return a[n / 2] - a[(n / 2) - 1]; 
} 
  
// Driver code 
public static void main(String []args) 
{ 
    int a[] = { 1, 4, 4, 6, 7, 9 }; 
    int n = a.length; 
  
    System.out.println(two_sets(a, n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

