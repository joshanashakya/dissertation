

# Python3 implementation of the approach 
  
# Function to return the minimum required cost 
def minCost(arr, cost, n): 
  
    # To store the cost of choosing three elements 
    costThree = 10**9
  
    # Fix the middle element 
    for j in range(n): 
  
        # Initialse cost of the first 
        # and the third element 
        costI = 10**9
        costK = 10**9
  
        # Search for the first element 
        # in the left subarray 
        for i in range(j): 
  
            # If smaller element is found 
            # then update the cost 
            if (arr[i] < arr[j]): 
                costI = min(costI, cost[i]) 
  
        # Search for the third element 
        # in the right subarray 
        for k in range(j + 1, n): 
  
            # If greater element is found 
            # then update the cost 
            if (arr[k] > arr[j]): 
                costK = min(costK, cost[k]) 
  
        # If a valid triplet was found then 
        # update the minimum cost so far 
        if (costI != 10**9 and costK != 10**9): 
            costThree = min(costThree, cost[j] + 
                               costI + costK) 
  
    # No such triplet found 
    if (costThree == 10**9): 
        return -1
    return costThree 
  
# Driver code 
arr = [2, 4, 5, 4, 10] 
cost = [40, 30, 20, 10, 40] 
n = len(arr) 
  
print(minCost(arr, cost, n)) 
  
# This code is contributed by Mohit Kumar 

