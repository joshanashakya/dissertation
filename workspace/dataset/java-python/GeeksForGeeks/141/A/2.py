

# Python3 implementation of the approach  
MOD = 1000000007;  
  
# Function to find the modular-inverse  
def modInv(a, p = MOD - 2) : 
  
    s = 1;  
  
    # While power > 1  
    while (p != 1) : 
  
        # Updating s and a  
        if (p % 2) : 
            s = (s * a) % MOD;  
        a = (a * a) % MOD;  
  
        # Updating power  
        p //= 2;  
  
    # Return the final answer  
    return (a * s) % MOD;  
  
  
# Function to return the count of ways  
def findCnt(x, y) : 
  
    # To store the final answer  
    ans = 0;  
  
    # To store pre-computed factorials  
    fact = [1]*(len(y) + 1) ;  
  
    # Computing factorials  
    for i in range(1,len(y)) : 
        fact[i] = (fact[i - 1] * i) % MOD;  
  
    # Loop to find the occurences of x  
    # and update the ans  
    for i in range(len(y)) : 
        if (y[i] == x) : 
            ans += (modInv(fact[i]) * 
                    modInv(fact[len(y)- i - 1])) % MOD;  
            ans %= MOD;  
              
    # Multiplying the answer by (n - 1)!  
    ans *= fact[(len(y) - 1)];  
    ans %= MOD;  
  
    # Return the final answer  
    return ans;  
  
# Driver code  
if __name__ == "__main__" :  
  
    x = 'a';  
    y = "xxayy";  
  
    print(findCnt(x, y));  
  
# This code is contributed by AnkitRai01 

