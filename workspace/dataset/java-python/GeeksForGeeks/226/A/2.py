

# Python3 implementation of the above approach 
  
# Function to find the number of permutations 
# possible of the original array to satisfy 
# the given absolute differences 
def totalways(arr, n): 
      
    # To store the count of each 
    # a[i] in a map 
    cnt = dict() 
    for i in range(n): 
        cnt[arr[i]] = cnt.get(arr[i], 0) + 1
  
    # if n is odd 
    if (n % 2 == 1): 
        start, endd = 0, n - 1
  
        # check the count of each whether 
        # it satisfy the given criteria or not 
        for i in range(start, endd + 1, 2): 
            if (i == 0): 
  
                # there is only 1 way 
                # for middle element. 
                if (cnt[i] != 1): 
                    return 0
            else: 
  
                # for others there are 2 ways. 
                if (cnt[i] != 2): 
                    return 0
  
        # now find total ways 
        ways = 1
        start = 2
        endd = n - 1
        for i in range(start, endd + 1, 2): 
            ways = ways * 2
        return ways 
  
    # When n is even. 
    elif (n % 2 == 0): 
  
        # there will be no middle element so 
        # for each a[i] there will be 2 ways 
        start = 1
        endd = n - 1
        for i in range(1, endd + 1, 2): 
            if (cnt[i] != 2): 
                return 0
        ways = 1
        for i in range(start, endd + 1, 2): 
            ways = ways * 2
        return ways 
  
# Driver Code 
N = 5
  
arr = [2, 4, 4, 0, 2 ] 
  
print(totalways(arr, N)) 
  
# This code is contributed by Mohit Kumar 

