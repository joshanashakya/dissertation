

# Python 3 implementation of the approach 
  
# Function to return the minimum  
# number of required changes 
def minimumChanges(n, a): 
  
    sf = [0] * (n + 1) 
    sf[n] = 0
    for i in range(n - 1, -1, -1) : 
        sf[i] = sf[i + 1] 
        if (a[i] <= 0): 
            sf[i] += 1
  
    # number of elements >=0 in prefix 
    pos = 0
  
    # Minimum elements to change 
    mn = n 
    for i in range(n - 1) : 
        if (a[i] >= 0): 
            pos += 1
        mn = min(mn, pos + sf[i + 1]) 
      
    return mn 
  
# Driver Code 
if __name__ == "__main__": 
      
    a = [ -1, -2, -3, 3, -5, 3, 4 ] 
    n = len(a) 
    print(minimumChanges(n, a)) 
  
# This code is contributed  
# by ChitraNayal 

