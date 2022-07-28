

// Java implementation of the approach  
class GFG  
{ 
      
    // Function to return the minimum number  
    // of elements to be removed from the ends  
    // of the array to make it sorted  
    static int findMin(int arr[], int n)  
    {  
      
        // To store the final answer  
        int ans = 1;  
      
        // Two pointer loop  
        for (int i = 0; i < n; i++)  
        {  
            int j = i + 1;  
      
            // While the array is increasing increment j  
            while (j < n && arr[j] >= arr[j - 1])  
                j++;  
      
            // Updating the ans  
            ans = Math.max(ans, j - i);  
      
            // Updating the left pointer  
            i = j - 1;  
        }  
      
        // Returning the final answer  
        return n - ans;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int arr[] = { 3, 2, 1 };  
        int n = arr.length;  
        System.out.println(findMin(arr, n));  
    }  
} 
  
// This code is contributed by AnkitRai01 

