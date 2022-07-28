

// java implementation of the approach 
class GFG { 
  
    // Function to return the total number 
    // of ways to reach the n'th stair 
    static int countWays(int n, int arr[], int len) 
    { 
  
        // To store the number of ways 
        // to reach the ith stair 
        int count[] = new int[n + 1]; 
        count[0] = 1; 
  
        // Base case 
        if (n == 0) 
            return 1; 
  
        // For every stair 
        for (int i = 1; i <= n; i++) { 
  
            // To store the count of ways 
            // till the current stair 
            int no_ways = 0; 
  
            // Every step from the array 
            for (int j = 0; j < len; j++) { 
  
                // Here consider only 
                // the values of "i - arr[j]" >= 0 
                // because negative values 
                // indicates reverse climbing 
                // of steps 
                if (i - arr[j] >= 0) { 
                    no_ways += count[i - arr[j]]; 
                } 
                count[i] = no_ways; 
            } 
        } 
  
        return count[n]; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int arr[] = { 1, 3, 5 }; 
        int len = arr.length; 
        int n = 5; 
  
        System.out.print(countWays(n, arr, len)); 
    } 
} 

