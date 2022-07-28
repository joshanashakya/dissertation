

// java Program to find mean absolute 
// deviation of given array 
import java.io.*; 
  
class GFG { 
          
    // Function to find mean 
    // of the array elements. 
    static float Mean(float arr[], int n) 
    {  
        // Calculate sum of all elements. 
        float sum = 0; 
          
        for (int i = 0; i < n; i++) 
            sum = sum + arr[i]; 
          
        return sum / n; 
    } 
      
    // Function to find mean absolute 
    // deviation of given elements. 
    static float meanAbsDevtion(float arr[], 
                                       int n) 
    {  
        // Calculate the sum of absolute 
        // deviation about mean. 
        float absSum = 0; 
          
        for (int i = 0; i < n; i++) 
            absSum = absSum + Math.abs(arr[i] 
                                - Mean(arr, n)); 
      
        // Return mean absolute  
        // deviation about mean. 
        return absSum / n; 
    } 
      
        // Driver function. 
        public static void main (String[] args) { 
          
        float arr[] = { 10, 15, 15, 17, 18, 21 }; 
        int n = arr.length; 
          
            System.out.println(meanAbsDevtion(arr, n)); 
        } 
} 
  
  
// This code is contributed by vt_m 

