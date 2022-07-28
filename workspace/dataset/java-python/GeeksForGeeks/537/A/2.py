

# Python3 implementation of the approach  
  
# Function to return the 
# count of valid pairs 
def countPairs(arr, n): 
  
    # To store the required count 
    cnt = 0; 
  
    # For each index pair (i, j) 
    for i in range(n): 
        for j in range(i + 1, n): 
  
            # If current pair is valid 
            # then increment the count 
            if (arr[i] != arr[j]): 
                cnt += 1; 
  
    return cnt; 
  
# Driver code 
if __name__ == '__main__': 
    arr = [ 1, 1, 2 ]; 
    n = len(arr); 
  
    print(countPairs(arr, n)); 
      
# This code is contributed by 29AjayKumar 

