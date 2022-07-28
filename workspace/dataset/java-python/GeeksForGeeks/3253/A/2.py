

# Efficient python method to find sum of the 
# elements of array that is halfway increasing 
# and then halfway decreassing 
def arraySum( arr, n): 
    x = (n + 1)/2
    return (arr[0] - 1)*n + x * x 
      
# Driver code 
arr = [10, 11, 12, 13, 12, 11, 10] 
n = len(arr) 
print(arraySum(arr, n)) 
  
# This code is contributedc by "Abhishek Sharma 44" 

