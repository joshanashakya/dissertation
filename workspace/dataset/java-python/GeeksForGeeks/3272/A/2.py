

# Python3 implementation of the approach  
  
# Function to return a^n  
def power(a, n):  
  
    if n == 0:  
        return 1
  
    p = power(a, n // 2)  
    p = p * p  
  
    if n & 1:  
        p = p * a  
  
    return p  
  
# Function to return count of integers  
# that satisfy n % phi(n) = 0  
def countIntegers(l, r):  
  
    ans, i = 0, 1
    v = power(2, i)  
  
    while v <= r:  
  
        while v <= r:  
  
            if v >= l:  
                ans += 1
              
            v = v * 3
  
        i += 1
        v = power(2, i)  
      
    if l == 1:  
        ans += 1
  
    return ans  
  
# Driver Code  
if __name__ == "__main__": 
  
    l, r = 12, 21
    print(countIntegers(l, r))  
      
# This code is contributed  
# by Rituraj Jain 

