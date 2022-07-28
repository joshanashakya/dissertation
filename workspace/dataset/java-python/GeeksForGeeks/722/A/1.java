

// Java implementation of the approach  
class GFG  
{ 
      
    // Function to return the maximum bitwise OR  
    // for any pair of the given array  
    static int maxOR(int arr[], int n)  
    {  
      
        // To store the maximum OR value  
        int maxVal = 0;  
      
        // For every possible pair  
        for (int i = 0; i < n - 1; i++)  
            for (int j = i + 1; j < n; j++) 
            {  
      
                // Update the maximum OR value  
                maxVal = Math.max(maxVal, arr[i] | arr[j]);  
            }  
      
        return maxVal;  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int arr[] = { 4, 8, 12, 16 };  
        int n = arr.length;  
      
        System.out.println(maxOR(arr, n));  
    } 
} 
  
// This code is contributed by AnkitRai01 

