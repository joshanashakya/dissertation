

// Java program to count smaller or equal 
import java.io.*; 
  
class GFG  
{ 
      
// A binary search function to return 
// the number of elements less than 
// or equal to the given key 
static int binarySearchCount(int arr[],  
                             int n, int key) 
{ 
    int left = 0; 
    int right = n - 1; 
  
    int count = 0; 
  
    while (left <= right)  
    { 
        int mid = (right + left) / 2; 
  
        // Check if middle element is 
        // less than or equal to key 
        if (arr[mid] <= key)  
        { 
  
            // At least (mid + 1) elements are there 
            // whose values are less than 
            // or equal to key 
            count = mid + 1; 
            left = mid + 1; 
        } 
  
        // If key is smaller, ignore right half 
        else
            right = mid - 1; 
    } 
    return count; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int arr[] = { 1, 2, 4, 11, 11, 16 }; 
    int key = 11; 
    int n = arr.length; 
  
    System.out.println (binarySearchCount(arr, n, key)); 
} 
} 
  
// The code is contributed by Sachin.  

