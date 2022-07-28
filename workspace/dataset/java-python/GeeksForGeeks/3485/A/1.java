

// Java Program for the above approach 
import java.util.Collections; 
import java.util.Arrays; 
  
public class GfG { 
      
    // This function returns the minimum  
    // cost of the array  
    public static int getMinCost(Integer arr[], int n)  
    {  
        int min_ele = Collections.min(Arrays.asList(arr)); 
        return min_ele * (n - 1);  
    }  
      
    // Driver code  
    public static void main(String []args){ 
          
        Integer[] arr = { 4, 2, 5 }; 
        int n = arr.length; 
          
        System.out.println(getMinCost(arr, n)); 
    } 
} 
  
// This code is contributed by Rituraj Jain 

