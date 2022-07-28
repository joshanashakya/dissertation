

# Python 3 implementation of the approach 
  
# Function to return the count  
# of valid pairs 
def countPairs(arr, n): 
    cnt = 0
  
    # Check all possible pairs 
    for i in range(n - 1): 
        for j in range(i + 1, n, 1): 
            if ((arr[i] | arr[j]) <= max(arr[i],  
                                         arr[j])): 
                cnt += 1
  
    return cnt 
  
# Driver code 
if __name__ == '__main__': 
    arr = [1, 2, 3] 
    n = len(arr) 
    print(countPairs(arr, n)) 
      
# This code is contributed by 
# Surendra_Gangwar 

