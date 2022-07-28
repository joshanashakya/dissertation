

# Python3 code to find  
# k-th element in the 
# Odd-Even sequence. 
  
def findK (n, k ): 
    a = list() 
      
    # insert all the odd  
    # numbers from 1 to n. 
    i = 1
    while i < n: 
        a.append(i) 
        i = i + 2
      
    # insert all the even  
    # numbers from 1 to n. 
    i = 2
    while i < n: 
        a.append(i) 
        i = i + 2
          
    return (a[k - 1]) 
  
# Driver code 
n = 10
k = 3
print(findK(n, k)) 
  
# This code is contributed  
# by "Sharad_Bhardwaj". 

