

# Python3 implementation of the approach 
  
# Function that returns true if s contains 
# three consecutive 1's 
def check(s) : 
    n = len(s); 
    for i in range(2, n) : 
        if (s[i] == '1' and s[i - 1] == '1' and
                            s[i - 2] == '1') : 
            return 1; 
  
# Function to return the count 
# of required strings 
def countStr(i, s) : 
      
    if (i < 0) : 
        if (check(s)) : 
            return 1; 
        return 0; 
      
    s[i] = '0'; 
    ans = countStr(i - 1, s); 
      
    s[i] = '1'; 
    ans += countStr(i - 1, s); 
      
    s[i] = '0'; 
    return ans; 
  
# Driver code 
if __name__ == "__main__" : 
    N = 4; 
    s = list('0' * N); 
      
    print(countStr(N - 1, s)); 
  
# This code is contributed by Ryuga 

