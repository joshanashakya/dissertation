

# Python3 implementation to find length of smallest 
# subsequence such that sum of elements 
# is greater than equal to given number K 
  
# Function to find the smallest 
# subsequence such that sum of elements 
# is greater than equal to given number K 
def lengthOfSmallestSubsequence(K, v): 
      
    # Initialize priority queue 
    pq = [] 
  
    # Loop to insert all elements into 
    # the priority queue 
    for i in v: 
        pq.append(i) 
    pq.sort() 
  
    sum = 0
    count = 0
  
    # Loop to find the smallest 
    # subsequence such that sum of elements 
    # is greater than equal to given number K 
    while (len(pq) > 0 and sum < K): 
        sum += pq[-1] 
        del pq[-1] 
        count += 1
      
    # If sum is less then K 
    # then return -1 else return count. 
    if (sum < K): 
        return -1
    return count 
  
# Driver code 
v = [2, 3, 1, 5, 
    6, 3, 7, 9, 
    14, 10, 2, 5] 
K = 35
  
print(lengthOfSmallestSubsequence(K, v)) 
  
# This code is contributed by mohit kumar 29 

