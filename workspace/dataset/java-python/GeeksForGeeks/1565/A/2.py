

# Python3 program to count the number of 
# intervals in which a given value lies  
MAX_VAL = 200000
  
# Function to count the number of  
# intervals in which a given value lies  
def countIntervals(arr, V, N):  
      
    # Variables to store overall minimumimum  
    # and maximumimum of the intervals  
    minimum = float("inf") 
    maximum = 0
  
    # Frequency array to keep track of  
    # how many of the given intervals  
    # an element lies in  
    freq = [0] * (MAX_VAL)  
  
    for i in range(0, N): 
        li = arr[i][0]  
        freq[li] = freq[li] + 1
        ri = arr[i][1]  
        freq[ri + 1] = freq[ri + 1] - 1
  
        if li < minimum:  
            minimum = li  
          
        if ri > maximum: 
            maximum = ri  
          
    # Constructing the frequency array  
    for i in range(minimum, maximum + 1):  
        freq[i] = freq[i] + freq[i - 1]  
  
    return freq[V]  
      
# Driver Code 
if __name__ == "__main__": 
      
    arr = [[1, 10], [5, 10], [15, 25],  
           [7, 12], [20, 25]]  
  
    V = 7
  
    # length of the array  
    N = len(arr)  
  
    print(countIntervals(arr, V, N))  
  
# This code is contributed  
# by Rituraj Jain 

