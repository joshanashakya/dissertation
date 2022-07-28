

// JAVA program to find min cost to make 
// XOR of whole array zero 
import java.lang.*; 
  
class GFG 
{ 
    // function to find min cost 
    static void minCost(int[] arr, int n) 
    { 
        int cost = Integer.MAX_VALUE; 
        int element=0; 
  
        // calculate XOR sum of array 
        int XOR = 0; 
        for (int i = 0; i < n; i++) 
            XOR ^= arr[i]; 
  
        // find the min cost and element  
        // corresponding 
        for (int i = 0; i < n; i++) { 
            if (cost > Math.abs((XOR ^ arr[i]) 
                                - arr[i])) { 
                cost = Math.abs((XOR ^ arr[i]) - 
                                       arr[i]); 
                element = arr[i]; 
            } 
        } 
  
    System.out.println("Element = " + element); 
    System.out.println("Operation required = "+ 
                             Math.abs(cost)); 
    } 
  
    // driver program 
    public static void main (String[] args) 
    { 
        int[] arr = { 2, 8, 4, 16 }; 
        int n = arr.length; 
        minCost(arr, n); 
    } 
} 
/* This code is contributed by Kriti Shukla */

