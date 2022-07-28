

# Python3 code to check if the array has  
# an element which is equal to sum of all  
# the remaining elements 
  
# function to check if such element 
# exists or not 
def isExists(a, n): 
      
    # storing frequency in dict 
    freq = {i : 0 for i in a} 
      
    #stores the sum 
    Sum = 0
      
    # traverse the array and count 
    # the array element 
    for i in range(n): 
        freq[a[i]] += 1
        Sum += a[i] 
      
    # Only possible if sum is even  
    if Sum % 2 == 0: 
          
        #if half sum is available 
        if freq[Sum // 2]: 
            return True
    return False
      
# Driver code 
a = [5, 1, 2, 2] 
  
n = len(a) 
  
if isExists(a, n): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed  
# by Mohit Kumar 

