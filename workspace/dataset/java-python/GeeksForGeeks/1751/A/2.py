

# Python3 Program to determine  
# the number of unmarked  
# integers in a special sieve 
def countUnmarked(N): 
    if (N % 2 == 0): 
        return N / 2; 
    else: 
        return N / 2 + 1; 
  
# Driver Code 
N = 4; 
print("Number of unmarked elements:",  
              int(countUnmarked(N))); 
      
# This code is contributed 
# by mits 

