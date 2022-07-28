

// Java implementation of the approach  
class GFG  
{ 
      
    // Function to find the required subarray  
    static void findSubArr(int arr[], int n)  
    {  
      
        // For every two consecutive element subarray  
        for (int i = 0; i < n - 1; i++)  
        {  
      
            // If the current pair of consecutive  
            // elements satisfies the given condition  
            if (Math.abs(arr[i] - arr[i + 1]) >= 2)  
            {  
                System.out.print(arr[i] + " " + arr[i + 1]);  
                return;  
            }  
        }  
      
        // No such subarray found  
        System.out.print(-1);  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int arr[] = { 1, 2, 4, 6, 7 };  
        int n = arr.length;  
      
        findSubArr(arr, n);  
    }  
} 
  
// This code is contributed by AnkitRai01 

