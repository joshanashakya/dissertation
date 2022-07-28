

# Python3 program to count pairs(i,j) 
# such that arr[i]*arr[j]>arr[i]+arr[j] 
import math as mt 
  
# function to return the count of pairs  
# such that arr[i]*arr[j]>arr[i]+arr[j] 
def countPairs(arr, n): 
    count = 0
      
    for i in range(n): 
        for j in range(i + 1, n): 
              
            # if condition is satisified 
            if arr[i] * arr[j] > arr[i] + arr[j]: 
                count += 1
              
    return count 
  
# Driver code 
arr = [5, 0, 3, 1, 2] 
n = len(arr) 
  
print(countPairs(arr, n)) 
          
# This code is contributed  
# by Mohit Kumar 29 

