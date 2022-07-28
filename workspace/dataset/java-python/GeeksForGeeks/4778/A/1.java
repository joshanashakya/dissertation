

// Java Program to calculate the geometric mean 
// of the given array elements. 
import java.io.*; 
  
class GFG  
{ 
      
    // function to calculate geometric mean 
    // and return float value. 
    static float geometricMean(int []arr, int n) 
    { 
        // declare sum variable and 
        // initialize it to 1. 
        float sum = 0; 
      
        // Compute the sum of all the 
        // elements in the array. 
        for (int i = 0; i < n; i++) 
            sum = sum + (float)Math.log(arr[i]); 
      
        // compute geometric mean through formula 
        // antilog(((log(1) + log(2) + . . . + log(n))/n) 
        // and return the value to main function. 
        sum = sum / n; 
      
        return (float)Math.exp(sum); 
    } 
      
    // Driver function 
    public static void main (String[] args) 
    { 
        int []arr = { 1, 2, 3, 4, 5, 6, 7, 8 }; 
        int n = arr.length; 
          
        // function call 
        System.out.println(geometricMean(arr, n)); 
      
    } 
} 
  
// This code is contributed by vt_m.  

