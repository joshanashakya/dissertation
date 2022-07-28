

# Python3 implementation of the above approach 
  
# Function to find the maximum pairs 
# such that arr[i + 1] > arr[i] 
def countPairs(arr, N) : 
  
    # To store the frequency of the 
    # element in arr[] 
    M = dict.fromkeys(arr, 0); 
  
    # Store the frequency in map M 
    for i in range(N) : 
        M[arr[i]] += 1; 
  
    maxFreq = 0; 
  
    # To find the maximum frequency 
    # store in map M 
    for it in M.values() : 
        maxFreq = max(maxFreq,it); 
  
    # Print the maximum number of 
    # possible pairs 
    print(N - maxFreq); 
  
# Driver Code 
if __name__ == "__main__" : 
  
    arr = [ 1, 8, 5, 9, 8, 8, 7, 7, 5, 7, 7 ]; 
    N = len(arr); 
  
    countPairs(arr, N); 
      
    # This code is contributed by AnkitRai01 

