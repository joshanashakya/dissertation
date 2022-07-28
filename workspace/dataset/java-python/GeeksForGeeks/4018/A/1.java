

// Java implementation of the above approach  
class GFG 
{ 
    static final int MOD = 1000000007; 
      
    // Function to return (m! % MOD)  
    static int modFact(int n, int m)  
    {  
        int result = 1;  
        for (int i = 1; i <= m; i++)  
            result = (result * i) % MOD;  
      
        return result;  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int n = 3, m = 2;  
      
        System.out.println(modFact(n, m));  
    }  
} 
  
// This code is contributed by AnkitRai01 

