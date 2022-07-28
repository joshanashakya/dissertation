

# Python 3 implementation of 
# above approach 
  
# Function to find the number  
# of tiles  
def solve(M, N, s) : 
      
    # if breadth is divisible 
    # by side of square  
    if (N % s == 0) : 
          
        # tiles required is N/s  
        N = N // s 
          
    else : 
          
        # one more tile required  
        N = (N // s) + 1
  
    # if length is divisible by  
    # side of square  
    if (M % s == 0) : 
          
        # tiles required is M/s  
        M = M // s 
          
    else : 
          
        # one more tile required  
        M = (M // s) + 1
      
    return M * N  
  
# Driver Code  
if __name__ == "__main__" : 
      
    # input length and breadth of  
    # rectangle and side of square 
    N, M, s = 12, 13, 4
  
    print(solve(M, N, s)) 
              
# This code is contributed by ANKITRAI1 

