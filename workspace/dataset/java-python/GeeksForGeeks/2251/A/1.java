

// Java implementation of the approach 
class GFG { 
  
    // Recursive function to return the 
    // total ways to reach the n'th stair 
    static int countWays(int n, int arr[], int len) 
    { 
        // Base case 
        if (n == 0) 
            return 1; 
  
        // To store the number of ways 
        int no_ways = 0; 
  
        // Iterate each element of the given array 
        for (int i = 0; i < len; i++) { 
  
            // Here consider only the values of 
            // "n - arr[i]" >= 0 because negative values 
            // of n in the stair function are 
            // not defined 
            if (n - arr[i] >= 0) { 
                no_ways += countWays(n - arr[i], arr, len); 
            } 
        } 
        return no_ways; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int arr[] = { 1, 3, 5 }; 
        int len = arr.length; 
        ; 
        int n = 5; 
  
        System.out.println(countWays(n, arr, len)); 
    } 
} 

