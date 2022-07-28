

# Python 3 implementation of the approach 
  
# Function that returns true if all  
# the elements of the array can be  
# made equal with the given operation 
def isPossible(n, k, arr): 
      
    # To store the sum of the array elements 
    # and the maximum element from the array 
    sum = arr[0] 
    maxVal = arr[0]; 
  
    for i in range(1, n): 
        sum += arr[i] 
        maxVal = max(maxVal, arr[i]) 
  
  
    if (int(maxVal)> int((sum + k) / n)): 
        return False
  
    return True
  
# Driver code 
if __name__ == '__main__': 
    k = 8
    arr = [1, 2, 3, 4] 
    n = len(arr) 
  
    if (isPossible(n, k, arr)): 
        print("Yes") 
    else: 
        print("No") 
  
  
# This code is contributed by 
# Surendra_Gangwar 

