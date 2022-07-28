

# Python 3 implementation of 
# above approach 
def countWays(a, n): 
      
    suff = [0] * n 
    if (a[n - 1] == 2): 
        suff[n - 1] = 1
  
    # Taking the frequncy suffix sum 
    # of the number of 2's present  
    # after every index 
    for i in range(n - 2, -1, -1) : 
        if (a[i] == 2): 
            suff[i] = suff[i + 1] + 1
        else: 
            suff[i] = suff[i + 1] 
  
    # Storing the count of subsequence 
    ss = 0
  
    # Subsequence of length 2 
    for i in range(n) : 
        if (a[i] == 1): 
            ss += suff[i] 
  
    # Subsequence of length 4 of type 1 1 2 2 
    for i in range(n) : 
        for j in range(i + 1, n) : 
            if (a[i] == 1 and 
                a[j] == 1 and suff[j] >= 2) : 
                ss += (suff[j]) * (suff[j] - 1) // 2
  
    # Subsequence of length 4 
    # of type 1 2 1 2 
    for i in range(n) : 
        for j in range(i + 1, n) : 
            if (a[i] == 1 and a[j] == 1 and
                (suff[i] - suff[j]) >= 1 and 
                           suff[j] >= 1): 
                    ss += (suff[i] - suff[j]) * suff[j] 
                  
    print(ss) 
  
# Driver Code 
if __name__ == "__main__": 
      
    a = [ 1, 2, 1, 1, 2, 2 ] 
    n = 6
    countWays(a, n) 
  
# This code is contributed 
# by ChitraNayal 

