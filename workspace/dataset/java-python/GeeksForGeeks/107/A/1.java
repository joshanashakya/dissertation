

import java.util.Arrays; 
  
// Java implementation of the approach 
class GFG 
{ 
  
    // Function to find number of unordered pairs 
    static int freqPairs(int arr[], int n)  
    { 
  
        // Maximum element from the array 
        int max = Arrays.stream(arr).max().getAsInt(); 
  
        // Array to store the frequency of each 
        // element 
        int freq[] = new int[max + 1]; 
  
        // Stores the number of unordered pairs 
        int count = 0; 
  
        // Store the frequency of each element 
        for (int i = 0; i < n; i++)  
        { 
            freq[arr[i]]++; 
        } 
  
        // Find the number of unordered pairs 
        for (int i = 0; i < n; i++)  
        { 
            for (int j = 2 * arr[i]; j <= max; j += arr[i]) 
            { 
  
                // If the number j divisible by ith element 
                // is present in the array 
                if (freq[j] >= 1)  
                { 
                    count += freq[j]; 
                } 
            } 
  
            // If the ith element of the array 
            // has frequency more than one 
            if (freq[arr[i]] > 1)  
            { 
                count += freq[arr[i]] - 1; 
                freq[arr[i]]--; 
            } 
        } 
  
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int arr[] = {3, 2, 4, 2, 6}; 
        int n = arr.length; 
  
        System.out.println(freqPairs(arr, n)); 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

