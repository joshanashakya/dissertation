

# Python 3 implementation of the approach 
def findpair(l, r): 
    c = 0
    for i in range(l, r + 1): 
        for j in range(i + 1, r + 1): 
            if (j % i == 0 and j != i): 
                print( i, ", ", j) 
                c = 1
                break
        if (c == 1): 
            break
      
# Driver Code 
if __name__ == "__main__": 
  
    l = 1
    r = 10
    findpair(l, r) 
  
# This code is contributed by ita_c 

