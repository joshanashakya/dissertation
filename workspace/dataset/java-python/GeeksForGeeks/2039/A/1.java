

// Java implementation of the approach 
public class GFG { 
  
    // Function to return the kth odd element 
    // from the array 
    static int kthOdd(int arr[], int n, int k) 
    { 
  
        // Traverse the array 
        for (int i = 0; i < n; i++) { 
  
            // If current element is odd 
            if (arr[i] % 2 == 1) 
                k--; 
  
            // If kth odd element is found 
            if (k == 0) 
                return arr[i]; 
        } 
  
        // Total odd elements in the array are < k 
        return -1; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int arr[] = { 1, 2, 3, 4, 5 }; 
        int n = arr.length; 
        int k = 2; 
        System.out.print(kthOdd(arr, n, k)); 
    } 
} 

