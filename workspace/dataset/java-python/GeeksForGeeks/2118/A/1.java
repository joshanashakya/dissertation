

// Java implementation of above approach  
  
class GFG { 
  
// function to find longest sub-array  
// whose elements gives same remainder  
// when divided with K  
    static public int LongestSubarray(int arr[], int n, int k) { 
        int count = 1; 
        int max_length = 1; 
        int prev_mod = arr[0] % k; 
  
        // Iterate in the array  
        for (int i = 1; i < n; i++) { 
  
            int curr_mod = arr[i] % k; 
  
            // check if array element  
            // greater then X or not  
            if (curr_mod == prev_mod) { 
                count++; 
            } else { 
  
                max_length = Math.max(max_length, count); 
                count = 1; 
                prev_mod = curr_mod; 
            } 
        } 
  
        return max_length; 
    } 
  
// Driver code  
    public static void main(String[] args) { 
        int arr[] = {4, 9, 7, 18, 29, 11}; 
        int n = arr.length; 
        int k = 11; 
        System.out.print(LongestSubarray(arr, n, k)); 
    } 
} 
// This code is contributed by Rajput-Ji 

