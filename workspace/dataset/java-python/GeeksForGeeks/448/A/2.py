

# Python3 program to find trace  
# of matrix formed by adding 
# Row-major and Column-major  
# order of same matrix 
  
# Return sum of first n  
# integers of an AP 
def sn(n, an): 
    return (n * (1 + an)) / 2; 
  
# Return the trace of sum 
# of row-major matrix 
# and column-major matrix 
def trace(n, m): 
      
    # Finding nth element  
    # in AP in case of 
    # Row major matrix. 
    an = 1 + (n - 1) * (m + 1); 
      
    # Finding sum of first 
    # n integers of AP in 
    # case of Row major matrix 
    rowmajorSum = sn(n, an); 
      
    # Finding nth element in AP 
    # in case of Row major matrix 
    an = 1 + (n - 1) * (n + 1); 
      
    # Finding sum of first n  
    # integers of AP in case  
    # of Column major matrix 
    colmajorSum = sn(n, an); 
      
    return int(rowmajorSum + 
               colmajorSum); 
      
# Driver Code 
N = 3; 
M = 3; 
print(trace(N, M)); 
  
# This code is contributed mits 

