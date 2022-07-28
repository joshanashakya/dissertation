

// Java implementation of the approach 
class GFG 
{ 
      
// Function to return the count of elements 
// from the array which are greater than k 
static int countGreater(int arr[], int n, int k) 
{ 
    int l = 0; 
    int r = n - 1; 
  
    // Stores the index of the left most element 
    // from the array which is greater than k 
    int leftGreater = n; 
  
    // Finds number of elements greater than k 
    while (l <= r) { 
        int m = l + (r - l) / 2; 
  
        // If mid element is greater than 
        // k update leftGreater and r 
        if (arr[m] > k) { 
            leftGreater = m; 
            r = m - 1; 
        } 
  
        // If mid element is less than 
        // or equal to k update l 
        else
            l = m + 1; 
    } 
  
    // Return the count of elements greater than k 
    return (n - leftGreater); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 3, 3, 4, 7, 7, 7, 11, 13, 13 }; 
    int n = arr.length; 
  
    int k = 7; 
  
    System.out.println(countGreater(arr, n, k)); 
} 
} 
  
// This code is contributed by Code_Mech 

