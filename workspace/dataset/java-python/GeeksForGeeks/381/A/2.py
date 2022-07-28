

# Python3 implementation of the approach 
  
import math as mt  
# Function to return the size of the required sub-set 
def sizeSubSet(a, k, n): 
  
    # Sort the array 
    a.sort() 
   
    # Set to store the contents of the required sub-set 
    s=set() 
   
    # Insert the elements satisfying the conditions 
    for i in range(n): 
        if (a[i] % k != 0 or a[i] // k not in s): 
            s.add(a[i]) 
      
   
    # Return the size of the set 
    return len(s) 
  
   
# Driver code 
a=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ] 
n = len(a) 
k = 2
  
print(sizeSubSet(a, k, n)) 
  
# This is contributed by Mohit kumar 29 

