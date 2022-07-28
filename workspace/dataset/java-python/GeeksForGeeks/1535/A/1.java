

// Java implementation for restoring original  
// sort in rotated sorted array using binary search  
import java.util.*; 
  
class GFG 
{ 
      
    // Function to find start index of array  
    static int findStartIndexOfArray(int arr[],  
                            int low, int high) 
    { 
        if (low > high)  
        { 
            return -1; 
        } 
  
        if (low == high) 
        { 
            return low; 
        } 
  
        int mid = low + (high - low) / 2; 
        if (arr[mid] > arr[mid + 1]) 
        { 
            return mid + 1; 
        } 
  
        if (arr[mid - 1] > arr[mid])  
        { 
            return mid; 
        } 
  
        if (arr[low] > arr[mid]) 
        { 
            return findStartIndexOfArray(arr, low, mid - 1); 
        }  
        else
        { 
            return findStartIndexOfArray(arr, mid + 1, high); 
        } 
    } 
  
    // Function to restore the Original Sort  
    static void restoreSortedArray(int arr[], int n) 
    { 
        // array is already sorted  
        if (arr[0] < arr[n - 1])  
        { 
            return; 
        } 
  
        int start = findStartIndexOfArray(arr, 0, n - 1); 
          
        // In reverse(), the first parameter  
        // is iterator to beginning element  
        // and second parameter is iterator  
        // to last element plus one.  
        Arrays.sort(arr, 0, start); 
        Arrays.sort(arr, start, n); 
        Arrays.sort(arr); 
  
    } 
  
    // Function to print the Array  
    static void printArray(int arr[], int size)  
    { 
        for (int i = 0; i < size; i++)  
        { 
            System.out.print(arr[i] + " "); 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int arr[] = {1, 2, 3, 4, 5}; 
        int n = arr.length; 
        restoreSortedArray(arr, n); 
        printArray(arr, n); 
    } 
} 
  
// This code contributed by Rajput-Ji 

