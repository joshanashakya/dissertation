

# Naive approach to count pairs 
# with positive sum. 
  
# Returns number of pairs in 
# arr[0..n-1] with positive sum 
def CountPairs(arr, n) : 
    # Initialize result 
    count = 0; 
  
    # Consider all possible pairs 
    # and check their sums 
    for i in range(n) : 
        for j in range( i + 1, n) : 
  
            # If arr[i] & arr[j] 
            # form valid pair 
            if (arr[i] + arr[j] > 0) : 
                count += 1; 
  
    return count; 
  
# Driver's Code 
if __name__ == "__main__" : 
  
    arr = [ -7, -1, 3, 2 ]; 
    n = len(arr); 
  
    # Function call to find the 
    # count of pairs 
    print(CountPairs(arr, n)); 
      
# This code is contributed by Yash_R 

