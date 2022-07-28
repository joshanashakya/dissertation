

// Java implementation of the approach  
  
class GFG  
{ 
          
    final static int MOD = 1000000007;  
      
    // Function to find the modular-inverse  
    static long modInv(long a)  
    {  
        long p = MOD - 2; 
        long s = 1;  
      
        // While power > 1  
        while (p != 1)  
        {  
      
            // Updating s and a  
            if (p % 2 == 1)  
                s = (s * a) % MOD;  
                  
            a = (a * a) % MOD;  
      
            // Updating power  
            p /= 2;  
        }  
      
        // Return the final answer  
        return (a * s) % MOD;  
    }  
      
    // Function to return the count of ways  
    static long findCnt(char x, String y)  
    {  
        // To store the final answer  
        long ans = 0;  
      
        // To store pre-computed factorials  
        long fact[] = new long[y.length() + 1]; 
          
        for(int i = 0; i < y.length() + 1; i++) 
            fact[i] = 1; 
      
        // Computing factorials  
        for (int i = 1; i <= y.length(); i++)  
            fact[i] = (fact[i - 1] * i) % MOD;  
      
        // Loop to find the occurences of x  
        // and update the ans  
        for (int i = 0; i < y.length(); i++)  
        {  
            if (y.charAt(i) == x) 
            {  
                ans += (modInv(fact[i])  
                    * modInv(fact[y.length() - i - 1])) % MOD; 
                  
                ans %= MOD;  
            }  
        }  
      
        // Multiplying the answer by (n - 1)!  
        ans *= fact[(y.length() - 1)];  
        ans %= MOD;  
      
        // Return the final answer  
        return ans;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        char x = 'a';  
        String y = "xxayy";  
      
        System.out.println(findCnt(x, y));  
      
    }  
} 
  
// This code is contributed by AnkitRai01 

