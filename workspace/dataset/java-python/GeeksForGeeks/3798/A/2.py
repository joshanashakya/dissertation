

# Python3 implementation of the  
# above approach  
  
# Function to find the sum  
# of minimum of all subarrays  
def findMinSum(arr, n): 
    sum = 0
    for i in range(0, n):  
        sum += arr[i] * (n - i)  
    return sum
  
# Driver code  
arr = [3, 5, 7, 8 ]  
n = len(arr) 
  
print(findMinSum(arr, n))  
  
# This code has been contributed  
# by 29AjayKumar 

