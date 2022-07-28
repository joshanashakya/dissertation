

// Java program to find minimum number of steps 
// to make the array equal to the given array. 
import java.util.*; 
import java.lang.*; 
  
public class GfG { 
    // function to calculate min_Steps 
    public static int minSteps(int arr[], int n) 
    { 
        int min_Steps = 0; 
        for (int i = 0; i < n; i++) { 
            if (i > 0)  
                min_Steps +=  
                    Math.abs(arr[i] - arr[i - 1]); 
              
            // first element of arr. 
            else
                min_Steps += Math.abs(arr[i]); 
        } 
        return min_Steps; 
    } 
  
    // driver function 
    public static void main(String argc[]) 
    { 
        int[] arr = new int[] { 1, 2, 2, 1 }; 
        int n = 4; 
        System.out.println(minSteps(arr, n)); 
    } 
} 

