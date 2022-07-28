

# Python3 implementation to count  
# pairs from both sorted arrays  
# whose sum is equal to a given value  
  
# function to count all pairs from   
# both the sorted arrays whose sum 
# is equal to a given value  
def countPairs(arr1, arr2, m, n, x): 
    count = 0
    us = set() 
  
    # insert all the elements  
    # of 1st array in the hash  
    # table(unordered_set 'us')  
    for i in range(m): 
        us.add(arr1[i]) 
  
    # or each element of 'arr2[]  
    for j in range(n): 
  
        # find (x - arr2[j]) in 'us'  
        if x - arr2[j] in us: 
            count += 1
  
    # required count of pairs 
    return count 
  
# Driver code 
arr1 = [1, 3, 5, 7] 
arr2 = [2, 3, 5, 8] 
m = len(arr1) 
n = len(arr2) 
x = 10
print("Count =",  
       countPairs(arr1, arr2, m, n, x)) 
  
# This code is contributed by Shrikant13 

