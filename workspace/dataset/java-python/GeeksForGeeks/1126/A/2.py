

# Python3 implementation of the approach 
  
# Function for finding sum of elements 
# whose diff with mean is not more than k 
def findSumofEle(arr1, m, arr2, n, k): 
    arraySum = 0
  
    # Find the mean of second array 
    for i in range(n): 
        arraySum += arr2[i] 
    mean = arraySum / n 
  
    # Find sum of elements from array1 
    # whose difference with mean  
    # is not more than k 
    sumOfElements = 0
    difference = 0
  
    for i in range(m): 
  
        difference = arr1[i] - mean 
  
        if ((difference < 0) and (k > (-1) * difference)): 
            sumOfElements += arr1[i] 
  
        if ((difference >= 0) and (k > difference)): 
            sumOfElements += arr1[i] 
  
    # Return result 
    return sumOfElements 
  
# Driver code 
arr1 = [ 1, 2, 3, 4, 7, 9] 
arr2 = [ 0, 1, 2, 1, 1, 4] 
k = 2
  
m = len(arr1) 
n = len(arr2) 
  
print(findSumofEle(arr1, m, arr2, n, k)) 
  
# This code is contributed by mohit kumar 

