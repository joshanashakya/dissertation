

// Java program to count pairs (i, j) 
// such that arr[i] * arr[j] = arr[i] + arr[j] 
  
class GFG { 
    // Function to return the count of pairs(i, j) 
    // such that arr[i] * arr[j] = arr[i] + arr[j] 
    static long countPairs(int arr[], int n) 
    { 
  
        int countZero = 0; 
        int countTwo = 0; 
  
        // Count number of 0's and 2's in the array 
        for (int i = 0; i < n; i++) { 
            if (arr[i] == 0) 
                countZero++; 
  
            else if (arr[i] == 2) 
                countTwo++; 
        } 
  
        // Total pairs due to occurence of 0's 
        long pair0 = (countZero * (countZero - 1)) / 2; 
  
        // Total pairs due to occurence of 2's 
        long pair2 = (countTwo * (countTwo - 1)) / 2; 
  
        // Return count of all pairs 
        return pair0 + pair2; 
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

