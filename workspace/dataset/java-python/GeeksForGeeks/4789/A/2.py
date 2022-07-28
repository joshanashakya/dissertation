

# Python3 implementation of the approach 
from math import ceil,log,floor,sqrt 
  
# A utility function to get minimum of two numbers 
def minVal(x, y): 
    return min(x, y) 
  
# A utility function to get the 
# middle index from corner indexes. 
def getMid(s, e): 
    return s + (e - s) // 2
  
""" A recursive function to get the 
minimum value in a given range 
of array indexes. The following 
are parameters for this function. 
  
    st --> Pointer to segment tree 
    index --> Index of current node in the 
        segment tree. Initially 0 is 
        passed as root is always at index 0 
    ss & se --> Starting and ending indexes 
                of the segment represented 
                by current node, i.e., st[index] 
    qs & qe --> Starting and ending indexes of query range"""
def RMQUtil(st, ss, se, qs, qe, index): 
      
    # If segment of this node is a part 
    # of given range, then return 
    # the min of the segment 
    if (qs <= ss and qe >= se): 
        return st[index] 
  
    # If segment of this node 
    # is outside the given range 
    if (se < qs or ss > qe): 
        return 10**9
  
    # If a part of this segment 
    # overlaps with the given range 
    mid = getMid(ss, se) 
    return minVal(RMQUtil(st, ss, mid, qs, qe, 2 * index + 1), 
                RMQUtil(st, mid + 1, se, qs, qe, 2 * index + 2)) 
  
# Return minimum of elements in range 
# from index qs (query start) to 
# qe (query end). It mainly uses RMQUtil() 
def RMQ(st, n, qs, qe): 
      
    # Check for erroneous input values 
    if (qs < 0 or qe > n - 1 or qs > qe): 
        print("Invalid Input") 
        return -1
  
    return RMQUtil(st, 0, n - 1, qs, qe, 0) 
  
# A recursive function that constructs 
# Segment Tree for array[ss..se]. 
# si is index of current node in segment tree st 
def constructSTUtil(arr, ss, se, st, si): 
      
    # If there is one element in array, 
    # store it in current node of 
    # segment tree and return 
    if (ss == se): 
        st[si] = arr[ss] 
        return arr[ss] 
  
    # If there are more than one elements, 
    # then recur for left and right subtrees 
    # and store the minimum of two values in this node 
    mid = getMid(ss, se) 
    st[si] = minVal(constructSTUtil(arr, ss, mid, st, si * 2 + 1), 
                constructSTUtil(arr, mid + 1, se, st, si * 2 + 2)) 
    return st[si] 
  
""" Function to construct segment tree 
from given array. This function allocates 
memory for segment tree and calls constructSTUtil() to 
fill the allocated memory"""
def constructST(arr, n): 
      
    # Allocate memory for segment tree 
  
    # Height of segment tree 
    x = ceil(log(n, 2)) 
  
    # Maximum size of segment tree 
    max_size = 2 * pow(2, x) - 1
  
    st = [0]*(max_size) 
  
    # Fill the allocated memory st 
    constructSTUtil(arr, 0, n - 1, st, 0) 
  
    # Return the constructed segment tree 
    return st 
  
# Driver program to test above functions 
if __name__ == '__main__': 
    arr = [3, 2, 1, 4, 5] 
    n = len(arr) 
  
    queries = [[1, 2], [2, 3]] 
    q = len(queries) 
  
    # Build segment tree from given array 
    st = constructST(arr, n) 
  
    # Perform queries 
    for i in range(q): 
  
        # Current index range to be exluded 
        L = queries[i][0] 
        R = queries[i][1] 
  
        # Minimum in the left part 
        if( (L - 1) < 0): 
            left = 10**9
        else: 
            left = RMQ(st, n, 0, L - 1) 
  
        # Minimum in the right part 
        if (R + 1) >= n: 
            right = 10**9
        else: 
            right = RMQ(st, n, R + 1, n - 1) 
  
        # Minimum in the array excluding the given range 
        minn = min(left, right) 
  
        # Complete array has been excluded 
        if (minn == 10**9): 
            print(-1) 
        else: 
            print(minn) 
  
# This code is contributed by mohit kumar 29 

