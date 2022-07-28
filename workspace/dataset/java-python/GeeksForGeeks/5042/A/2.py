

# Python3 implementation to find the maximum 
# number of edges for triangle free graph 
  
# Function to find the maximum number of 
# edges in a N-vertex graph. 
def solve(n): 
      
    # According to the Mantel's theorem 
    # the maximum number of edges will be 
    # floor of [(n^2)/4] 
    ans = (n * n // 4) 
  
    return ans 
  
# Driver Function 
if __name__ == '__main__': 
    n = 10
    print(solve(n)) 
  
# This code is contributed by mohit kumar 29 

