

# Python 3 implementation to count  
# pairs from both sorted arrays  
# whose sum is equal to a given 
# value 
  
# function to search 'value'  
# in the given array 'arr[]'  
# it uses binary search technique  
# as 'arr[]' is sorted  
def isPresent(arr, low, high, value): 
  
    while (low <= high): 
      
        mid = (low + high) // 2
          
        # value found 
        if (arr[mid] == value): 
            return True
              
        elif (arr[mid] > value) : 
            high = mid - 1
        else: 
            low = mid + 1
      
    # value not found 
    return False
  
# function to count all pairs  
# from both the sorted arrays  
# whose sum is equal to a given 
# value 
def countPairs(arr1, arr2, m, n, x): 
    count = 0
    for i in range(m): 
        # for each arr1[i] 
        value = x - arr1[i] 
          
        # check if the 'value' 
        # is present in 'arr2[]' 
        if (isPresent(arr2, 0, n - 1, value)): 
            count += 1
      
    # required count of pairs      
    return count 
  
# Driver Code 
if __name__ == "__main__": 
    arr1 = [1, 3, 5, 7] 
    arr2 = [2, 3, 5, 8] 
    m = len(arr1) 
    n = len(arr2) 
    x = 10
    print("Count = ", 
           countPairs(arr1, arr2, m, n, x)) 
  
# This code is contributed  
# by ChitraNayal 

