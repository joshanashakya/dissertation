

// Java implementation of the above approach 
import java.util.*; 
  
class GFG { 
  
      
    // Function to return the largest sum 
    static int largest_sum(int arr[], int n) 
    { 
        // Variable to store the largest sum 
        int maximum = -1; 
      
        // Map to store the frequencies 
        // of each element 
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();  
      
        // Store the Frequencies 
        for (int i = 0; i < n; i++) { 
              
            if (m.containsKey(arr[i])){ 
            m.put(arr[i], m.get(arr[i]) + 1);  
            } 
            else{ 
                m.put(arr[i], 1);  
            } 
        } 
      
        // Loop to combine duplicate elements 
        // and update the sum in the map 
        for(int i = 0; i < n; i++){ 
  
            // If j is a duplicate element 
            if (m.get(arr[i]) > 1) { 
                  
                if (m.containsKey(2*arr[i])) 
                { 
                    // Update the frequency of 2*j 
                    m.put(2*arr[i],m.get(2 * arr[i])+ m.get(arr[i]) / 2); 
                } 
                else
                { 
                    m.put(2*arr[i],m.get(arr[i]) / 2); 
                } 
                  
                // If the new sum is greater than 
                // maximum value, Update the maximum 
                if (2 * arr[i] > maximum) 
                    maximum = 2 * arr[i]; 
            } 
            } 
      
        // Returns the largest sum 
        return maximum; 
    } 
      
    // Driver Code 
    public static void main (String[] args)  
    { 
        int arr[] = { 1, 1, 2, 4, 7, 8 }; 
        int n = arr.length; 
          
        // Function Calling 
        System.out.println(largest_sum(arr, n)); 
    } 
} 
  
// This code is contributed by Yash_R 

