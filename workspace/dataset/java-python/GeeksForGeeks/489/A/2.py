

# Python program to find count of 
# elements in first array whose 
# atleast one factor is present 
# in second array. 
   
# Importing sqrt() function 
from math import sqrt 
   
# Util function to count the  
# elements in first array  
# whose atleast one factor is 
# present in second array 
def elementCount(arr1, arr2): 
     
  # counter to count 
  # number of elements 
  count = 0
     
  # Hash of second array elements 
  hash = frozenset(arr2) 
     
  # loop to traverse through array  
  # elements and check for its factors 
  for x in arr1: 
         
    # generate factors of  
    # elements of first array 
    for j in range(1, int(sqrt(x)) + 1): 
     
      # Check if j is a factor 
      if x % j == 0: 
   
        # check if the factor is present  
        # in second array using the hash 
        if (j in hash or
            x / j in hash): 
          count+=1
          break
     
  return count 
   
# Driver code 
arr1 = [ 10, 2, 13, 4, 15 ] 
arr2 = [ 2, 4, 5, 6 ] 
   
print(elementCount(arr1, arr2)) 
   
# This code is contributed  
# by vaibhav29498 

