

// Java implementation to count pairs from 
// both sorted arrays whose sum is equal 
// to a given value 
import java.io.*; 
  
class GFG { 
          
    // function to count all pairs 
    // from both the sorted arrays  
    // whose sum is equal to a given 
    // value 
    static int countPairs(int []arr1,  
             int []arr2, int m, int n, int x) 
    { 
        int count = 0; 
          
        // generating pairs from  
        // both the arrays 
        for (int i = 0; i < m; i++) 
            for (int j = 0; j < n; j++) 
      
                // if sum of pair is equal  
                // to 'x' increment count  
                if ((arr1[i] + arr2[j]) == x)  
                    count++; 
          
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

