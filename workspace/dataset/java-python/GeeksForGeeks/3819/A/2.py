

# Python3 program to count inversions in all sub arrays 
# of size k using Binary Indexed Tree 
from bisect import bisect_left as lower_bound 
  
# Returns sum of arr[0..index]. This function assumes 
# that the array is preprocessed and partial sums of 
# array elements are stored in BITree. 
def getSum(BITree, index): 
  
    sum = 0 # Initialize result 
  
    # Traverse ancestors of BITree[index] 
    while (index > 0): 
      
        # Add current element of BITree to sum 
        sum += BITree[index] 
  
        # Move index to parent node in getSum View 
        index -= index & (-index) 
  
    return sum
  
# Updates a node in Binary Index Tree (BITree) at 
# given index in BITree. The given value 'val' is 
# added to BITree[i] and all of its ancestors in 
# tree. 
def updateBIT(BITree, n, index, val): 
  
    # Traverse all ancestors and add 'val' 
    while (index <= n): 
        # Add 'val' to current node of BI Tree 
        BITree[index] += val 
  
        # Update index to that of parent 
        # in update View 
        index += index & (-index) 
  
# Converts an array to an array with values from 1 to n 
# and relative order of smaller and greater elements 
# remains same. For example,7, -90, 100, 1 is 
# converted to3, 1, 4, 2 
def convert(arr, n): 
  
    # Create a copy of arrp in temp and sort 
    # the temp array in increasing order 
    temp = [0]*(n) 
    for i in range(n): 
        temp[i] = arr[i] 
    temp = sorted(temp) 
  
    # Traverse all array elements 
    for i in range(n): 
  
        # lower_bound() Returns pointer to 
        # the first element greater than 
        # or equal to arr[i] 
        arr[i] = lower_bound(temp, arr[i]) + 1
  
# Returns inversion count of all subarray 
# of size k in arr[0..n-1] 
def getInvCount(arr, k, n): 
  
    invcount = 0 # Initialize result 
  
    # Convert arr to an array with values from 
    # 1 to n and relative order of smaller and 
    # greater elements remains same. For example, 
    # 7, -90, 100, 1 is converted to3, 1, 4, 2 
    convert(arr, n) 
  
    # Create a BIT with size equal to maxElement+1 
    # (Extra one is used so that elements can be 
    # directly be used as index) 
    BIT=[0]*(n + 1) 
    for i in range(1, n + 1): 
        BIT[i] = 0
  
    # Get inversion count of first subarray 
    for i in range(k - 1, -1, -1): 
  
        # Get count of elements smaller than arr[i] 
        invcount += getSum(BIT, arr[i] - 1) 
  
        # Add current element to BIT 
        updateBIT(BIT, n, arr[i], 1) 
  
    # now calculate the inversion of all other subarrays 
    ans = invcount 
    i = 0
    j = k 
    icnt = 0
    jcnt = 0
    while (j <= n - 1): 
  
        # calculate value of inversion count of first element 
        # in previous subarray 
        icnt = getSum(BIT, arr[i] - 1) 
        updateBIT(BIT, n, arr[i], -1) 
  
        # calculating inversion count of last element in the 
        # current subarray 
        jcnt = getSum(BIT, n) - getSum(BIT, arr[j]) 
        updateBIT(BIT, n, arr[j], 1) 
  
        # calculating inversion count of current subarray 
        invcount = invcount - icnt + jcnt 
  
        # adding current inversion to the answer 
        ans = ans + invcount 
        i += 1
        j += 1
  
    return ans 
  
# Driver code 
if __name__ == '__main__': 
    arr= [7, 3, 2, 4, 1] 
    k = 3
    n = len(arr) 
    print("Number of inversions in all subarrays of size "
            ,k," are : ",getInvCount(arr, k, n)) 
  
# This code is contributed by mohit kumar 29 

