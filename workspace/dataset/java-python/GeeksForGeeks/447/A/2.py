

# Python3 program to find trace of matrix  
# formed by adding Row-major and 
# Column-major order of same matrix 
  
# Return the trace of sum of row-major  
# matrix and column-major matrix 
def trace(n, m): 
  
    A = [[0 for x in range(m)]  
            for y in range(n)]; 
    B = [[0 for x in range(m)]  
            for y in range(n)]; 
    C = [[0 for x in range(m)]  
            for y in range(n)];  
  
    # Generating the matrix A 
    cnt = 1; 
    for i in range(n): 
        for j in range(m): 
            A[i][j] = cnt; 
            cnt += 1; 
  
    # Generating the matrix A 
    cnt = 1; 
    for i in range(n): 
        for j in range(m): 
            B[j][i] = cnt; 
            cnt += 1; 
  
    # Finding sum of matrix A and matrix B 
    for i in range(n): 
        for j in range(m): 
            C[i][j] = A[i][j] + B[i][j];  
  
    # Finding the trace of matrix C. 
    sum = 0; 
    for i in range(n): 
        for j in range(m): 
            if (i == j): 
                sum += C[i][j]; 
  
    return sum; 
  
# Driver Code 
N = 3;  
M = 3; 
print(trace(N, M)); 
      
# This code is contributed by mits 

