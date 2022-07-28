

# Python 3 Program to find maximum cost after  
# deleting all the elements form the array  
  
# function to return maximum cost obtained  
def maxCost(a, n, l, r) : 
  
    mx = 0
  
    # find maximum element of the array. 
    for i in range(n) : 
        mx = max(mx, a[i]) 
  
    # create and initialize count of all elements to zero. 
    count = [0] * (mx + 1) 
  
    # calculate frequency of all elements of array. 
    for i in range(n) : 
        count[a[i]] += 1
  
    # stores cost of deleted elements. 
    res = [0] * (mx + 1) 
    res[0] = 0
  
    # selecting minimum range from L and R. 
    l = min(l, r) 
  
    for num in range(1, mx + 1) : 
  
        # finds upto which elements are to be  
        # deleted when element num is selected. 
        k = max(num - l - 1, 0) 
  
        # get maximum when selecting element num or not.  
        res[num] = max(res[num - 1], num * count[num] + res[k]) 
  
    return res[mx] 
  
# Driver code 
if __name__ == "__main__" : 
  
    a = [2, 1, 2, 3, 2, 2, 1 ] 
    l, r = 1, 1
  
    # size of array  
    n =  len(a) 
  
    # function call to find maximum cost  
    print(maxCost(a, n, l, r)) 
  
# This code is contributed by ANKITRAI1 

