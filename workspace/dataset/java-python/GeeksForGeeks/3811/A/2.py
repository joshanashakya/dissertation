

# Python3 program to find sum of all even 
# frequency elements in a Matrix 
import sys 
  
N = 3 # Rows 
M = 3 # Columns 
  
# Function to find sum of all even 
# frequency elements in a Matrix 
def sumOddOccuring(arr): 
  
    # Store frequencies of elements 
    # in matrix 
    mp = dict() 
    for i in range(N): 
        for j in range(M): 
            if arr[i][j] in mp: 
                mp[arr[i][j]] += 1
            else: 
                mp[arr[i][j]] = 1
  
    # Sum of even frequency elements 
    s = 0
    for i in mp: 
        if mp[i] % 2 == 0: 
            x = mp[i] 
            s += i * mp[i] 
  
    return s 
  
# Driver code 
if __name__ == "__main__": 
    mat = [[1, 2, 3], 
           [1, 3, 2], 
           [1, 5, 6]] 
  
    print(sumOddOccuring(mat)) 
  
# This code is contributed by 
# sanjeev2552 

