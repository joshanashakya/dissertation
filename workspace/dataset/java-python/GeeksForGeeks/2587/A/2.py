

# Python 3 program to find N-th term  
# in 1, 11, 55, 239, 991, ....  
  
# calculate Nth term of series 
def numberSequence(n) : 
  
    # calculates the N-th term  
    num = pow(4, n) - pow(2, n) - 1
  
    return num 
  
# Driver Code 
if __name__ == "__main__" : 
  
    n = 4
      
    print(numberSequence(n)) 
  
# This code is contributed by ANKITRAI1 

