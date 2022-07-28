

// Java program to count maximum 
// contiguous even numbers 
import java.io.*; 
  
class GFG 
{ 
  
// Function to count maximum 
// contiguous even numbers 
static int countMaxContiguous(int arr[], int n) 
{ 
    int current_max = 0, max_so_far = 0; 
  
    for (int i = 0; i < n; i++) 
    { 
  
        // If current element is not  
        // even reset current_max 
        if (arr[i] % 2 != 0) 
            current_max = 0; 
  
        // If even element is found, increment 
        // current_max and update result if 
        // count becomes more 
        else
        { 
            current_max++; // increase count 
            max_so_far = Math.max(current_max,  
                                  max_so_far); 
        } 
    } 
  
    return max_so_far; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int arr[] = { 1, 0, 2, 4, 3, 8, 9 }; 
      
    int n = arr.length; 
      
    System.out.println(countMaxContiguous(arr, n)); 
} 
} 
  
// This code is contributed 
// by inder_verma 

