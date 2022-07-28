

// Java implementation of the approach  
class GFG 
{ 
      
    // Function to return the minimum  
    // operations required  
    static int minOperations(int x, int y, int p, int q)  
    {  
      
        // Not possible  
        if (y % x != 0)  
            return -1;  
      
        int d = y / x;  
      
        // To store the greatest power  
        // of p that divides d  
        int a = 0;  
      
        // While divible by p  
        while (d % p == 0)  
        {  
            d /= p;  
            a++;  
        }  
      
        // To store the greatest power  
        // of q that divides d  
        int b = 0;  
      
        // While divible by q  
        while (d % q == 0) 
        {  
            d /= q;  
            b++;  
        }  
      
        // If d > 1 
        if (d != 1)  
            return -1;  
      
        // Since, d = p^a * q^b  
        return (a + b);  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    { 
        int x = 12, y = 2592, p = 2, q = 3;  
        System.out.println(minOperations(x, y, p, q));  
    } 
} 
  
// This code is contributed by AnkitRai01 

