

# Python 3 implementation of the approach 
N = 1000
  
# Function to return the count 
# of valid pairs 
def countPairs(arr, n): 
      
    # Frequency array 
    # Twice the original size to hold 
    # negative elements as well 
    size = (2 * N) + 1
    freq = [0 for i in range(size)] 
  
    # Update the frequency of each 
    # of the array element 
    for i in range(n): 
        x = arr[i] 
  
        # If say x = -1000 then we will place 
        # the frequency of -1000 at 
        # (-1000 + 1000 = 0) a[0] index 
        freq[x + N] += 1
  
    # To store the count of valid pairs 
    ans = 0
  
    # Remember we will check only for (even, even) 
    # or (odd, odd) pairs of indexes as the average 
    # of two consecutive elements is 
    # a floating point number 
    for i in range(size): 
        if (freq[i] > 0): 
            ans += int(((freq[i]) * (freq[i] - 1)) / 2) 
  
            for j in range(i + 2, 2001, 2): 
                if (freq[j] > 0 and 
                   (freq[int((i + j) / 2)] > 0)): 
                    ans += (freq[i] * freq[j]) 
                  
    return ans 
  
# Driver code 
if __name__ == '__main__': 
    arr = [4, 2, 5, 1, 3, 5] 
    n = len(arr) 
  
    print(countPairs(arr, n)) 
      
# This code is contributed by 
# Surendra_Gangwar 

