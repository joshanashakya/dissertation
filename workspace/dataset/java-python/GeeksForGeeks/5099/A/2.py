

# Python3 implementation of the approach  
  
import sys 
  
# Function that returns true  
# if n is a perfect cube  
def checkPerfectcube(n) : 
      
    # Takes the sqrt of the number  
    d = int(n**(1/3));  
  
    # Checks if it is a perfect  
    # cube number  
    if (d * d * d == n) : 
        return True;  
  
    return False;  
  
# Function to return the smallest perfect  
# cube from the array  
def smallestPerfectCube(a, n) :  
  
    # Stores the minimum of all the  
    # perfect cubes from the array  
    mini = sys.maxsize;  
  
    # Traverse all elements in the array  
    for i in range(n) : 
  
        # Store the minimum if current  
        # element is a perfect cube  
        if (checkPerfectcube(a[i])) : 
            mini = min(a[i], mini);  
              
    return mini;  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    a = [ 16, 8, 25, 2, 3, 10 ];  
  
    n = len(a);  
  
    print(smallestPerfectCube(a, n));  
  
# This code is contributed by AnkitRai01 

