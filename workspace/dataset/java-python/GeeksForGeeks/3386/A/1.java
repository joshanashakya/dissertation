

// Java program to make an 
// array decreasing 
import java.util.*; 
import java.lang.*; 
  
public class GfG{ 
      
    // Function to count minimum no of operation 
    public static int min_noOf_operation(int arr[],  
                                      int n, int k) 
    { 
        int noOfSubtraction; 
        int res = 0; 
          
        for (int i = 1; i < n; i++) { 
            noOfSubtraction = 0; 
  
            if (arr[i] > arr[i - 1]) { 
      
                // Count how many times  
                // we have to subtract. 
                noOfSubtraction = (arr[i] - arr[i - 1]) / k; 
  
                // Check an additional subtraction  
                // is required or not. 
                if ((arr[i] - arr[i - 1]) % k != 0) 
                    noOfSubtraction++; 
  
                // Modify the value of arr[i] 
                arr[i] = arr[i] - k * noOfSubtraction; 
            } 
  
            // Count total no of subtraction 
            res = res + noOfSubtraction; 
        } 
  
        return res; 
    } 
      
    // driver function 
    public static void main(String argc[]){ 
        int arr = { 1, 1, 2, 3 }; 
        int N = 4; 
        int k = 5; 
        System.out.println(min_noOf_operation(arr, 
                                           N, k));  
    } 
      
} 
  
/* This code is contributed by Sagar Shukla */

