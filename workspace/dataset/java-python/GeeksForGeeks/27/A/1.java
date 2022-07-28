

// Java implementation of the approach  
class GFG  
{ 
  
    // Function to return the length of  
    // the largest subarray with  
    // maximum possible GCD  
    static int findLength(int []arr, int n)  
    {  
        // To store the maximum number  
        // present in the array  
        int x = 0;  
      
        // Finding the maximum element  
        for (int i = 0; i < n; i++)  
            x = Math.max(x, arr[i]);  
      
        // To store the final answer  
        int ans = 0;  
      
        // Two pointer  
        for (int i = 0; i < n; i++)  
        {  
            if (arr[i] != x)  
                continue;  
      
            // Running a loop from j = i  
            int j = i;  
      
            // Condition for incrementing 'j'  
            while (arr[j] == x)  
            { 
                j++;  
                if (j >= n ) 
                break; 
            } 
      
            // Updating the answer  
            ans = Math.max(ans, j - i);  
        }  
        return ans;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int arr[] = { 1, 2, 2 };  
        int n = arr.length;  
      
        System.out.println(findLength(arr, n));  
    }  
} 
  
// This code is contributed by AnkitRai01 

