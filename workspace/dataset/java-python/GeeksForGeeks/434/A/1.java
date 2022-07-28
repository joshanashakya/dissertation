

// Java program to count all pair that 
// hold condition i*arr[i] > j*arr[j] 
import java.io.*; 
  
class GFG  
{ 
    // This function merges two sorted arrays and 
    // returns inversion count in the arrays. 
    static int merge(int arr[], int temp[], int left, 
                                   int mid, int right) 
    { 
        int inv_count = 0; 
          
        /* index for left subarray*/ 
        int i = left;  
          
        /* index for right subarray*/
        int j = mid;  
        /* ndex for resultant subarray*/
        int k = left;  
          
        while ((i <= mid - 1) && (j <= right)) 
        { 
            if (arr[i] <= arr[j]) 
                temp[k++] = arr[i++]; 
            else
            { 
                temp[k++] = arr[j++]; 
      
                inv_count = inv_count + (mid - i); 
            } 
        } 
      
        /* Copy the remaining elements of left 
        subarray (if there are any) to temp*/
        while (i <= mid - 1) 
            temp[k++] = arr[i++]; 
      
        /* Copy the remaining elements of right 
        subarray (if there are any) to temp*/
        while (j <= right) 
            temp[k++] = arr[j++]; 
      
        // Copy back the merged elements  
        // to original array 
        for (i = left; i <= right; i++) 
            arr[i] = temp[i]; 
      
        return inv_count; 
    } 
      
    /* An auxiliary recursive function  
    that sorts the input array and  
    returns the number of inversions  
    in the array. */
    static int _mergeSort(int arr[], int temp[],  
                               int left,int right) 
    { 
        int mid, inv_count = 0; 
        if (right > left) 
        { 
            /* Divide the array into two parts and call 
            _mergeSortAndCountInv() for each of 
            the parts */
            mid = (right + left) / 2; 
      
            // Inversion count will be sum of inversions in 
            // left-part, right-part and number of inversions 
            // in merging  
            inv_count = _mergeSort(arr, temp, left, mid); 
            inv_count += _mergeSort(arr, temp, mid+1, right); 
      
            /*Merge the two parts*/
            inv_count += merge(arr, temp, left, mid+1, right); 
        } 
      
        return inv_count; 
    } 
      
    // This function sorts the input array and 
    // returns the number of inversions in the 
    // array  
    static int countPairs(int arr[], int n) 
    { 
        // Modify the array so that problem reduces to 
        // count inversion problem. 
        for (int i = 0; i < n; i++) 
            arr[i] = i * arr[i]; 
      
        // Count inversions using same logic as 
        // below post 
        // https://www.geeksforgeeks.org/counting-inversions/ 
        int temp[] = new int [n]; 
        return _mergeSort(arr, temp, 0, n - 1); 
    } 
      
    // Driver code 
  
    public static void main (String[] args)  
    { 
        int arr[] = {5, 0, 10, 2, 4, 1, 6}; 
        int n = arr.length; 
        System.out.print( "Count of Pairs : "
                          + countPairs(arr, n));   
          
    } 
} 
  
// This code is contributed by vt_m 

