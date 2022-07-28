

# Python3 program to check whether the frequency 
# of characters in a string make Fibonacci Sequence 
from collections import defaultdict 
  
# Function to check if the frequencies 
# are in Fibonacci series 
def isFibonacci(s): 
  
    # map to store the frequencies of character 
    m = defaultdict(lambda:0) 
  
    for i in range(0, len(s)):  
        m[s[i]] += 1
  
    # Vector to store first n fibonacci numbers 
    v = [] 
  
    # Get the size of the map 
    n = len(m) 
  
    # a and b are first and second 
    # terms of fibonacci series 
    a = b = 1
  
    v.append(a) 
    v.append(b) 
  
    # vector v contains elements of 
    # fibonacci series 
    for i in range(0, n - 2): 
        v.append(a + b) 
        c = a + b 
        a, b = b, c 
  
    flag, i = 1, 0
  
    # Compare vector elements with values in Map 
    for itr in sorted(m):  
        if m[itr] != v[i]:  
            flag = 0
            break
          
        i += 1
      
    if flag == 1: 
        return "YES"
    else: 
        return "NO"
  
# Driver code 
if __name__ == "__main__": 
  
    s = "abeeedd"
    print(isFibonacci(s)) 
  
# This code is contributed by Rituraj Jain 

