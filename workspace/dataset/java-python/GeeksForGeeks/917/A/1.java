

// Java program for the above approach  
class GFG  
{ 
      
    // Function to calculate a^b mod m  
    // using fast-exponentiation method  
    static int fastmod(int base, int exp, int mod)  
    {  
        if (exp == 0)  
        return 1;  
        else if (exp % 2 == 0) 
        {  
            int ans = fastmod(base, exp / 2, mod);  
            return (ans % mod * ans % mod) % mod;  
        }  
        else
            return (fastmod(base, exp - 1, mod) % 
                        mod * base % mod) % mod;  
    }  
      
    /* Function to get no of set  
    bits in binary representation  
    of positive integer n */
    static int countSetBits(int n)  
    {  
        int count = 0;  
        while (n > 0) 
        {  
            count += n & 1;  
            n >>= 1;  
        }  
        return count;  
    }  
      
    // Function to calculate sum  
    static int findPowerSum(int n, int ar[])  
    {  
      
        final int mod = (int)1e9 + 7;  
        int sum = 0;  
      
        // Itereate for all  
        // values of array A  
        for (int i = 0; i < n; i++)  
        {  
            int base = countSetBits(ar[i]);  
            int exp = ar[i];  
              
            // Calling fast-exponentiation and  
            // appending ans to sum  
            sum += fastmod(base, exp, mod);  
            sum %= mod;  
        }  
      
        return sum;  
    }  
      
    // Driver code.  
    public static void main (String[] args) 
    {  
        int n = 3;  
        int ar[] = { 1, 2, 3 };  
        System.out.println(findPowerSum(n, ar));  
    }  
} 
  
// This code is contributed by AnkitRai01 

