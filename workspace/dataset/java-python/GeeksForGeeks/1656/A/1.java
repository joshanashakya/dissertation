

// Java implementation of the above approach  
class GFG  
{ 
  
    static int INT_MAX = Integer.MAX_VALUE ; 
      
    static int solve(int arr[], int n, int k)  
    {  
        int minx = INT_MAX;  
        int i; 
          
        // Finding the minimum element  
        for (i = 0; i < n; i++) 
        {  
            minx = Math.min(minx, arr[i]);  
        }  
      
        int decrements = 0;  
      
        // Loop over all the elements  
        // and find the difference  
        for (i = 0; i < n; i++) 
        {  
            if ((arr[i] - minx) % k != 0)  
            {  
                return -1;  
            }  
            else
            {  
                decrements += ((arr[i] - minx) / k);  
            }  
        }  
          
        // Solution found and returned  
        return decrements;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int n, k;  
        n = 3;  
        k = 3;  
        int arr[] = { 12, 9, 15 };  
      
        System.out.println(solve(arr, n, k));  
    }  
} 
  
// This code is contributed by AnkitRai01 

