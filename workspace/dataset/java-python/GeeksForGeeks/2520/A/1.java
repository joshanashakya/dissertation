

// Java implementation of the above approach 
  
class GFG { 
  
    // Returns the minimum number of eliminations 
    static int min_elimination(int n, int[] arr) 
    { 
        int count = 0; 
  
        // Stores the previous element 
        int prev_val = arr[0]; 
  
        // Stores the new value 
        for (int i = 1; i < n; i++) { 
            int curr_val = arr[i]; 
  
            // Check if the previous and current 
            // values are of same parity 
            if (curr_val % 2 == prev_val % 2) 
                count++; 
  
            // Previous value is now the current value 
            prev_val = curr_val; 
        } 
  
        // Return the counter variable 
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int[] arr = new int[] { 1, 2, 3, 7, 9 }; 
        int n = arr.length; 
  
        System.out.println(min_elimination(n, arr)); 
    } 
} 

