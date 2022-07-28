

# Python3 implementation to find length of  
# longest strict bitonic subsequence 
  
# function to find length of longest 
# strict bitonic subsequence 
def longLenStrictBitonicSub(arr, n): 
  
    # hash table to map the array element  
    # with the length of the longest subsequence  
    # of which it is a part of and is the  
    # last/first element of that subsequence 
    inc, dcr = dict(), dict() 
  
    # arrays to store the length of increasing 
    # and decreasing subsequences which end at  
    # them or start from them 
    len_inc, len_dcr = [0] * n, [0] * n 
  
    # to store the length of longest strict 
    # bitonic subsequence 
    longLen = 0
  
    # traverse the array elements 
    # from left to right 
    for i in range(n): 
  
        # initialize current length 
        # for element arr[i] as 0 
        len = 0
  
        # if 'arr[i]-1' is in 'inc' 
        if inc.get(arr[i] - 1) in inc.values(): 
            len = inc.get(arr[i] - 1) 
          
        # update arr[i] subsequence length in 'inc'      
        # and in len_inc[]  
        inc[arr[i]] = len_inc[i] = len + 1
      
    # traverse the array elements 
    # from right to left 
    for i in range(n - 1, -1, -1): 
  
        # initialize current length 
        # for element arr[i] as 0 
        len = 0
  
        # if 'arr[i]-1' is in 'dcr' 
        if dcr.get(arr[i] - 1) in dcr.values(): 
            len = dcr.get(arr[i] - 1) 
          
        # update arr[i] subsequence length   
        # in 'dcr' and in len_dcr[]  
        dcr[arr[i]] = len_dcr[i] = len + 1
      
    # calculating the length of  
    # all the strict bitonic subsequence  
    for i in range(n): 
        if longLen < (len_inc[i] + len_dcr[i] - 1): 
            longLen = len_inc[i] + len_dcr[i] - 1
      
    # required longest length strict  
    # bitonic subsequence  
    return longLen 
  
# Driver Code 
if __name__ == "__main__": 
    arr = [1, 5, 2, 3, 4, 5, 3, 2] 
    n = len(arr) 
    print("Longest length strict bitonic subsequence =", 
           longLenStrictBitonicSub(arr, n)) 
  
# This code is contributed by sanjeev2552 

