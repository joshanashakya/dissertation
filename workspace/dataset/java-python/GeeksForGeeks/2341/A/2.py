

# Python3 program to find the largest perfect  
# square number among n numbers 
  
# from math lib import sqrt() 
from math import sqrt 
  
# Function to check if a number   
# is perfect square number or not 
def checkPerfectSquare(n) : 
      
    # takes the sqrt of the number 
    d = sqrt(n) 
      
    # checks if it is a perfect   
    # square number   
    if d * d == n : 
        return True
      
    return False
  
  
# Function to find the largest perfect   
# square number in the array   
def largestPerfectSquareNumber(a, n) : 
      
    # stores the maximum of all   
    # perfect square numbers  
    maxi = -1
      
    # Traverse all elements in the array 
    for i in range(n) : 
          
        # store the maximum if current   
        # element is a perfect square   
        if(checkPerfectSquare(a[i])) : 
            maxi = max(a[i], maxi) 
      
    return maxi 
      
          
# Driver code 
if __name__ == "__main__" : 
      
    a = [16, 20, 25, 2, 3, 10 ] 
    n = len(a) 
      
    print(largestPerfectSquareNumber(a, n)) 
      
# This code is contributed by Ryuga 

