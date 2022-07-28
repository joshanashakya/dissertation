

# Python3 implementation of the approach  
  
# Function to return the minimum cost  
def minCost(n, arr, cost):  
  
    Sum, totalCost = 0, 0
  
    # Sum of all the array elements  
    # except the last element  
    for i in range(0, n - 1):  
        Sum += arr[i]  
  
    # Cost of making all the array elements 0  
    # except the last element  
    totalCost += cost * Sum
  
    # Update the last element  
    arr[n - 1] += Sum
  
    # Cost of making the last element 0  
    totalCost += (2 * cost * arr[n - 1])  
  
    return totalCost  
  
# Driver code  
if __name__ == "__main__": 
  
    arr = [1, 2, 4, 5]  
    n = len(arr)  
    cost = 1
    print(minCost(n, arr, cost))  
  
# This code is contributed by Rituraj Jain 

