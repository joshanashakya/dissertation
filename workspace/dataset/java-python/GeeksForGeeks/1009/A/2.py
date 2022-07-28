

# Python3 program to find the sum of 
# all the elements from the array  
# whose square root is present in 
# the same array 
import math  
  
# Function to return the required sum 
def getSum(arr, n): 
    sum = 0
    for i in range(0, n): 
        sqrtCurrent = math.sqrt(arr[i]) 
        for j in range(0, n): 
            x = arr[j] 
              
            # If sqrtCurrent is present in array 
            if (x == sqrtCurrent): 
                sum += (sqrtCurrent * 
                        sqrtCurrent) 
                break
    return int(sum) 
  
# Driver code 
if __name__ == '__main__': 
  
    arr = [ 2, 4, 5, 6, 7, 8, 9, 3] 
    n = len(arr) 
    print(getSum(arr, n)) 
      
# This code is contributed  
# by 29AjayKumar 

