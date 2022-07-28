

// Program to calculate the geometric mean 
// of the given array elements. 
import java.math.*; 
  
class GFG{ 
      
    // function to calculate geometric mean 
    // and return float value. 
    static float geometricMean(int arr[], int n) 
    { 
        // declare product variable and 
        // initialize it to 1. 
        float product = 1; 
  
        // Compute the product of all the 
        // elements in the array. 
        for (int i = 0; i < n; i++) 
            product = product * arr[i]; 
  
        // compute geometric mean through  
        // formula pow(product, 1/n) and 
        // return the value to main function. 
        float gm = (float)Math.pow(product, (float)1 / n); 
        return gm; 
    } 
  
    // Driver function 
    public static void main(String args[]) 
    { 
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 }; 
        int n = arr.length ; 
        System.out.println(geometricMean(arr, n)); 
    } 
} 
  
/*This code is contributed by Nikita Tiwari*/

