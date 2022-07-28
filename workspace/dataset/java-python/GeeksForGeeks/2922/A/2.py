

# Python3 program to find N-th  
# term of the series  
# 0, 6, 0, 12, 0, 90... 
  
# Function to return the Nth term  
def nthTerm(N) : 
  
    return (abs(N * ((N - 1) * (N - 3)  
           * (N - 5)))) 
  
# Driver code      
if __name__ == "__main__" : 
  
    N = 6
  
    # Function calling 
    print(nthTerm(N)) 
  
  
# This code is contributed by  
# ANKITRAI1 

