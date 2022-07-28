

# Python3 program to check if any 
# Subarray of size K has a given Sum  
  
# Function to check if any Subarray  
# of size K has a given Sum  
def checkSubarraySum(arr, n,  
                     k, sumV): 
    # Check for first window  
    curr_sum = 0
    for i in range(0, k):  
        curr_sum += arr[i]  
    if (curr_sum == sumV):  
        return true 
  
    # Consider remaining blocks  
    # ending with j  
    for j in range(k, n):  
        curr_sum = (curr_sum + arr[j] - 
                               arr[j - k])  
        if (curr_sum == sumV) : 
            return True    
      
    return False
  
# Driver code  
arr = [ 1, 4, 2, 10, 2, 
        3, 1, 0, 20 ]  
k = 4
sumV = 18
  
n = len(arr) 
  
if (checkSubarraySum(arr, n, k, sumV)):  
    print("YES") 
else: 
    print( "NO")  
  
# This code is contributed  
# by Yatin Gupta 

