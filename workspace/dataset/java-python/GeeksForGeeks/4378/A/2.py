

# Python implementation of  
# above approach 
  
# Calculate nCr i.e binomial  
# cofficent nCr = n !/(r !*(n-r)!) 
def nCr(n, r): 
  
    # first find factorial  
    # upto n 
    fac = list() 
    fac.append(1) 
    for i in range(1, n + 1): 
        fac.append(fac[i - 1] * i) 
  
    # use nCr formula 
    ans = fac[n] / (fac[n - r] * fac[r]) 
    return ans 
  
# n = number of variables 
n = 3
  
# sum of n variables = k 
k = 3
  
# find number of solutions 
ans = nCr(n + k - 1, k) + nCr(k - 1, n - 1) 
  
print(ans) 
  
# This code is contributed 
# by ChitraNayal 

