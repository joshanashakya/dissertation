

// Java implementation of the approach  
class GFG 
{ 
  
    // Function to return the required sum  
    static int sum(int arr[], int n)  
    {  
      
        // Find the sum of the array elements  
        int sum = 0;  
        for (int i = 0; i < n; i++) 
        {  
            sum += arr[i];  
        }  
      
        // Every element appears 2^(n-1) times  
        sum = sum * (int)Math.pow(2, n - 1);  
        return sum;  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int arr[] = { 2, 1, 5, 6 };  
        int n = arr.length;  
        System.out.println(sum(arr, n));  
    }  
} 
  
// This code is contributed by AnkitRai01 

