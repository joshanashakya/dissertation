

// Java implementation of find fixed  
// index using binary search 
class GFG 
{ 
    // Main Function to find fixed  
    // index using binary search 
    static int binarySearch(int arr[], int low,  
                                      int high) 
    { 
        if (high < low) 
            return -1; 
      
        // low + (high - low) / 2 
        int mid = (low + high) / 2;  
        int midValue = arr[mid]; 
      
        if (mid == arr[mid]) 
            return mid; 
      
        // Search left 
        int leftindex = Math.min(mid - 1, midValue); 
        int left = binarySearch(arr, low, leftindex); 
      
        if (left >= 0) 
            return left; 
      
        // Search right 
        int rightindex = Math.max(mid + 1, midValue); 
        int right = binarySearch(arr, rightindex, high); 
  
        return right; 
    } 
      
    // Driver code 
    public static void main(String[] args)  
    { 
        // input 1 
        int arr[] = {-10, -5, 2, 2, 2,  
                     3, 4, 7, 9, 12, 13}; 
                       
        System.out.println("Fixed Point is " +  
            binarySearch(arr, 0, arr.length - 1)); 
          
        // input 2 
        int arr1[] = {-10, -1, 3, 3, 10, 
                        30, 30, 50, 100}; 
                          
        System.out.println("Fixed Point is " +  
            binarySearch(arr1, 0, arr1.length - 1)); 
    } 
} 

