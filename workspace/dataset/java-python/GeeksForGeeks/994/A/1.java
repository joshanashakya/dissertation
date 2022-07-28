

// Java implementation of the approach 
import java.util.*; 
class GFG  
{ 
      
// Function to return the required length 
static int findLen(int []arr, int n, int m) 
{ 
    // To store the filtered numbers 
    Vector<Integer> filter = new Vector<>(); 
  
    // Filtering the numbers 
    for (int i = 0; i < n; i++) 
        if ((arr[i] & m) == m) 
            filter.add(arr[i]); 
  
    // If there are no elements to check 
    if (filter.size() == 0) 
        return 0; 
  
    // Find the AND of all the 
    // filtered elements 
    int c_and = filter.get(0); 
    for (int i = 1; i < filter.size(); i++) 
        c_and &= filter.get(i); 
  
    // Check if the AND is equal to m 
    if (c_and == m) 
        return filter.size(); 
  
    return 0; 
} 
  
// Driver code 
public static void main(String []args)  
{ 
    int arr[] = { 7, 3, 3, 1, 3 }; 
    int n = arr.length; 
    int m = 3; 
  
    System.out.println(findLen(arr, n, m)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

