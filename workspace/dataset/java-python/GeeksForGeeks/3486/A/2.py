

# Python3 implementation of the approach 
  
# Function to return the minimum number 
# of operations needed to partition 
# the array in k contiguous groups 
# such that all elements of a 
# given group are identical 
def getMinimumOps(ar, k): 
      
    # n is the size of the array 
    n = len(ar) 
  
    # dp(i, j) represents the minimum cost for 
    # partitioning the array[0..i] into j groups 
    dp = [[ 0 for i in range(k + 1)]  
              for i in range(n)] 
  
    # Base case, cost is 0 for parititoning the 
    # array[0..0] into 1 group 
    dp[0][1] = 0
  
    # Fill dp(i, j) and the answer will 
    # be stored at dp(n-1, k) 
    for i in range(1, n): 
  
        # The maximum groups that the segment 0..i can 
        # be divided in is represented by maxGroups 
        maxGroups = min(k, i + 1) 
  
        for j in range(1, maxGroups + 1): 
  
            # Initialize dp(i, j) to infinity 
            dp[i][j] = 10**9
  
            # Divide segment 0..i in 1 group 
            if (j == 1): 
  
                # map and freqOfMode are together used to 
                # keep track of the frequency of the most 
                # occurring element in [0..i] 
                freq1 = dict() 
                freqOfMode = 0
                for it in range(0, i + 1): 
  
                    freq1[ar[it]] = freq1.get(ar[it], 0) + 1
                    newElementFreq = freq1[ar[it]] 
                    if (newElementFreq > freqOfMode): 
                        freqOfMode = newElementFreq 
  
                # Change all the elements in the range 
                # 0..i to the most frequent element 
                # in this range 
                dp[i][1] = (i + 1) - freqOfMode 
  
            else: 
                freq = dict() 
                freqOfMode = 0
  
                # If the jth group is the segment from 
                # it..i, we change all the elements in this 
                # range to this range's most occurring element 
                for it in range(i, j - 2, -1): 
                      
                    #print(i,j,it) 
                    freq[ar[it]] = freq.get(ar[it], 0) + 1
                    newElementFreq = freq[ar[it]] 
                    if (newElementFreq > freqOfMode): 
                        freqOfMode = newElementFreq 
  
                    # Number of elements we need to change 
                    # in the jth group i.e. the range it..i 
                    elementsToChange = i - it + 1
                    elementsToChange -= freqOfMode 
  
                    # For all the possible sizes of the jth 
                    # group that end at the ith element 
                    # we pick the size that gives us the minimum 
                    # cost for dp(i, j) 
                    # elementsToChange is the cost of making 
                    # all the elements in the jth group identical 
                    # and we make use of dp(it - 1, j - 1) to 
                    # find the overall minimal cost 
                    dp[i][j] = min(dp[it - 1][j - 1] +  
                                   elementsToChange, dp[i][j]) 
  
    # Return the minimum cost for 
    # partitioning array[0..n-1] 
    # into k groups which is 
    # stored at dp(n-1, k) 
    return dp[n - 1][k] 
  
# Driver code 
k = 3
ar =[3, 1, 3, 3, 2, 1, 8, 5] 
  
print(getMinimumOps(ar, k)) 
  
# This code is contributed by Mohit Kumar 

