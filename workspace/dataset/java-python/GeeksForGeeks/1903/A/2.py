

# Python3 program to find minimum  
# element to remove so no common  
# element exist in both array 
  
# To find no elements to remove 
# so no common element exist 
def minRemove(a, b, n, m): 
  
    # To store count of array element 
    countA = dict() 
    countB = dict() 
  
    # Count elements of a 
    for i in range(n): 
        countA[a[i]] = countA.get(a[i], 0) + 1
  
    # Count elements of b 
    for i in range(n): 
        countB[b[i]] = countB.get(b[i], 0) + 1
  
    # Traverse through all common  
    # element, and pick minimum  
    # occurrence from two arrays 
    res = 0
    for x in countA: 
        if x in countB.keys(): 
            res += min(countA[x],countB[x]) 
  
    # To return count of 
    # minimum elements 
    return res 
  
# Driver Code 
a = [ 1, 2, 3, 4 ] 
b = [2, 3, 4, 5, 8 ] 
n = len(a) 
m = len(b) 
print(minRemove(a, b, n, m)) 
  
# This code is contributed  
# by mohit kumar 

