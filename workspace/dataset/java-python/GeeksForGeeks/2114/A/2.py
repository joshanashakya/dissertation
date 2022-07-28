

# Python3 program to find maximum  
# Length subsequence such that  
# adjacent elements have at least 
# one common digit 
  
# Returns Length of maximum  
# Length subsequence 
def findSubsequence(arr, n): 
  
    # To store the Length of the 
    # maximum Length subsequence 
    Len = 1
  
    # To store current element arr[i] 
    tmp = 0
  
    i, j, d = 0, 0, 0
  
    # To store the Length of the sub-sequence 
    # ending at index i and having common digit d 
    dp = [[0 for i in range(10)]  
             for i in range(n)] 
  
    # To store digits present in current element 
    cnt = [0 for i in range(10)] 
  
    # To store Length of maximum  
    # Length subsequence ending at index i 
    locMax = 0
  
    # For first element maximum  
    # Length is 1 for each digit 
    tmp = arr[0] 
    while (tmp > 0): 
        dp[0][tmp % 10] = 1
        tmp //= 10
  
    # Find digits of each element,  
    # then find Length of subsequence  
    # for each digit and then find 
    # local maximum 
    for i in range(1, n): 
        tmp = arr[i] 
        locMax = 1
        cnt = [0 for i in range(10)] 
  
        # Find digits in current element 
        while (tmp > 0): 
            cnt[tmp % 10] = 1
            tmp //= 10
  
        # For each digit present find Length of 
        # subsequence and find local maximum 
        for d in range(10): 
            if (cnt[d]): 
                dp[i][d] = 1
                for j in range(i): 
                    dp[i][d] = max(dp[i][d],  
                                   dp[j][d] + 1) 
                    locMax = max(dp[i][d], locMax) 
  
        # Update value of dp[i][d] for each digit 
        # present in current element to local  
        # maximum found. 
        for d in range(10): 
            if (cnt[d]): 
                dp[i][d] = locMax 
  
        # Update maximum Length  
        # with local maximum 
        Len = max(Len, locMax) 
    return Len
  
# Driver code 
arr = [1, 12, 44, 29, 33, 96, 89] 
n = len(arr) 
  
print(findSubsequence(arr, n)) 
  
# This code is contributed  
# by mohit kumar 

