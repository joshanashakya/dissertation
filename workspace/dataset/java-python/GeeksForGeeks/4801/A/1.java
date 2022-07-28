

// Java implementation to count  
// pairs from both sorted arrays  
// whose sum is equal to a given 
// value 
import java.io.*; 
class GFG { 
  
// function to search 'value'  
// in the given array 'arr[]'  
// it uses binary search technique  
// as 'arr[]' is sorted  
static boolean isPresent(int arr[], int low, 
                         int high, int value) 
{ 
    while (low <= high) 
    { 
        int mid = (low + high) / 2; 
          
        // value found 
        if (arr[mid] == value) 
            return true;      
              
        else if (arr[mid] > value)  
            high = mid - 1; 
        else
            low = mid + 1;  
    } 
      
    // value not found 
    return false; 
} 
  
// function to count all pairs  
// from both the sorted arrays  
// whose sum is equal to a given 
// value 
static int countPairs(int arr1[], int arr2[], 
                      int m, int n, int x) 
{ 
    int count = 0;  
    for (int i = 0; i < m; i++) 
    { 
          
        // for each arr1[i] 
        int value = x - arr1[i]; 
          
        // check if the 'value' 
        // is present in 'arr2[]' 
        if (isPresent(arr2, 0, n - 1, value)) 
            count++; 
    } 
      
    // required count of pairs  
    return count; 
} 
  
    // Driver Code 
    public static void main (String[] args)  
    { 
        int arr1[] = {1, 3, 5, 7}; 
        int arr2[] = {2, 3, 5, 8}; 
        int m = arr1.length; 
        int n = arr2.length; 
        int x = 10; 
        System.out.println("Count = "
              + countPairs(arr1, arr2, m, n, x)); 
    } 
} 
  
// This code is contributed by anuj_67. 

