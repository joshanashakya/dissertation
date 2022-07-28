

// Java program to find minimum  
// number of swaps to reach a  
// permutation wiht at most 2 left  
// swaps allowed for every element  
class GFG 
{ 
  
    /* This funt merges two sorted 
    arrays and returns inversion  
    count in the arrays.*/
    static int merge(int arr[], int temp[], int left, 
                                int mid, int right) 
    { 
        int inv_count = 0; 
  
        int i = left; 
          
        /* i is index for left subarray*/
        int j = mid; 
          
        /* j is index for right subarray*/
        int k = left; 
          
        /* k is index for resultant merged subarray*/
        while ((i <= mid - 1) && (j <= right))  
        { 
            if (arr[i] <= arr[j]) 
            { 
                temp[k++] = arr[i++]; 
            }  
            else
            { 
                temp[k++] = arr[j++]; 
                inv_count = inv_count + (mid - i); 
            } 
        } 
  
        /* Copy the remaining elements  
        of left subarray (if there 
         are any) to temp*/
        while (i <= mid - 1)  
        { 
            temp[k++] = arr[i++]; 
        } 
  
        /* Copy the remaining elements  
        of right subarray (if there 
        are any) to temp*/
        while (j <= right) 
        { 
            temp[k++] = arr[j++]; 
        } 
  
        /* Copy back the merged elements 
        to original array*/
        for (i = left; i <= right; i++)  
        { 
            arr[i] = temp[i]; 
        } 
  
        return inv_count; 
    } 
  
    /* An auxiliary recursive function  
     that sorts the input array and 
     returns the number of inversions  
    in the array. */
    static int _mergeSort(int arr[], int temp[],  
                            int left, int right) 
    { 
        int mid, inv_count = 0; 
        if (right > left)  
        { 
            /* Divide the array into two parts and  
            call _mergeSortAndCountInv() for each  
            of the parts */
            mid = (right + left) / 2; 
  
            /* Inversion count will be sum of inversions  
            in left-part, right-part and number of inversions  
            in merging */
            inv_count = _mergeSort(arr, temp, left, mid); 
            inv_count += _mergeSort(arr, temp, mid + 1, right); 
  
            /* Merge the two parts*/
            inv_count += merge(arr, temp, left, mid + 1, right); 
        } 
        return inv_count; 
    } 
  
  
    /* This function sorts the input array and returns the  
    number of inversions in the array */
    static int mergeSort(int arr[], int array_size) 
    { 
        int[] temp = new int[array_size]; 
        return _mergeSort(arr, temp, 0, array_size - 1); 
    } 
  
    // method returns minimum number of   
    // swaps to reach permuted array 'arr'  
    static int minSwapToReachArr(int arr[], int N)  
    { 
        // loop over all elements to check Invalid  
        // permutation condition  
        for (int i = 0; i < N; i++) 
        { 
            /* if an element is at distance more than 2  
            from its actual position then it is not  
            possible to reach permuted array just  
            by swapping with 2 positions left elements  
            so returning -1 */
            if ((arr[i] - 1) - i > 2) 
            { 
                return -1; 
            } 
        } 
  
        /* If permuted array is not Invalid, then number  
        of Inversion in array will be our final answer */
        int numOfInversion = mergeSort(arr, N); 
        return numOfInversion; 
    } 
  
    // Driver code  
    public static void main(String[] args)  
    { 
          
        // change below example  
        int arr[] = {1, 2, 5, 3, 4}; 
        int N = arr.length; 
        int res = minSwapToReachArr(arr, N); 
        System.out.println(res == -1 ? "Not Possible\n" : res); 
    } 
} 
  
// This code contributed by Rajput-Ji 

