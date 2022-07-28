

# Python 3 Program to find the maximum  
# value in a matrix which contain  
# intersecting concentric submatrix 
MAXN = 100
  
# Return the maximum value in intersecting 
# concentric submatrix. 
def maxValue( n, m, x, y, a): 
  
    c = [[0 for x in range(MAXN)] 
            for y in range(MAXN)]  
  
    # For each center of concentric sub-matrix. 
    for i in range( m): 
  
        # for each row 
        for p in range(n) : 
  
            # for each column 
            for q in range( n) : 
  
                # finding x distance. 
                dx = abs(p - x[i]) 
  
                # finding y distance. 
                dy = abs(q - y[i]) 
  
                # maximum of x distance and y distance 
                d = max(dx, dy) 
  
                # assigning the value. 
                c[p][q] += max(0, a[i] - d) 
  
    # Finding the maximum value in 
    # the formed matrix. 
    res = 0
    for i in range(n) : 
        for j in range(n) : 
            res = max(res, c[i][j]) 
    return res 
  
# Driver Code 
if __name__ == "__main__": 
      
    n = 10
    m = 2
    x = [ 3, 7 ] 
    y = [ 3, 7 ] 
    a = [ 4, 3 ] 
  
    print(maxValue(n, m, x, y, a)) 
  
# This code is contributed by ita_c 

