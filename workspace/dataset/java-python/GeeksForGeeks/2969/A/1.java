

// Java implementation of the approach 
import java.io.*; 
  
class GFG 
{ 
    static void findMax(int []arr, int n)  
    {  
      
        // To store the maximum element  
        // in the first half  
        int maxFirst = Integer.MIN_VALUE;  
      
        // Middle index of the array  
        int mid = n / 2;  
      
        // Calculate the maximum element  
        // in the first half  
        for (int i = 0; i < mid; i++)  
        { 
            maxFirst = Math.max(maxFirst, arr[i]);  
        } 
      
        // If the size of array is odd then  
        // the middle element will be included  
        // in both the halves  
        if (n % 2 == 1)  
        { 
            maxFirst = Math.max(maxFirst, arr[mid]);  
        } 
          
        // To store the maximum element  
        // in the second half  
        int maxSecond = Integer.MIN_VALUE;  
      
        // Calculate the maximum element  
        // int the second half  
        for (int i = mid; i < n; i++)  
        { 
            maxSecond = Math.max(maxSecond, arr[i]);  
        } 
          
        // Print the found maximums  
        System.out.print(maxFirst + ", " + maxSecond); 
        // cout << maxFirst << ", " << maxSecond;  
    }  
      
    // Driver Code 
    public static void main(String[] args) 
    { 
        int []arr = { 1, 12, 14, 5 };  
        int n = arr.length;  
      
        findMax(arr, n);  
    }  
} 
  
// This code is contributed by anuj_67.. 

