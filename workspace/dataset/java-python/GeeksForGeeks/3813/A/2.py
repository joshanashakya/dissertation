

# Python Program to find GCD of a number in a given Range 
# using segment Trees 
  
# To store segment tree 
st = [] 
  
# Function to find gcd of 2 numbers. 
def gcd(a: int, b: int) -> int: 
    if a < b: 
        a, b = b, a 
    if b == 0: 
        return a 
    return gcd(b, a % b) 
  
# A recursive function to get gcd of given 
# range of array indexes. The following are parameters for 
# this function. 
  
# st --> Pointer to segment tree 
# si --> Index of current node in the segment tree. Initially 
#             0 is passed as root is always at index 0 
# ss & se --> Starting and ending indexes of the segment 
#                 represented by current node, i.e., st[index] 
# qs & qe --> Starting and ending indexes of query range 
def findGcd(ss: int, se: int, qs: int, qe: int, si: int) -> int: 
    if ss > qe or se < qs: 
        return 0
    if qs <= ss and qe >= se: 
        return st[si] 
    mid = ss + (se - ss) // 2
    return gcd(findGcd(ss, mid, qs, qe, si * 2 + 1), 
            findGcd(mid + 1, se, qs, qe, si * 2 + 2)) 
  
# Finding The gcd of given Range 
def findRangeGcd(ss: int, se: int, arr: list, n: int) -> int: 
    if ss < 0 or se > n - 1 or ss > se: 
        print("invalid Arguments") 
        return -1
    return findGcd(0, n - 1, ss, se, 0) 
  
# A recursive function that constructs Segment Tree for 
# array[ss..se]. si is index of current node in segment 
# tree st 
def constructST(arr: list, ss: int, se: int, si: int) -> int: 
    if ss == se: 
        st[si] = arr[ss] 
        return st[si] 
    mid = ss + (se - ss) // 2
    st[si] = gcd(constructST(arr, ss, mid, si * 2 + 1), 
                constructST(arr, mid + 1, se, si * 2 + 2)) 
    return st[si] 
  
# Function to construct segment tree from given array. 
# This function allocates memory for segment tree and 
# calls constructSTUtil() to fill the allocated memory 
def constructSegmentTree(arr: list, n: int) -> list: 
    global st 
    from math import ceil, log2, pow
  
    height = int(ceil(log2(n))) 
    size = 2 * int(pow(2, height)) - 1
    st = [0] * size 
    constructST(arr, 0, n - 1, 0) 
    return st 
  
# Returns size of smallest subarray of arr[0..n-1] 
# with GCD equal to k. 
def findSmallestSubarr(arr: list, n: int, k: int) -> int: 
  
    # To check if a multiple of k exists. 
    found = False
  
    # Find if k or its multiple is present 
    for i in range(n): 
  
        # If k is present, then subarray size is 1. 
        if arr[i] == k: 
            return 1
  
        # Break the loop to indicate presence of a 
        # multiple of k. 
        if arr[i] % k == 0: 
            found = True
  
    # If there was no multiple of k in arr[], then 
    # we can't get k as GCD. 
    if found == False: 
        return -1
  
    # If there is a multiple of k in arr[], build 
    # segment tree from given array 
    constructSegmentTree(arr, n) 
  
    # Initialize result 
    res = n + 1
  
    # Now consider every element as starting point 
    # and search for ending point using Binary Search 
    for i in range(n - 1): 
  
        # a[i] cannot be a starting point, if it is 
        # not a multiple of k. 
        if arr[i] % k != 0: 
            continue
  
        # Initialize indexes for binary search of closest 
        # ending point to i with GCD of subarray as k. 
        low = i + 1
        high = n - 1
  
        # Initialize closest ending point for i. 
        closest = 0
  
        # Binary Search for closest ending point 
        # with GCD equal to k. 
        while True: 
  
            # Find middle point and GCD of subarray 
            # arr[i..mid] 
            mid = low + (high - low) // 2
            gcd = findRangeGcd(i, mid, arr, n) 
  
            # If GCD is more than k, look further 
            if gcd > k: 
                low = mid 
  
            # If GCD is k, store this point and look for 
            # a closer point 
            elif gcd == k: 
                high = mid 
                closest = mid 
                break
  
            # If GCD is less than, look closer 
            else: 
                high = mid 
  
            # If termination condition reached, set 
            # closest 
            if abs(high - low) <= 1: 
                if findRangeGcd(i, low, arr, n) == k: 
                    closest = low 
                elif findRangeGcd(i, high, arr, n) == k: 
                    closest = high 
                break
        if closest != 0: 
            res = min(res, closest - i + 1) 
  
    # If res was not changed by loop, return -1, 
    # else return its value. 
    return -1 if res == n + 1 else res 
  
# Driver Code 
if __name__ == "__main__": 
    n = 8
    k = 3
    arr = [6, 9, 7, 10, 12, 24, 36, 27] 
    print("Size of smallest sub-array with given size is", 
        findSmallestSubarr(arr, n, k)) 
  
# This code is contributed by 
# sanjeev2552 

