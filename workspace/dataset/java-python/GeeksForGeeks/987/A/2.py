

# Python3 implementation for 
# Longest subsequence such that absolute 
# difference between every pair is atmost 1 
  
def longestAr(n, arr): 
    count = dict() 
  
    # Storing the frequency of each 
    # element in the hashtable count 
    for i in arr: 
        count[i] = count.get(i, 0) + 1
  
    kset = count.keys() 
  
    # Max is used to keep a track of 
    # maximum length of the required 
    # subsequence so far. 
    maxm = 0
  
    for it in list(kset): 
        a = it 
        cur = 0
        cur1 = 0
        cur2 = 0
  
        # Store frequency of the 
        # given element+1. 
        if ((a + 1) in count): 
            cur1 = count[a + 1] 
  
        # Store frequency of the 
        # given element-1. 
        if ((a - 1) in count): 
            cur2 = count[a - 1] 
  
        # cur store the longest array 
        # that can be formed using a. 
        cur = count[a] + max(cur1, cur2) 
  
        # update maxm if cur>maxm. 
        if (cur > maxm): 
            maxm = cur 
  
    return maxm 
  
# Driver Code 
if __name__ == '__main__': 
    n = 8
    arr = [2, 2, 3, 5, 5, 6, 6, 6] 
    maxLen = longestAr(n, arr) 
    print(maxLen) 
  
# This code is contributed by mohit kumar 29 

