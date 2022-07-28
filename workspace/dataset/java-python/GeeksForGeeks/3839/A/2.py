

# Python3 implementation of the approach  
MOD = 2019;  
  
# Function to return the minimum  
# possible value of (i * j) % 2019  
def min_modulo(l, r) : 
  
    # If we can get a number  
    # divisible by 2019  
    if (r - l >= MOD) : 
        return 0;  
    else : 
  
        # Find the minimum value  
        # by running nested loops  
        ans = MOD - 1;  
        for i in range(l, r + 1) : 
            for j in range(i + 1, r + 1) : 
                ans = min(ans, (i * j) % MOD);  
          
        return ans;  
  
# Driver code  
if __name__ == "__main__" : 
      
    l = 2020; r = 2040; 
      
    print(min_modulo(l, r));  
  
# This code is contributed by AnkitRai01 

