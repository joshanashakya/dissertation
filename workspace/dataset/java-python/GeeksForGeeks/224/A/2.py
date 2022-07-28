

# Python3 implementation of the approach 
  
# Function to return the smallest number 
# that divides minimum number of elements 
# in the given array 
def findMin(arr, n): 
      
    # m stores the maximum in the array 
    m = 0
    for i in range(n): 
        m = max(m, arr[i]) 
  
    # Frequency array 
    freq = [0] * (m + 2) 
    for i in range(n): 
        freq[arr[i]] += 1
  
    # Sieve 
    for i in range(1, m + 2): 
        j = i 
        cnt = 0
  
        # Incrementing j 
        while (j <= m): 
            cnt += freq[j] 
            j += i 
  
        # If no multiples of j are 
        # in the array 
        if (not cnt): 
            return i 
  
    return m + 1
  
# Driver code 
arr = [2, 12, 6] 
n = len(arr) 
  
print(findMin(arr, n)) 
  
# This code is contributed by Mohit Kumar 

