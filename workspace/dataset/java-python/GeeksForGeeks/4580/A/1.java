

// Java implementation of the approach 
import java.io.*; 
  
class GFG  
{ 
      
static int R = 4; 
static int C = 4; 
  
// Function to find the index of first 1 
// in the binary array arr[] 
static int first(int arr[], int low, int high) 
{ 
    if (high >= low)  
    { 
  
        // Get the middle index 
        int mid = low + (high - low) / 2; 
  
        // Check if the element at middle index is first 1 
        if ((mid == 0 || arr[mid - 1] == 0) && arr[mid] == 1) 
            return mid; 
  
        // If the element is 0, recur for right side 
        else if (arr[mid] == 0) 
            return first(arr, (mid + 1), high); 
  
        // If element is not first 1, recur for left side 
        else
            return first(arr, low, (mid - 1)); 
    } 
    return -1; 
} 
  
// Function to print rows with maximum 
// and minimum number of zeroes 
static void rowWith0s(int mat[][]) 
{ 
    // Initialize max values 
    int max_row_index = 0, max = Integer.MIN_VALUE; 
  
    // Initialize min values 
    int min_row_index = 0, min = Integer.MAX_VALUE; 
  
    // Traverse for each row and count number of 0s 
    // by finding the index of first 1 
    int i, index; 
  
    for (i = 0; i < R; i++)  
    { 
        index = first(mat[i], 0, C - 1); 
  
        int cntZeroes = 0; 
  
        // If index = -1, that is there is no 1 
        // in the row, count of zeroes will be C 
        if (index == -1)  
        { 
            cntZeroes = C; 
        } 
  
        // Else, count of zeroes will be index 
        // of first 1 
        else
        { 
            cntZeroes = index; 
        } 
  
        // Find max row index 
        if (max < cntZeroes)  
        { 
            max = cntZeroes; 
            max_row_index = i; 
        } 
  
        // Find min row index 
        if (min > cntZeroes)  
        { 
            min = cntZeroes; 
            min_row_index = i; 
        } 
    } 
  
        System.out.println ("Row with min 0s: " + (min_row_index + 1)); 
        System.out.println ("Row with max 0s: " + (max_row_index + 1)); 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
  
    int mat[][] = { { 0, 0, 0, 1 }, 
                    { 0, 1, 1, 1 }, 
                    { 1, 1, 1, 1 }, 
                    { 0, 0, 0, 0 } }; 
  
    rowWith0s(mat); 
  
  
} 
} 
  
// This code is contributed by ajit. 

