

// Java program to find missing k numbers 
// in an array. 
import java.util.Arrays; 
  
class GFG { 
    // Prints first k natural numbers in 
    // arr[0..n-1] 
    static void printKMissing(int[] arr, int n, int k) 
    { 
        Arrays.sort(arr); 
  
        // Find first positive number 
        int i = 0; 
        while (i < n && arr[i] <= 0) 
            i++; 
  
        // Now find missing numbers 
        // between array elements 
        int count = 0, curr = 1; 
        while (count < k && i < n) { 
            if (arr[i] != curr) { 
                System.out.print(curr + " "); 
                count++; 
            } 
            else
                i++; 
            curr++; 
        } 
  
        // Find missing numbers after 
        // maximum. 
        while (count < k) { 
            System.out.print(curr + " "); 
            curr++; 
            count++; 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int[] arr = { 2, 3, 4 }; 
        int n = arr.length; 
        int k = 3; 
        printKMissing(arr, n, k); 
    } 
} 
/* This code is contributed by Mr. Somesh Awasthi */

