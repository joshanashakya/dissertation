

// Java implementation of the approach  
class GFG 
{ 
      
    // Function to return the maximized XOR  
    // after removing an element from the array  
    static int maxXOR(int arr[], int n)  
    {  
        // Find XOR of the complete array  
        int xorArr = 0;  
        for (int i = 0; i < n; i++)  
            xorArr ^= arr[i];  
      
        // To store the final answer  
        int ans = 0;  
      
        // Iterating through the array to find  
        // the final answer  
        for (int i = 0; i < n; i++)  
            ans = Math.max(ans, (xorArr ^ arr[i]));  
      
        // Return the final answer  
        return ans;  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int arr[] = { 1, 1, 3 };  
        int n = arr.length;  
        System.out.println(maxXOR(arr, n));  
    }  
} 
  
// This code is contributed by AnkitRai01 

