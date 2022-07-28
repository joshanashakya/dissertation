

# Python 3 program to find    
# N-th term of the series:    
      
    
# Function for calculating    
# Nth term of series    
def NthTerm(N) :    
      
    # return nth term  
    x = (3 * N*N)% 1000000009
    return ((x - N + 1000000009)% 1000000009)    
      
# Driver code    
if __name__ == "__main__" :    
          
    N = 4
      
    # Function Calling    
    print(NthTerm(N))  

