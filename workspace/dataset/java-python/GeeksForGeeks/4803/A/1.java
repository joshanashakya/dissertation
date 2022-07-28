

// Java implementation to count  
// pairs from both sorted arrays  
// whose sum is equal to a given  
// value 
import java.io.*; 
  
class GFG { 
  
    // function to count all pairs  
    // from both the sorted arrays  
    // whose sum is equal to a given  
    // value 
    static int countPairs(int arr1[],  
         int arr2[], int m, int n, int x) 
    { 
        int count = 0;  
        int l = 0, r = n - 1; 
          
        // traverse 'arr1[]' from  
        // left to right 
        // traverse 'arr2[]' from  
        // right to left 
        while (l < m && r >= 0) 
        { 
              
            // if this sum is equal  
            // to 'x', then increment 'l',  
            // decrement 'r' and 
            // increment 'count' 
            if ((arr1[l] + arr2[r]) == x) 
            { 
                l++; r--; 
                count++;          
            } 
              
            // if this sum is less  
            // than x, then increment l 
            else if ((arr1[l] + arr2[r]) < x) 
                l++; 
                  
            // else decrement 'r'  
            else
                r--;  
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
        System.out.println( "Count = "
         + countPairs(arr1, arr2, m, n, x)); 
    } 
} 
  
// This code is contributed by anuj_67. 

