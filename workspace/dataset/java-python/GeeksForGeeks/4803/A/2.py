

# Python 3 implementation to count 
# pairs from both sorted arrays 
# whose sum is equal to a given 
# value 
  
# function to count all pairs 
# from both the sorted arrays 
# whose sum is equal to a given 
# value 
def countPairs(arr1, arr2, m, n, x): 
    count, l, r = 0, 0, n - 1
      
    # traverse 'arr1[]' from 
    # left to right 
    # traverse 'arr2[]' from 
    # right to left 
    while (l < m and r >= 0): 
          
        # if this sum is equal 
        # to 'x', then increment 'l', 
        # decrement 'r' and 
        # increment 'count' 
        if ((arr1[l] + arr2[r]) == x): 
            l += 1
            r -= 1
            count += 1
              
        # if this sum is less 
        # than x, then increment l 
        elif ((arr1[l] + arr2[r]) < x): 
            l += 1
              
        # else decrement 'r' 
        else: 
            r -= 1
              
    # required count of pairs 
    return count 
  
# Driver Code 
if __name__ == '__main__': 
    arr1 = [1, 3, 5, 7] 
    arr2 = [2, 3, 5, 8] 
    m = len(arr1) 
    n = len(arr2) 
    x = 10
    print("Count =", 
            countPairs(arr1, arr2, 
                          m, n, x)) 
  
# This code is contributed  
# by PrinciRaj19992 

