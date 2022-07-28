

# Python3 program to print the count of 
# elements present in the NxM matrix 
  
# Function to print the count of 
# elements present in the NxM matrix 
def printCount(a, n, m, z, l): 
  
    # iterate in the n rows 
    for i in range(n): 
          
        # map to mark elements in N-th row 
        mp = dict() 
  
        # mark all elements in the n-th row 
        for j in range(m): 
            mp[a[i][j]] = 1
  
        count = 0
  
        # check for occurrence of all elements 
        for j in range(l): 
              
            if z[j] in mp.keys(): 
                  
                count += 1
          
        # print the occurrence of all elements 
        print("row", i + 1, " = ", count ) 
  
# Driver Code 
  
# NxM matrix 
a = [[ 8, 27, 39, 589, 23 ], 
     [ 23, 34, 589, 12, 45 ], 
     [ 939, 32, 27, 12, 78 ], 
     [ 23, 349, 48, 21, 32 ]] 
  
# elements array 
arr = [ 589, 39, 27 ] 
  
n = len(a) 
  
m = 5
  
l = len(arr) 
  
printCount(a, n, m, arr, l) 
  
# This code is contributed by mohit kumar 29 

