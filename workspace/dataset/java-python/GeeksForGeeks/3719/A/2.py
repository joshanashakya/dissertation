

# Python3 Program to solve range query  
# on array whose each element is XOR of  
# index value and previous element.  
  
# function return derived formula value.  
def fun(x): 
    y = (x // 4) * 4
      
    # finding xor value of range [y...x]  
    ans = 0
    for i in range(y, x + 1): 
        ans ^= i  
    return ans 
  
# function to solve query for l and r.  
def query(x): 
      
    # if l or r is 0.  
    if (x == 0):  
        return 0
  
    k = (x + 1) // 2
  
    # finding x is divisible by 2 or not.  
    if x % 2 == 0: 
        return((fun(k - 1) * 2) ^ (k & 1)) 
    else: 
        return(2 * fun(k)) 
  
def allQueries(q, l, r):  
    for i in range(q): 
        print(query(r[i]) ^ query(l[i] - 1)) 
          
# Driver Code 
q = 3
l = [ 2, 2, 5 ]  
r = [ 4, 8, 9 ]  
  
allQueries(q, l, r)  
  
# This code is contributed  
# by sahishelangia 

