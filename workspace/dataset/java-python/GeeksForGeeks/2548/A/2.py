

# Python3 Program to find the 
# Cartesian Product of Two Sets 
  
def findCart(arr1, arr2, n, n1): 
  
    for i in range(0,n): 
        for j in range(0,n1): 
            print("{",arr1[i],", ",arr2[j],"}, ",sep="",end="") 
  
# Driver code 
arr1 = [ 1, 2, 3 ] # first set 
arr2 = [ 4, 5, 6 ] # second set 
  
n1 = len(arr1) # sizeof(arr1[0]) 
n2 = len(arr2) # sizeof(arr2[0]); 
  
findCart(arr1, arr2, n1, n2); 
  
# This code is contributed 
# by Smitha Dinesh Semwal 

