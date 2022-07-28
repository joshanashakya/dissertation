

# Python3 program to count  
# number of Dyck Paths 
  
# Returns count Dyck  
# paths in n x n grid 
def countDyckPaths(n): 
      
    # Compute value of 2nCn 
    res = 1
    for i in range(0, n): 
        res *= (2 * n - i) 
        res /= (i + 1) 
  
    # return 2nCn/(n+1) 
    return res / (n+1) 
  
# Driver Code 
n = 4
print("Number of Dyck Paths is ", 
    str(int(countDyckPaths(n)))) 
  
# This code is contributed by 
# Prasad Kshirsagar 

