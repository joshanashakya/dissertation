

// Java program to find minimum and maximum  
// sum of absolute differences of pairs 
import java.util.Arrays; 
  
class GFG 
{ 
    // function to calculate minimum sum 
    static int calculate_min_sum(int[] a, int n) 
    { 
        // sorts the array c++ stl 
        Arrays.sort(a); 
  
        // initially min=0 and max=0 
        int min_sum = 0; 
  
        // traverse to find the minimum sum 
        for (int i = 1; i < n; i += 2) { 
  
            // the adjacent elements difference 
            // will always be smaller 
            min_sum += Math.abs(a[i] - a[i - 1]); 
        } 
        return min_sum; 
    } 
  
    // function to calculate maximum sum 
    static int calculate_max_sum(int[] a, int n) 
    { 
        // sorts the array c++ stl 
        Arrays.sort(a); 
  
        int max_sum = 0; 
  
        // traverse to find the maximum sum 
        for (int i = 0; i < n / 2; i++) { 
          
            // the farthest distant elements sum  
            // will always be maximum 
            max_sum += Math.abs(a[n - 1 - i] - a[i]); 
        } 
        return max_sum; 
    } 
  
    // Driver program to test above function     
    public static void main (String[] args) { 
    int[] a = { 10, -10, 20, -40}; 
  
    int n = a.length; 
      
    System.out.println("The minimum sum of pairs is " + 
                          calculate_min_sum(a, n));  
  
    System.out.println("The maximum sum of pairs is " + 
                           calculate_max_sum(a, n));  
      
    } 
} 
  
/* This code is contributed by Mr. Somesh Awasthi */

