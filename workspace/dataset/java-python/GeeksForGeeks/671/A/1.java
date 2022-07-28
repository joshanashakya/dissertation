

// Java implementation of the approach 
class GFG 
{ 
      
// Function that returns true if the array 
// contains an element which is equal to 
// the XOR of the remaining elements 
static boolean containsElement(int [] arr, int n) 
{ 
  
    // To store the XOR of all 
    // the array elements 
    int xorArr = 0; 
    for (int i = 0; i < n; ++i) 
        xorArr ^= arr[i]; 
  
    // For every element of the array 
    for (int i = 0; i < n; ++i)  
    { 
  
        // Take the XOR after excluding 
        // the current element 
        int x = xorArr ^ arr[i]; 
  
        // If the XOR of the remaining elements 
        // is equal to the current element 
        if (arr[i] == x) 
            return true; 
    } 
  
    // If no such element is found 
    return false; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int [] arr = { 8, 2, 4, 15, 1 }; 
    int n = arr.length; 
  
    if (containsElement(arr, n)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed by ihritik 

