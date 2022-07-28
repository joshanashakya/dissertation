

// Java Program to find the Length of the longest 
// Subarray with only Even Elements 
public class GFG { 
  
    // Function to find the Length of the longest 
    // Subarray with only Even Elements 
    static int maxEvenSubarray(int array[], int N) 
    { 
        int ans = 0; 
        int count = 0; 
  
        // Iterate the loop 
        for (int i = 0; i < array.length; i++) { 
  
            // Check whether the element is 
            // even in continuous fashion 
            if (array[i] % 2 == 0) { 
                count++; 
                ans = Math.max(ans, count); 
            } 
  
            else { 
                // If element are not even in continuous 
                // fashion. Reinitialize the count 
                count = 0; 
            } 
        } 
  
        // Check for the last element in the array 
        ans = Math.max(ans, count); 
        return ans; 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
        int arr[] = { 9, 8, 5, 4, 4, 4, 2, 4, 1 }; 
  
        int N = arr.length; 
  
        System.out.println(maxEvenSubarray(arr, N)); 
    } 
} 

