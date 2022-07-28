

// Java implementation of the above approach  
class GFG  
{ 
      
    // function to calculate the sum  
    // of all cells adjacent value  
    static int sum(int m, int n)  
    {  
        return 8 * m * n - 6 * m - 6 * n + 4;  
    }  
      
    // Driver Code 
    public static void main (String[] args) 
    {  
        int m = 3, n = 2;  
        System.out.println(sum(m, n));  
    }  
} 
  
// This Code is contributed by AnkitRai01 

