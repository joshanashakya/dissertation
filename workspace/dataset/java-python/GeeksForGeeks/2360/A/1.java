

// Java program to find minimum flip required to make 
// XOR of two arrays equal to another array with 
// constraints on number of flip on each array. 
import java.io.*; 
  
class GFG { 
  
    // Return minimum number of flip required 
    static int minflip(int[] arr1, int[] arr2, int[] arr3, 
                                      int p, int q, int n) 
    { 
        int flip = 0; 
  
        // Counting number of mismatch, XOR of arr1[] and 
        // arr2[] is not equal to arr3[]. 
        for (int i = 0; i < n; i++) 
            if (arr1[i] > 0 ^ arr2[i] > 0 != arr3[i] > 0) 
                flip++; 
  
        // if flip is less then allowed constraint return 
        // it. else return -1. 
        return (flip <= p + q) ? flip : -1; 
    } 
  
    // Driver program 
    static public void main(String[] args) 
    { 
        int[] arr1 = {1, 0, 1, 1, 1, 1, 1}; 
        int[] arr2 = {0, 1, 1, 1, 1, 0, 0}; 
        int[] arr3 = {1, 1, 1, 1, 0, 0, 1}; 
  
        int n = arr1.length; 
        int p = 2, q = 4; 
  
        System.out.println(minflip(arr1, arr2, arr3, p, q, n)); 
    } 
} 
  
// This code is contributed by vt_m. 

