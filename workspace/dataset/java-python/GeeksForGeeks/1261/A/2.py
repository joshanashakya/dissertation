

# Python 3 program to find the largest  
# non-perfect cube number among n numbers 
import math 
  
# Function to check if a number 
# is perfect cube number or not 
def checkPerfectcube(n): 
      
    # takes the sqrt of the number 
    cube_root = n ** (1./3.) 
    if round(cube_root) ** 3 == n: 
        return True
    else: 
        return False
  
# Function to find the largest non  
# perfect cube number in the array 
def largestNonPerfectcubeNumber(a, n): 
      
    # stores the maximum of all 
    # perfect cube numbers 
    maxi = -1
  
    # Traverse all elements in the array 
    for i in range(0, n, 1): 
          
        # store the maximum if current 
        # element is a non perfect cube 
        if (checkPerfectcube(a[i]) == False): 
            maxi = max(a[i], maxi) 
      
    return maxi 
  
# Driver Code 
if __name__ == '__main__': 
    a = [16, 64, 25, 2, 3, 10]  
  
    n = len(a) 
  
    print(largestNonPerfectcubeNumber(a, n)) 
  
# This code is contributed by  
# Surendra_Gangwar 

