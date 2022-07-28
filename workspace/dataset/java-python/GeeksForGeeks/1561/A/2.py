

# Python3 program to get maximum Sum two  
# non-overlapping subarrays of same specified length  
  
# Utility method to get Sum of  
# subarray from index i to j  
def getSubarraySum(Sum, i, j):  
  
    if i == 0: 
        return Sum[j]  
    else: 
        return Sum[j] - Sum[i - 1]  
  
# Method prints two non-overlapping subarrays  
# of length K whose Sum is maximum  
def maximumSumTwoNonOverlappingSubarray(arr, N, K):  
  
    Sum = [None] * N 
  
    # filling prefix Sum array  
    Sum[0] = arr[0]  
    for i in range(1, N):  
        Sum[i] = Sum[i - 1] + arr[i]  
  
    # Initializing subarrays from 
    # (N-2K) and (N-K) indices  
    resIndex = (N - 2 * K, N - K)  
  
    # initializing result Sum from above subarray Sums  
    maxSum2Subarray = (getSubarraySum(Sum, N - 2 * K, N - K - 1) + 
                       getSubarraySum(Sum, N - K, N - 1))  
  
    # storing second subarray maximum and its starting index  
    secondSubarrayMax = (N - K, getSubarraySum(Sum, N - K, N - 1))  
  
    # looping from N-2K-1 towards 0  
    for i in range(N - 2 * K - 1, -1, -1):  
      
        # get subarray Sum from (current index + K)  
        cur = getSubarraySum(Sum, i + K, i + 2 * K - 1)  
  
        # if (current index + K) Sum is more  
        # than update secondSubarrayMax  
        if cur >= secondSubarrayMax[1]: 
            secondSubarrayMax = (i + K, cur)  
  
        # now getting complete Sum (Sum of both subarrays)  
        cur = (getSubarraySum(Sum, i, i + K - 1) + 
                           secondSubarrayMax[1])  
  
        # If it is more then update main result  
        if cur >= maxSum2Subarray: 
          
            maxSum2Subarray = cur  
            resIndex = (i, secondSubarrayMax[0])  
  
    # printing actual subarrays  
    for i in range(resIndex[0], resIndex[0] + K):  
        print(arr[i], end = " ")  
    print()  
  
    for i in range(resIndex[1], resIndex[1] + K):  
        print(arr[i], end = " ")  
    print() 
  
# Driver Code 
if __name__ == "__main__": 
  
    arr = [2, 5, 1, 2, 7, 3, 0]  
    N = len(arr) 
  
    # K will be given such that (N >= 2K)  
    K = 2
  
    maximumSumTwoNonOverlappingSubarray(arr, N, K)  
  
# This code is contributed by Rituraj Jain 

