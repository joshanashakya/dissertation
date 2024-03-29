

// Java program to find Maximum difference  
// between two elements such that larger  
// element appears after the smaller number 
class MaximumDiffrence  
{ 
    int maxDiff(int arr[], int n)  
    { 
        // Create a diff array of size n-1. The array will hold 
        //  the difference of adjacent elements 
        int diff[] = new int[n - 1]; 
        for (int i = 0; i < n - 1; i++) 
            diff[i] = arr[i + 1] - arr[i]; 
  
        // Now find the maximum sum subarray in diff array 
        int max_diff = diff[0]; 
        for (int i = 1; i < n - 1; i++)  
        { 
            if (diff[i - 1] > 0)  
                diff[i] += diff[i - 1]; 
            if (max_diff < diff[i]) 
                max_diff = diff[i]; 
        } 
        return max_diff; 
    } 
  
    // Driver program to test above functions 
    public static void main(String[] args)  
    { 
        MaximumDiffrence mxdif = new MaximumDiffrence(); 
        int arr[] = {80, 2, 6, 3, 100}; 
        int size = arr.length; 
        System.out.println(mxdif.maxDiff(arr, size)); 
    } 
} 
// This code has been contributed by Mayank Jaiswal 

