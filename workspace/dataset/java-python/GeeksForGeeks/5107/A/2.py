

# Python3 implementation of the approach 
  
# Function To find the required interval 
def solve(interval, N, Q): 
  
    Mark = [0 for i in range(Q)] 
    for i in range(N): 
        l = interval[i][0] - 1
        r = interval[i][1] - 1
        for j in range(l, r + 1): 
            Mark[j] += 1
      
    # Total Count of covered numbers 
    count = 0
    for i in range(Q): 
        if (Mark[i]): 
            count += 1
  
    # Array to store numbers that occur 
    # exactly in one interval till ith interval 
    count1 = [0 for i in range(Q)] 
    if (Mark[0] == 1): 
        count1[0] = 1
    for i in range(1, Q): 
        if (Mark[i] == 1): 
            count1[i] = count1[i - 1] + 1
        else: 
            count1[i] = count1[i - 1] 
      
    maxindex = 0
    maxcoverage = 0
    for i in range(N): 
        l = interval[i][0] - 1
        r = interval[i][1] - 1
  
        # Calculate New count by removing all numbers 
        # in range [l, r] occurring exactly once 
        elem1 = 0
        if (l != 0): 
            elem1 = count1[r] - count1[l - 1] 
        else: 
            elem1 = count1[r] 
        if (count - elem1 >= maxcoverage): 
            maxcoverage = count - elem1 
            maxindex = i 
          
    print("Maximum Coverage is", maxcoverage,  
          "after removing interval at index", maxindex) 
  
# Driver code 
interval = [[ 1, 4 ], 
            [ 4, 5 ], 
            [ 5, 6 ], 
            [ 6, 7 ], 
            [ 3, 5 ]] 
N = len(interval) 
Q = 7
solve(interval, N, Q) 
  
# This code is contributed by mohit kumar 

