

// Java implementation of the approach 
class GFG 
{ 
  
    // Function that returns the second largest 
    // element in the array if exists, else 0 
    static int getMaxValue(int arr[], int arr_size)  
    { 
        int i, first, second; 
  
        // There must be at least two elements 
        if (arr_size < 2) 
        { 
            return 0; 
        } 
  
        // To store the maximum and the second 
        // maximum element from the array 
        first = second = Integer.MIN_VALUE; 
        for (i = 0; i < arr_size; i++) 
        { 
  
            // If current element is greater than first 
            // then update both first and second 
            if (arr[i] > first) 
            { 
                second = first; 
                first = arr[i]; 
            }  
              
            // If arr[i] is in between first and 
            // second then update second 
            else if (arr[i] > second && arr[i] != first)  
            { 
                second = arr[i]; 
            } 
        } 
  
        // No second maximum found 
        if (second == Integer.MIN_VALUE) 
        { 
            return 0; 
        }  
        else
        { 
            return second; 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = {4, 5, 1, 8}; 
        int n = arr.length; 
        System.out.println(getMaxValue(arr, n)); 
    } 
}  
  
// This code has been contributed by 29AjayKumar 

