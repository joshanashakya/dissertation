

# Python 3 program to find the largest  
# perfect cube number among n numbers 
import math  
  
# Function to check if a number 
# is perfect cube number or not 
def checkPerfectcube(n): 
      
    # checks if it is a perfect 
    # cube number 
    cube_root = n**(1./3.) 
    if round(cube_root) ** 3 == n: 
        return True
          
    else: 
        return False
  
# Function to find the largest perfect 
# cube number in the array 
def largestPerfectcubeNumber(a, n): 
      
    # stores the maximum of all 
    # perfect cube numbers 
    maxi = -1
  
    # Traverse all elements in the array 
    for i in range(0, n, 1): 
          
        # store the maximum if current 
        # element is a perfect cube 
        if (checkPerfectcube(a[i])): 
            maxi = max(a[i], maxi) 
  
    return maxi; 
  
# Driver Code 
if __name__ == '__main__': 
    a = [16, 64, 25, 2, 3, 10] 
  
    n = len(a) 
  
    print(largestPerfectcubeNumber(a, n)) 
  
# This code is contributed by  
# Surendra_Gangwar 

