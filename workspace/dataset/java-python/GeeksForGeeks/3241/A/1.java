

// Java program to check if array contains  
// contiguous integers with duplicates 
// allowed in O(1) space 
import java.util.*; 
  
class GFG 
{ 
      
// Function to return true or 
// false 
static boolean check(int arr[], int n) 
{ 
  
    int k = Integer.MIN_VALUE; 
    int r = Integer.MAX_VALUE; 
  
    // To find the max and min 
    // in the array 
    for (int i = 0; i < n; i++) 
    { 
        k = Math.max(k, arr[i]); 
        r = Math.min(r, arr[i]); 
    } 
  
    k += 1; 
  
    // Update the array with 
    // the difference from 
    // the max element 
    for (int i = 0; i < n; i++) 
        arr[i] = k - arr[i]; 
  
    for (int i = 0; i < n; i++) 
    { 
  
        // if the element is positive 
        // and less than the size of 
        // array(in range), make it negative 
        if (Math.abs(arr[i]) - 1 < n &&  
        arr[Math.abs(arr[i]) - 1] > 0)  
        { 
            arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1]; 
        } 
    } 
  
    int flag = 0; 
  
    // Loop from 0 to end of the array 
    for (int i = 0; i <= k - r - 1; i++) 
    { 
  
        // Found positive, out of range 
        if (arr[i] > 0) 
        { 
            flag = 1; 
            break; 
        } 
    } 
    return flag == 0; 
} 
  
// Driver function 
public static void main(String []args) 
{ 
  
    // Given array 
    int arr[] = { 5, 2, 3, 6, 4, 4, 6, 6 }; 
    int n = arr.length; 
  
    // Function Calling 
    if (check(arr, n)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed by Surendra_Gangwar 

