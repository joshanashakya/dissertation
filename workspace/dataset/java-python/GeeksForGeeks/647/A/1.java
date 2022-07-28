

// Java program to minimize the difference between  
// minimum and maximum elements  
import java.util.*; 
  
class GFG  
{ 
  
    // Function to minimize the difference between  
    // minimum and maximum elements  
    static int minimizeDiff(int[] arr, int n, int k) 
    { 
        // Find max and min elements of the array  
        int max = Arrays.stream(arr).max().getAsInt(); 
        int min = Arrays.stream(arr).min().getAsInt(); 
  
        // Check whether the difference between  
        // the max and min element is less than  
        // or equal to k or not  
        if ((max - min) <= k) 
        { 
            return (max - min); 
        } 
  
        // Calculate average of max and min  
        int avg = (max + min) / 2; 
  
        for (int i = 0; i < n; i++)  
        { 
            // If the array element is greater than the  
            // average then decrease it by k  
            if (arr[i] > avg)  
            { 
                arr[i] -= k; 
            }  
              
            // If the array element is smaller than the  
            // average then increase it by k  
            else 
            { 
                arr[i] += k; 
            } 
        } 
  
        // Find max and min of the modified array  
        max = Arrays.stream(arr).max().getAsInt(); 
        min = Arrays.stream(arr).min().getAsInt(); 
  
        // return the new difference  
        return (max - min); 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int arr[] = {3, 16, 12, 9, 20}; 
        int n = 5; 
        int k = 3; 
  
        System.out.println("Max height difference = "
                + minimizeDiff(arr, n, k)); 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

