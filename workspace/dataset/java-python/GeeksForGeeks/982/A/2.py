

# Python3 implementation of the above approach  
  
# w1_r represents remaining capacity of 1st knapsack  
# w2_r represents remaining capacity of 2nd knapsack  
# i represents index of the array arr we are working on  
def maxWeight(arr, n, w1_r, w2_r, i):  
  
    # Base case  
    if i == n: 
        return 0
    if dp[i][w1_r][w2_r] != -1:  
        return dp[i][w1_r][w2_r]  
  
    # Variables to store the result of three  
    # parts of recurrence relation  
    fill_w1, fill_w2, fill_none = 0, 0, 0
  
    if w1_r >= arr[i]: 
        fill_w1 = arr[i] + maxWeight(arr, n, w1_r - arr[i],  
                                             w2_r, i + 1)  
  
    if w2_r >= arr[i]: 
        fill_w2 = arr[i] + maxWeight(arr, n, w1_r,  
                                     w2_r - arr[i], i + 1)  
  
    fill_none = maxWeight(arr, n, w1_r, w2_r, i + 1)  
  
    # Store the state in the 3D array  
    dp[i][w1_r][w2_r] = max(fill_none, max(fill_w1, 
                                           fill_w2))  
  
    return dp[i][w1_r][w2_r]  
  
  
# Driver code  
if __name__ == "__main__":  
  
    # Input array  
    arr = [8, 2, 3]  
    maxN, maxW = 31, 31
      
    # 3D array to store  
    # states of DP  
    dp = [[[-1] * maxW] * maxW] * maxN 
      
    # Number of elements in the array  
    n = len(arr)  
  
    # Capacity of knapsacks  
    w1, w2 = 10, 3
  
    # Function to be called  
    print(maxWeight(arr, n, w1, w2, 0))  
      
# This code is contributed by Rituraj Jain 

