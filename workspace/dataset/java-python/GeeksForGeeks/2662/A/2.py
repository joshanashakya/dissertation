

# Python3 implementation of the above approach 
  
# Function that returns true if sub-string  
# s[0...k] is repeated a number of times  
# to generate String s  
def check(s, k): 
  
    for i in range (0, len(s)):  
      
        if (s[i] != s[i % k]): 
          
            return False
          
    return True
  
# Function to return the 
# count of common divisors  
def countCommonDivisors(a, b):  
  
    ct = 0
    n = len(a) 
    m = len(b) 
    for i in range(1, min(n, m) + 1):  
      
        # If the length of the sub-string  
        # divides length of both the strings  
        if (n % i == 0 and m % i == 0): 
          
            # If prefixes match in both the strings 
            if (a[0 : i] == b[0 : i]) : 
                  
                # by repeating the current prefix  
              
                # If both the strings can be generated  
                if (check(a, i) and check(b, i)) : 
                  
                    ct = ct + 1
      
    return ct 
      
# Driver code  
a = "xaxa"
b = "xaxaxaxa"
print(countCommonDivisors(a, b)) 
  
# This code is contributed by ihritik 

