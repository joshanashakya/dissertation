

# Python3 implementation of the approach  
from math import sqrt 
  
# Function to calculate the number of  
# square areas of size K*K  
def subgrids(N, Z, row, col, r, d) : 
      
    # Row array and column array to 
    # store the lengths of differences 
    # between consecutive rows/columns 
    conrow = []; 
    concol = []; 
      
    K = int(sqrt(Z)); 
      
    # Fill the conrow vector 
    conrow.append(row[0] - 0 - 1) 
    conrow.append(N + 1 - row[r - 1] - 1) 
      
    for i in range(1, r) : 
        conrow.append(row[i] - row[i - 1] - 1); 
          
    # Fill the concol vector 
    concol.append(col[0] - 0 - 1) 
    concol.append(N + 1 - col[d - 1] - 1) 
      
    for i in range(1, d) : 
        concol.append(col[i] - col[i - 1] - 1); 
          
    row_size = len(conrow) 
    col_size = len(concol) 
  
    # To store the required answer  
    answer = 0
      
    # Every pair of row size and column size 
    # would result in an unblocked region 
    for i in range(row_size) : 
        for j in range(col_size) : 
            total = (concol[j] // K) * \ 
                    (conrow[i] // K) 
            answer += (total) 
              
    return answer 
  
# Driver code  
if __name__ == "__main__" :  
  
    N = 8; Z = 4
    row = [ 4, 6 ] 
    col = [ 3, 8 ]  
    r = len(row) 
    d = len(col)  
  
    print(subgrids(N, Z, row, col, r, d)) 
  
# This code is contributed by AnkitRai01 

