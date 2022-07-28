

# Python3 implementation of the approach 
  
# Function to return the minimum cost 
# to make each array element equal 
def minCost(arr, n): 
      
    # To store the count of even numbers 
    # present in the array 
    count_even = 0
  
    # To store the count of odd numbers 
    # present in the array 
    count_odd = 0
  
    # Iterate through the array and 
    # find the count of even numbers 
    # and odd numbers 
    for i in range(n): 
        if (arr[i] % 2 == 0): 
            count_even += 1
        else: 
            count_odd += 1
  
    return min(count_even, count_odd) 
  
# Driver code 
arr = [2, 4, 3, 1, 5] 
n = len(arr) 
  
print(minCost(arr, n)) 
  
# This code is contributed by Mohit Kumar 

