

# Python 3 implementation of  
# the above approach 
MAX = 10000
  
hashTable = [0] * MAX
  
# function to find minimum operations 
def minOperations(arr, n): 
      
    # sort array 
    arr.sort() 
  
    # prepare hash of array 
    for i in range(n): 
        hashTable[arr[i]] += 1
  
    res = 0
    for i in range(n) : 
        if (hashTable[arr[i]]) : 
            for j in range(i, n): 
                if (arr[j] % arr[i] == 0): 
                    hashTable[arr[j]] = 0
            res += 1
  
    return res 
  
# Driver Code 
if __name__ == "__main__": 
    arr = [ 4, 6, 2, 8, 7, 21, 24, 49, 44 ] 
    n = len(arr) 
  
    print(minOperations(arr, n)) 
  
# This code is contributed  
# by ChitraNayal 

