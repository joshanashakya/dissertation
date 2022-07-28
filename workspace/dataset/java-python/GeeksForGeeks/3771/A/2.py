

# Efficient Python program to make sorted array  
# elements distinct by incrementing elements  
# and keeping sum to minimum. 
  
# To find minimum sum of unique elements 
def minSum(arr, n): 
      
    sum = arr[0]; prev = arr[0] 
  
    for i in range(1, n): 
  
        # If violation happens, make current 
        # value as 1 plus previous value and 
        # add to sum. 
        if arr[i] <= prev: 
            prev = prev + 1
            sum = sum + prev 
  
        # No violation. 
        else : 
            sum = sum + arr[i] 
            prev = arr[i] 
  
    return sum
  
# Drivers code 
arr = [ 2, 2, 3, 5, 6 ] 
n = len(arr) 
print(minSum(arr, n)) 
  
# This code is contributed by Ansu Kumari 

