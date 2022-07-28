

# Python3 program to find Sum of  
# bitwise AND of all subarrays 
import math as mt 
  
# Function to find the Sum of 
# bitwise AND of all subarrays 
def findAndSum(arr, n): 
      
    # variable to store the final Sum 
    Sum = 0
  
    # multiplier 
    mul = 1
  
    for i in range(30): 
          
        # variable to check if counting is on 
        count_on = 0
  
        # variable to store the length 
        # of the subarrays 
        l = 0
  
        # loop to find the contiguous 
        # segments 
        for j in range(n): 
  
            if ((arr[j] & (1 << i)) > 0): 
                if (count_on): 
                    l += 1
                else: 
                    count_on = 1
                    l += 1
  
            elif (count_on): 
                Sum += ((mul * l * (l + 1)) // 2) 
                count_on = 0
                l = 0
              
        if (count_on):  
            Sum += ((mul * l * (l + 1)) // 2) 
            count_on = 0
            l = 0
          
        # updating the multiplier 
        mul *= 2
      
    # returning the Sum 
    return Sum
  
# Driver Code 
arr = [7, 1, 1, 5] 
  
n = len(arr) 
  
print(findAndSum(arr, n)) 
  
# This code is contributed by Mohit Kumar 

