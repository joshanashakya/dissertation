

# Python 3 program to count the number of ways we can 
# partition an array in three parts with equal 
# sum. 
  
# binary search to find the number of required 
# indices in suffix array. Returns index of 
# first element which is greater than x. 
def binarysearch(v, x): 
    low = 0
    high = len(v) - 1
    while (low <= high): 
        mid = int((low + high) / 2) 
        if (v[mid] <= x): 
            low = mid + 1
        elif (v[mid] > x and v[mid - 1] <= x): 
            return mid 
        elif (v[mid] > x and mid == 0): 
            return mid 
        else: 
            high = mid - 1
  
    return -1
  
# function to calculate the number of ways to 
# divide the array into three contiguous parts 
def CountContiguousParts(arr,n): 
    count = 0 # initializing answer 
  
    # Creating and filling prefix array 
    prefix = [0 for i in range(n)] 
    prefix[0] = arr[0] 
    for i in range(1, n, 1): 
        prefix[i] = prefix[i - 1] + arr[i] 
  
    # Total sum of elements is equal to last 
    # value in prefix array. 
    total_sum = prefix[n - 1] 
  
    # If sum of all the elements is not divisible 
    # by 3, we can't divide array in 3 parts of 
    # same sum. 
    if (total_sum % 3 != 0): 
        return 0
  
    # Creating and filling suffix array 
    suffix = [0 for i in range(n)] 
    suffix[n - 1] = arr[n - 1] 
    i = n - 2
    while(i >= 0): 
        suffix[i] = suffix[i + 1] + arr[i] 
        i -= 1
  
    # Storing all indexes with suffix 
    # sum equal to total sum by 3. 
    v = [] 
    for i in range(n): 
        if (suffix[i] == int(total_sum / 3)): 
            v.append(i) 
  
    # Traversing the prefix array and 
    # doing binary search in above vector 
    for i in range(n):  
          
        # We found a prefix with total_sum/3 
        if (prefix[i] == int(total_sum / 3)): 
              
            # Find first index in v[] which 
            # is greater than i+1. 
            res = binarysearch(v, i + 1) 
  
            if (res != -1): 
                count += len(v) - res 
  
    return count 
  
# Driver Code 
if __name__ == '__main__': 
    arr = [1 , 2 , 3 , 0 , 3] 
    n = len(arr) 
    print(CountContiguousParts(arr, n)) 
  
# This code is contributed by 
# Surendra_Gangwar 

