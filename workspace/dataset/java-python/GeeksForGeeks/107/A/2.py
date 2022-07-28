

# Python 3 implenetation of the approach 
  
# Function to find number of unordered pairs 
def freqPairs(arr, n): 
      
    # Maximum element from the array 
    max = arr[0] 
    for i in range(len(arr)): 
        if arr[i] > max: 
            max = arr[i] 
  
    # Array to store the frequency of  
    # each element 
    freq = [0 for i in range(max + 1)]  
  
    # Stores the number of unordered pairs 
    count = 0
  
    # Store the frequency of each element 
    for i in range(n): 
        freq[arr[i]] += 1
  
    # Find the number of unordered pairs 
    for i in range(n): 
        for j in range(2 * arr[i],  
                           max + 1, arr[i]): 
              
            # If the number j divisible by ith  
            # element is present in the array 
            if (freq[j] >= 1): 
                count += freq[j] 
  
        # If the ith element of the array 
        # has frequency more than one 
        if (freq[arr[i]] > 1): 
            count += freq[arr[i]] - 1
            freq[arr[i]] -= 1
  
    return count 
  
# Driver code 
if __name__ == '__main__': 
    arr = [3, 2, 4, 2, 6] 
    n = len(arr) 
  
    print(freqPairs(arr, n)) 
  
# This code is contributed by 
# Surendra_Gangwar 

