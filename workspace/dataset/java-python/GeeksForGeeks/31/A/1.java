

// Java implementation of the above approach 
class GFG  
{ 
          
    // Naive approach to count pairs 
    // with positive sum. 
      
    // Returns number of pairs in 
    // arr[0..n-1] with positive sum 
    static int CountPairs(int arr[], int n) 
    { 
        // Initialize result 
        int count = 0; 
      
        // Consider all possible pairs 
        // and check their sums 
        for (int i = 0; i < n; i++) { 
            for (int j = i + 1; j < n; j++) { 
      
                // If arr[i] & arr[j] 
                // form valid pair 
                if (arr[i] + arr[j] > 0) 
                    count += 1; 
            } 
        } 
      
        return count; 
    } 
      
    // Driver's Code 
    public static void main (String[] args) 
    { 
        int []arr = { -7, -1, 3, 2 }; 
        int n = arr.length; 
      
        // Function call to find the 
        // count of pairs 
        System.out.println(CountPairs(arr, n)); 
    } 
} 
  
// This code is contributed by Yash_R 

