

# Python3 implementation of above approach  
x = 26
mod = 3001
  
# Function to find the required count  
def CntSubstr(s, l) :  
  
    # Variable to the hash  
    hash = 0;  
  
    # Finding hash of substring  
    # (0, l-1) using random number x  
    for i in range(l) : 
        hash = (hash * x + (ord(s[i]) - 97)) % mod;  
  
    # Computing x^(l-1)  
    pow_l = 1;  
    for i in range(l-1) :  
        pow_l = (pow_l * x) % mod;  
  
    # Unordered set to add hash values  
    result = set();  
    result.add(hash);  
  
    # Generating all possible hash values  
    for i in range(l,len(s)) : 
        hash = ((hash - pow_l * (ord(s[i - l]) - 97)  
            + 2 * mod) * x + (ord(s[i]) - 97)) % mod;  
          
        result.add(hash);  
  
    # Print the result  
    print(len(result)) ;  
  
  
# Driver Code  
if __name__ == "__main__" :  
  
    s = "abcba";  
  
    l = 2;  
  
    CntSubstr(s, l);  
      
# This code is contributed by AnkitRai01 

