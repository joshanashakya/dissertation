

# Python3 program to find sum of all max 
# frequency elements in a Matrix 
import sys 
  
N = 3 # Rows 
M = 3 # Columns 
  
# Function to find sum of all max 
# frequency elements in a Matrix 
def sumMaxOccuring(arr): 
  
    # Store frequencies of elements 
    # in matrix 
    mp = dict() 
    for i in range(N): 
        for j in range(M): 
            if arr[i][j] in mp: 
                mp[arr[i][j]] += 1
            else: 
                mp[arr[i][j]] = 1
  
    # loop to iterate through map 
    # and find the maximum frequency 
    s = 0
    maxFreq = -sys.maxsize 
    for i in mp: 
        if mp[i] > maxFreq: 
            maxFreq = mp[i] 
  
    # Sum of maximum frequency elements 
    for i in mp: 
        if mp[i] == maxFreq: 
            s += i * mp[i] 
  
    return s 
  
# Driver code 
if __name__ == "__main__": 
    mat = [[1, 2, 3], 
           [1, 3, 2], 
           [1, 5, 6]] 
  
    print(sumMaxOccuring(mat)) 
  
# This code is contributed by 
# sanjeev2552 

