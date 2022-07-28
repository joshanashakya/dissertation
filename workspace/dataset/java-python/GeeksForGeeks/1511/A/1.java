

// Java program to find maximum value (arr[i]-i) 
// - (arr[j]-j) in an array. 
import java.io.*; 
  
class GFG { 
  
    // Returns maximum value of (arr[i]-i) -  
    // (arr[j]-j) 
    static int findMaxDiff(int arr[], int n)     
    { 
        if (n < 2) 
        { 
            System.out.println("Invalid "); 
            return 0; 
        } 
  
        // Find maximum of value of arr[i] - i  
        // for all possible values of i. Let  
        // this value be max_val. Find minimum 
        // of value of arr[i] - i for all 
        // possible values of i. Let this value 
        // be min_val. The difference max_val - 
        // min_v 
        int min_val = Integer.MAX_VALUE, 
            max_val = Integer.MIN_VALUE; 
          
        for (int i = 0; i < n; i++) 
        { 
            if ((arr[i]-i) > max_val) 
                max_val = arr[i] - i; 
                  
            if ((arr[i]-i) < min_val) 
                min_val = arr[i]-i; 
        } 
  
        return (max_val - min_val); 
    } 
  
    // Driver program 
    public static void main(String[] args) 
    { 
        int arr[] = {9, 15, 4, 12, 13}; 
        int n = arr.length; 
        System.out.println(findMaxDiff(arr, n)); 
    } 
} 
// This code is contributed by Prerna Saini 

