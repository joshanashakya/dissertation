

# Python3 implementation of the approach 
  
# Function to return the smallest number 
# that divides minimum number of elements 
def findMin(arr, n): 
      
    # m stores the maximum in the array 
    m = 0
    for i in range(n): 
        m = max(m, arr[i]) 
  
    # Frequency table 
    cnt = [0] * (m + 2) 
  
    # Loop to factorize 
    for i in range(n): 
  
        # sqrt factorization of the numbers 
        j = 1
        while j * j <= arr[i]: 
  
            if (arr[i] % j == 0): 
                if (j * j == arr[i]): 
                    cnt[j] += 1
                else: 
                    cnt[j] += 1
                    cnt[arr[i] // j] += 1
            j += 1    
  
    # Finding the smallest number 
    # with zero multiples 
    for i in range(1, m + 2): 
        if (cnt[i] == 0): 
            return i 
  
    return -1
  
# Driver code 
arr = [2, 12, 6] 
n = len(arr) 
  
print(findMin(arr, n)) 
  
# This code is contributed by Mohit Kumar 

