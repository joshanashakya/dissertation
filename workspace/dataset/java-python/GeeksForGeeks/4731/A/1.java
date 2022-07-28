

// Java implementation of the approach 
class GFG { 
  
    // Function to return the element from the array 
    // which has the maximum set bits 
    static int maxBitElement(int arr[], int n) 
    { 
  
        // To store the required element and 
        // the maximum set bits so far 
        int num = 0, max = -1; 
  
        for (int i = 0; i < n; i++) { 
  
            // Count of set bits in 
            // the current element 
            int cnt = Integer.bitCount(arr[i]); 
  
            // Update the max 
            if (cnt > max) { 
                max = cnt; 
                num = arr[i]; 
            } 
        } 
        return num; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = { 3, 2, 4, 7, 1, 10, 5, 8, 9, 6 }; 
        int n = arr.length; 
        System.out.print(maxBitElement(arr, n)); 
    } 
} 

