

// Java program to find the 
// Kth smallest element after 
// removing some integer from 
// first n natural number. 
import java.util.Arrays; 
import java.io.*; 
  
class GFG { 
  
    // Return the K-th 
    // smallest element. 
    static int ksmallest(int arr[], 
                         int n, int k) 
    { 
        // sort(arr, arr+n); 
        Arrays.sort(arr); 
  
        // Checking if k lies 
        // before 1st element 
        if (k < arr[0]) 
            return k; 
  
        // If k is the first 
        // element of array arr[]. 
        if (k == arr[0]) 
            return arr[0] + 1; 
  
        // If k is more 
        // than last element 
        if (k > arr[n - 1]) 
            return k + n; 
  
        // If first element 
        // of array is 1. 
        if (arr[0] == 1) 
            k--; 
  
        // Reducing k by numbers 
        // before arr[0]. 
        else
            k -= (arr[0] - 1); 
  
        // Finding k'th smallest 
        // element after removing 
        // array elements. 
        for (int i = 1; i < n; i++) { 
            // Finding count of 
            // element between i-th 
            // and (i-1)-th element. 
            int c = arr[i] - arr[i - 1] - 1; 
            if (k <= c) 
                return arr[i - 1] + k; 
            else
                k -= c; 
        } 
  
        return arr[n - 1] + k; 
    } 
  
    // Driven Code 
    public static void main(String[] args) 
    { 
        int k = 1; 
        int arr[] = { 1 }; 
        int n = arr.length; 
        System.out.println(ksmallest(arr, n, k)); 
    } 
} 
  
// This code is contributed 
// by ajit 

