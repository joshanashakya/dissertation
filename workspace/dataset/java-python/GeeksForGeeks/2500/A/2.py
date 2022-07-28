

# Python3 program to find the position of  
# the last removed element from the array 
import math as mt 
  
# Function to find the original  
# position of the element which  
# will be removed last 
def getPosition(a, n, m): 
  
    # take ceil of every number 
    for i in range(n): 
        a[i] = (a[i] // m + 
               (a[i] % m != 0)) 
      
    ans, maxx = -1,-1
    for i in range(n - 1, -1, -1): 
        if (maxx < a[i]): 
            maxx = a[i] 
            ans = i 
              
    # Since position is index+1 
    return ans + 1
  
# Driver code 
a = [2, 5, 4] 
  
n = len(a) 
  
m = 2
  
print(getPosition(a, n, m)) 
  
# This is contributed by Mohit kumar 29 

