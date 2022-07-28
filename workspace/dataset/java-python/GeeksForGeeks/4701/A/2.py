

# Python Code to find no. 
# of Ways of choosing 
# a pair with maximum difference 
  
def countPairs(a, n): 
  
    # To find minimum and maximum of  
    # the array  
    mn = +2147483647
    mx = -2147483648
    for i in range(n): 
        mn = min(mn, a[i]) 
        mx = max(mx, a[i]) 
      
       
    # to find the count of minimum and  
    # maximum elements 
    c1 = 0
    c2 = 0 # Count variables 
    for i in range(n): 
        if (a[i] == mn): 
            c1+= 1
        if (a[i] == mx): 
            c2+= 1
      
   
    # condition for all elements equal 
    if (mn == mx):  
        return  n*(n - 1) // 2
    else: 
        return c1 * c2 
  
# Driver code 
  
a = [ 3, 2, 1, 1, 3] 
n = len(a) 
  
print(countPairs(a, n)) 
  
# This code is contributed 
# by Anant Agarwal. 

