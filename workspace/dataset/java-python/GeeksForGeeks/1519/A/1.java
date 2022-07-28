

// Java implementation of the approach  
import java.util.Arrays; 
  
class GFG 
{ 
  
    // Function to return the minimum  
    // operations required  
    static int minOperations(int[] arr, int n)  
    { 
        int maxi, result = 0; 
  
        // Count the frequency of each element  
        int[] freq = new int[1000001]; 
        for (int i = 0; i < n; i++) 
        { 
            int x = arr[i]; 
            freq[x]++; 
        } 
  
        // Maximum element from the array  
        maxi = Arrays.stream(arr).max().getAsInt(); 
        for (int i = 1; i <= maxi; i++)  
        { 
            if (freq[i] != 0) 
            { 
  
                // Find all the multiples of i  
                for (int j = i * 2; j <= maxi; j = j + i)  
                { 
  
                    // Delete the multiples  
                    freq[j] = 0; 
                } 
  
                // Increment the operations  
                result++; 
            } 
        } 
        return result; 
    } 
  
    // Driver code  
    public static void main(String[] args) 
    { 
        int arr[] = {2, 4, 2, 4, 4, 4}; 
        int n = arr.length; 
  
        System.out.println(minOperations(arr, n)); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

