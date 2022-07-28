

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
      
// Function that returns true if the 
// given four integers are in proportion 
static boolean inProportion(int []arr) 
{ 
  
    // Array will consist of 
    // only four integers 
    int n = 4; 
  
    // Sort the array 
    Arrays.sort(arr); 
  
    // Find the product of extremes and means 
    long extremes = (long)arr[0] * (long)arr[3]; 
    long means = (long)arr[1] * (long)arr[2]; 
  
    // If the products are equal 
    if (extremes == means) 
        return true; 
    return false; 
} 
  
// Driver code 
public static void main(String args[])  
{ 
    int arr[] = { 1, 2, 4, 2 }; 
  
    if (inProportion(arr)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed by Rajput-Ji 

