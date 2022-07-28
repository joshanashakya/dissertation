

# Python3 implementation of the above approach 
  
# Function to count all pairs 
# with equal set bits count 
def totalPairs(arr, n): 
      
    # map to store count of elements 
    # with equal number of set bits 
    m = dict() 
  
    for i in range(n): 
  
        # inbuilt function that returns the 
        # count of set bits of the number 
        x = bin(arr[i]).count('1') 
  
        m[x] = m.get(x, 0) + 1; 
  
    result = 0
    for it in m: 
  
        # there can be (n*(n-1)/2) unique two- 
        # element pairs to choose from n elements 
        result+= (m[it] * (m[it] - 1)) // 2
      
    return result 
  
# Driver code 
arr = [7, 5, 3, 9, 1, 2] 
n = len(arr) 
  
print(totalPairs(arr, n)) 
  
# This code is contributed by mohit kumar 

