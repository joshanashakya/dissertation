

# python to find min cost to make 
# XOR of whole array zero 
  
# function to find min cost 
def minCost(arr,n): 
      
    cost = 999999; 
      
    # calculate XOR sum of array 
    XOR = 0; 
    for i in range(0, n): 
        XOR ^= arr[i]; 
  
    # find the min cost and element  
    # corresponding 
    for i in range(0,n): 
        if (cost > abs((XOR ^ arr[i]) - arr[i])): 
            cost = abs((XOR ^ arr[i]) - arr[i]) 
            element = arr[i] 
  
    print("Element = ", element) 
    print("Operation required = ", abs(cost)) 
  
  
# driver program 
arr = [ 2, 8, 4, 16 ] 
n = len(arr) 
minCost(arr, n) 
  
# This code is contributed by Sam007 

