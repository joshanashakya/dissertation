

// Java code of above approach  
class GFG  
{ 
    final static long mod = 1000000007 ; 
  
    static long fact(long n)  
    {  
        if(n == 1)  
            return 1;  
        else
            return (fact(n - 1) * n) % mod;  
    }  
      
    // Function to return the count of pairs  
    static long countPairs(int m, int n)  
    {  
        long ans = fact(2 * m + n - 1) /  
                   (fact(n - 1) * fact(2 * m));  
          
        return (ans % mod);  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int n = 5, m = 3;  
          
        System.out.println(countPairs(m, n));  
    }  
} 
  
// This code is contributed by AnkitRai01 

