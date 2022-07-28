

// Java program to print the array 
// after K operations 
import java.io.*; 
   
class GFG { 
      
    // Function to print the array 
    // after K operations 
    static void printArray(int[] A, int n, int K) 
    { 
        // Variables to store the minimum and 
        // the maximum elements of the array 
        int minEle = Integer.MAX_VALUE, 
            maxEle = Integer.MAX_VALUE; 
      
        // Loop to find the minimum and the 
        // maximum elements of the array 
        for (int i = 0; i < n; i++) { 
            minEle = Math.min(minEle, A[i]); 
            maxEle = Math.max(maxEle, A[i]); 
        } 
      
        // If K is not equal to 0 
        if (K != 0) { 
      
            // If K is odd 
            if (K % 2 == 1) { 
      
                // Replace every element with 
                // max - arr[i] 
                for (int i = 0; i < n; i++) 
                    A[i] = maxEle - A[i]; 
            } 
      
            // If K is even 
            else { 
      
                // Replace every element with 
                // A[i] - min 
                for (int i = 0; i < n; i++) 
                    A[i] = A[i] - minEle; 
            } 
        } 
      
        // Printing the array after K operations 
        for (int i = 0; i < n; i++) 
            System.out.print(A[i] + " "); 
    } 
      
    // Driver Code 
    public static void main (String[] args) 
    { 
       
        int[] arr = { 4, 8, 12, 16 }; 
        int K = 4; 
        int N = arr.length; 
      
        printArray(arr, N, K); 
    } 
} 
  
// This code is contributed by shivanisinghss2110 

