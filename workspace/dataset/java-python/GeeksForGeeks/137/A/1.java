

// Java program to count pairs (i, j) 
// such that arr[i] * arr[j] = arr[i] + arr[j] 
  
class GFG { 
    // Function to return the count of pairs(i, j) 
    // such that arr[i] * arr[j] = arr[i] + arr[j] 
    static long countPairs(int arr[], int n) 
    { 
        long count = 0; 
  
        for (int i = 0; i < n - 1; i++) { 
            for (int j = i + 1; j < n; j++) { 
  
                // Increment count if condition satisfy 
                if (arr[i] * arr[j] == arr[i] + arr[j]) 
                    count++; 
            } 
        } 
  
        // Return count of pairs 
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        int arr[] = { 2, 0, 3, 2, 0 }; 
        int n = arr.length; 
  
        // Get and print count of pairs 
        System.out.println(countPairs(arr, n)); 
    } 
} 

