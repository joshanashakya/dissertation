

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
    // Function to return the minimized sum 
    static int findAnswer(int n, int[] arr) 
    { 
  
        // Sort the array to pair the elements 
        Arrays.sort(arr); 
  
        // Variable to hold the answer 
        int sum = 0; 
  
        // Pair smallest with largest, second 
        // smallest with second largest, and  
        // so on 
        for (int i = 0; i < n / 2; ++i)  
        { 
            sum += (arr[i] + arr[n - i - 1]) 
                    * (arr[i] + arr[n - i - 1]); 
        } 
  
        return sum; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int[] arr = {53, 28, 143, 5}; 
        int n = arr.length; 
        System.out.println(findAnswer(n, arr)); 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

