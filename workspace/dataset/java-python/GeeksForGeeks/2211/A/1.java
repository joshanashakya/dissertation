

// Java program to count the number of ways to 
// divide an array into two halves 
// with the same sum 
class GFG  
{ 
  
    // Function to count the number of ways to 
    // divide an array into two halves 
    // with same sum 
    static int cntWays(int arr[], int n) 
    { 
        // if length of array is 1 
        // answer will be 0 as we have 
        // to split it into two 
        // non-empty halves 
        if (n == 1)  
        { 
            return 0; 
        } 
  
        // variables to store total sum, 
        // current sum and count 
        int tot_sum = 0, sum = 0, ans = 0; 
  
        // finding total sum 
        for (int i = 0; i < n; i++)  
        { 
            tot_sum += arr[i]; 
        } 
  
        // checking if sum equals total_sum/2 
        for (int i = 0; i < n - 1; i++)  
        { 
            sum += arr[i]; 
            if (sum == tot_sum / 2) 
            { 
                ans++; 
            } 
        } 
  
        return ans; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int arr[] = {1, -1, 1, -1, 1, -1}; 
  
        int n = arr.length; 
  
        System.out.println(cntWays(arr, n)); 
    } 
} 
  
// This code contributed by Rajput-Ji 

