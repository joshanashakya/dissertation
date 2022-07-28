

# Python3 program to 
# count of pairs with equal 
# elements in an array. 
  
# Return the number of 
# pairs with equal values. 
def countPairs(arr, n): 
  
    ans = 0
  
    # for each index i and j 
    for i in range(0 , n): 
        for j in range(i + 1, n): 
  
            # finding the index  
            # with same value but 
            # different index. 
            if (arr[i] == arr[j]): 
                ans += 1
    return ans 
  
# Driven Code 
arr = [1, 1, 2 ] 
n = len(arr) 
print(countPairs(arr, n)) 
  
# This code is contributed  
# by Smitha 

