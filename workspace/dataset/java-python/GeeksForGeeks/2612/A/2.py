

# Python 3 program to maximize the value 
# of x such that n! % (k^x) = 0 
import math 
  
# Function to maximize the value 
# of x such that n! % (k^x) = 0 
def findX(n, k): 
    r = n  
  
    # Find square root of k  
    # and add 1 to it 
    m = int(math.sqrt(k)) + 1
      
    # Run the loop from 2 to m  
    # and k sould be greater than 1 
    i = 2
    while i <= m and k > 1 : 
        if (i == m) : 
              
            i = k 
              
        # optimize the value of k 
        u = 0
        v = 0
        while k % i == 0 : 
            k //= i 
            v += 1
          
        if (v > 0) : 
            t = n 
            while (t > 0) : 
                t //= i 
                u += t 
              
            # Minimum store 
            r = min(r, u // v) 
              
        i += 1
  
    return r 
  
# Driver Code 
if __name__ == "__main__": 
      
    n = 5
    k = 2
  
    print(findX(n, k)) 
  
# This code is contributed 
# by ChitraNayal 

