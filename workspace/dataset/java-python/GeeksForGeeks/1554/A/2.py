

# Python3 implementation to find longest  
# subsequence such that difference between  
# adjacents is one  
from collections import defaultdict 
  
# function to find longest subsequence such  
# that difference between adjacents is one  
def longLenSub(arr, n): 
  
    # hash table to map the array element  
    # with the length of the longest  
    # subsequence of which it is a part of  
    # and is the last element of that subsequence  
    um = defaultdict(lambda:0) 
    longLen = 0
    for i in range(n): 
  
        # / initialize current length  
        # for element arr[i] as 0  
        len1 = 0
  
        # if 'arr[i]-1' is in 'um' and its length  
        # of subsequence is greater than 'len'  
        if (arr[i - 1] in um and 
            len1 < um[arr[i] - 1]): 
            len1 = um[arr[i] - 1] 
  
        # f 'arr[i]+1' is in 'um' and its length  
        # of subsequence is greater than 'len'      
        if (arr[i] + 1 in um and 
            len1 < um[arr[i] + 1]): 
            len1 = um[arr[i] + 1] 
  
        # update arr[i] subsequence  
        # length in 'um'      
        um[arr[i]] = len1 + 1
  
        # update longest length  
        if longLen < um[arr[i]]: 
            longLen = um[arr[i]] 
  
    # required longest length 
    # subsequence  
    return longLen 
  
# Driver code 
arr = [1, 2, 3, 4, 5, 3, 2] 
n = len(arr) 
print("Longest length subsequence =", 
                  longLenSub(arr, n)) 
  
# This code is contributed by Shrikant13 

