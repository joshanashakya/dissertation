

# Python 3 program to count number of pairs 
# such that their hcf and lcm are equal 
from collections import defaultdict 
   
# Function to count number of pairs 
# such that their hcf and lcm are equal 
def countPairs(a, n): 
  
    # Store frequencies of array elements 
    frequency = defaultdict(int) 
    for i in range(n) : 
        frequency[a[i]] += 1
      
   
    count = 0
   
    # Count of pairs (arr[i], arr[j]) 
    # where arr[i] = arr[j] 
    for x in frequency.keys(): 
        f = frequency[x] 
        count += f * (f - 1) // 2
   
    # Count of pairs (arr[i], arr[j]) where 
    # arr[i] = arr[j], 
    return count 
   
# Driver function 
if __name__ == "__main__": 
      
    arr = [ 1, 1, 1 ] 
    n = len(arr) 
    print(countPairs(arr, n)) 
  
# This code is contributed by chitranayal 

