

// Java implementation of the approach 
class GFG 
{ 
  
static int m = 6, n = 4; 
  
// Function that compares both the arrays 
// and returns -1, 0 and 1 accordingly 
static int compareRow(int a1[], int a2[]) 
{ 
    for (int i = 0; i < n; i++)  
    { 
  
        // Return 1 if mid row is less than arr[] 
        if (a1[i] < a2[i]) 
            return 1; 
  
        // Return 1 if mid row is greater than arr[] 
        else if (a1[i] > a2[i]) 
            return -1; 
    } 
  
    // Both the arrays are equal 
    return 0; 
} 
  
// Function to find a row in the 
// given matrix using binary search 
static int binaryCheck(int ar[][], int arr[]) 
{ 
    int l = 0, r = m - 1; 
    while (l <= r)  
    { 
        int mid = (l + r) / 2; 
        int temp = compareRow(ar[mid], arr); 
  
        // If current row is equal to the given 
        // array then return the row number 
        if (temp == 0) 
            return mid + 1; 
  
        // If arr[] is greater, ignore left half 
        else if (temp == 1) 
            l = mid + 1; 
  
        // If arr[] is smaller, ignore right half 
        else
            r = mid - 1; 
    } 
  
    // No valid row found 
    return -1; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int mat[][] = { { 0, 0, 1, 0 }, 
                    { 10, 9, 22, 23 }, 
                    { 40, 40, 40, 40 }, 
                    { 43, 44, 55, 68 }, 
                    { 81, 73, 100, 132 }, 
                    { 100, 75, 125, 133 } }; 
    int row[] = { 10, 9, 22, 23 }; 
  
    System.out.println(binaryCheck(mat, row)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

