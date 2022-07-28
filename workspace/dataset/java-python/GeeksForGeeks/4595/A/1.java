

// Java program to find length of longest  
// Fibonacci-like subarray  
class GFG  
{ 
      
    // Function to find the length of the  
    // longest Fibonacci-like subarray  
    static int longestFibonacciSubarray(int n, int a[])  
    {  
        // Any 2 terms are Fibonacci-like  
        if (n <= 2)  
            return n;  
          
        int len = 2;  
          
        int mx = Integer.MIN_VALUE;  
          
        for (int i = 2; i < n; i++) 
        {  
              
            // If previous subarray can be extended  
            if (a[i] == a[i - 1] + a[i - 2])  
                len++;  
                  
            // Any 2 terms are Fibonacci-like  
            else
                len = 2;  
                  
            // Find the maximum length  
            mx = Math.max(mx, len);  
        }  
        return mx;  
    }  
      
    // Driver Code  
    public static void main (String[] args)  
    {  
        int n = 5;  
        int a[] = {2, 4, 6, 10, 2};  
          
        System.out.println(longestFibonacciSubarray(n, a));  
    }  
} 
  
// This code is contributed by Ryuga 

