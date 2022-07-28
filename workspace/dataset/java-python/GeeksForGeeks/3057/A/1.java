

// Java implementation of the approach  
class GFG 
{ 
      
    // Function to return the sum of  
    // the first n natural numbers  
    static int sum(int n)  
    {  
        int sum = (n * (n + 1)) / 2;  
        return sum;  
    }  
      
    // Function to return the repeated sum  
    static int repeatedSum(int n, int k)  
    {  
      
        // Perform the operation exactly k times  
        for (int i = 0; i < k; i++)  
        {  
      
            // Update n with the sum of  
            // first n natural numbers  
            n = sum(n);  
        }  
        return n;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int n = 2, k = 2;  
      
        System.out.println(repeatedSum(n, k));  
      
    }  
} 
  
// This code is contributed by AnkitRai01 

