

# Python 3 Program to demonstrate Circular Permutation   
  
# Function to find no. of permutations 
def Circular(n) : 
    Result = 1
  
    while n > 0 : 
        Result = Result * n 
        n -= 1
  
    return Result 
      
# Driver Code 
if __name__ == "__main__" : 
    n = 4
  
    # function calling 
    print(Circular(n-1)) 
  
# This code is contributed by ANKITRAI1 

