

# Python3 program to count pairs(i,j) 
# such that arr[i]*arr[j]>arr[i]+arr[j] 
import math as mt 
  
# function to return the count of pairs  
# such that arr[i]*arr[j]>arr[i]+arr[j] 
def countPairs(arr, n): 
    count_2, count_others = 0, 0
      
    for i in range(n): 
        if arr[i] == 2: 
            count_2 += 1
        elif arr[i] > 2: 
            count_others += 1
    ans = (count_2 * count_others +
          (count_others * 
          (count_others - 1)) // 2) 
    return ans 
  
# Driver code 
arr = [5, 0, 3, 1, 2] 
n = len(arr) 
  
print(countPairs(arr, n)) 
          
# This code is contributed  
# by Mohit Kumar 

